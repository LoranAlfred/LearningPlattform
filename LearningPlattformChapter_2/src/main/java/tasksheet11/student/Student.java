package tasksheet11.student;

import tasksheet11.address.Address;
import tasksheet11.lecture.Lecture;
import tasksheet11.name.Name;

import java.util.StringJoiner;
import java.util.UUID;


/**
 * This class represents a student.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class Student {

    private Name studentName;

    private Address studentAddress;

    private UUID matriculationNumber;

    private Lecture[] lectures;

    /**
     * Constructor.
     *
     * @param firstName The first name to set.
     * @param lastName  The last name to set.
     * @since 1.0
     */
    public Student ( String firstName, String lastName ) {
        this.matriculationNumber = UUID.randomUUID ();
        this.lectures = new Lecture[ 10 ];
        studentName = new Name ( firstName, lastName );
    }

    /**
     * Constructor.
     *
     * @param firstName   The first name to set.
     * @param lastName    The last name to set.
     * @param street      The street to set.
     * @param houseNumber The house number to set.
     * @param postalCode  The postal code to set.
     * @param town        The town to set.
     * @since 1.0
     */
    public Student ( String firstName, String lastName, String street, int houseNumber, String postalCode, String town ) {
        this ( firstName, lastName );
        this.studentAddress = new Address ( street, houseNumber, postalCode, town );
    }

    public Name getStudentName () {
        return studentName;
    }

    public void setStudentName ( Name studentName ) {
        this.studentName = studentName;
    }

    public Address getStudentAddress () {
        return studentAddress;
    }

    public void setStudentAddress ( Address studentAddress ) {
        this.studentAddress = studentAddress;
    }

    public Lecture[] getLectures () {
        return lectures;
    }

    public String getMatriculationNumber () {
        return matriculationNumber.toString ();
    }

    /**
     * Adds a {@link Lecture} to student.
     *
     * @param lectureToAdd The {@link Lecture} to add.
     * @since 1.0
     */
    public void addLectureToStudent ( Lecture lectureToAdd ) {
        if ( lectureIsAlreadyVisited ( lectureToAdd ) ) {
            System.out.println ( "You are already visiting this lecture." );
        } else {
            addLectureToVisitedLecture ( lectureToAdd );
            lectureToAdd.addStudentToLecture ( this );
        }
    }

    /**
     * Verifies if a {@link Lecture} is already visited or not.
     *
     * @param lectureToAdd The {@link Lecture} to add.
     * @return <code>true</code> The {@link Lecture} is already visited.<br><code>false</code> The {@link Lecture} is not yet visited.
     * @since 1.0
     */
    private boolean lectureIsAlreadyVisited ( Lecture lectureToAdd ) {
        for ( int lectureIndex = 0; lectureIndex < lectures.length; lectureIndex++ ) {
            if ( lectures[ lectureIndex ] != null ) {
                if ( lectureToAdd.equals ( lectures[ lectureIndex ] ) ) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Adds a {@link Lecture} to the {@link Lecture} array.
     *
     * @param lectureToAdd The {@link Lecture} to add.
     * @since 1.0
     */
    private void addLectureToVisitedLecture ( Lecture lectureToAdd ) {
        for ( int lectureIndex = 0; lectureIndex < lectures.length; lectureIndex++ ) {
            if ( lectures[ lectureIndex ] == null ) {
                lectures[ lectureIndex ] = lectureToAdd;
                return;
            }
        }
    }

    public void removeLecutureFromStudent ( Lecture lectureToRemove ) {
        if ( lectureIsAlreadyVisited ( lectureToRemove ) ) {
            removeLectureFromVisitedLectures ( lectureToRemove );
        } else {
            System.out.println ( "The lecture is not visited!" );
        }
    }

    /**
     * Remove a {@link Lecture} from the students.
     *
     * @param lectureToRemove The {@link Lecture} to remove.
     * @since 1.0
     */
    private void removeLectureFromVisitedLectures ( Lecture lectureToRemove ) {
        for ( int lectureIndex = 0; lectureIndex < lectures.length; lectureIndex++ ) {
            if ( lectures[ lectureIndex ] != null ) {
                if ( lectureToRemove.equals ( lectures[ lectureIndex ] ) ) {
                    lectures[ lectureIndex ] = null;
                }
            }
        }
        restructuringArray ();
    }

    /**
     * Restructuring the array.
     *
     * @since 1.0
     */
    private void restructuringArray () {
        Lecture[] newLecturesArray = new Lecture[ lectures.length ];
        int newLectureIndex = 0;
        for ( int lectureIndex = 0; lectureIndex < lectures.length; lectureIndex++ ) {
            if ( lectures[ lectureIndex ] != null ) {
                newLecturesArray[ newLectureIndex ] = lectures[ lectureIndex ];
                newLectureIndex++;
            }
        }
        this.lectures = newLecturesArray;
    }

    @Override
    public String toString () {
        StringJoiner stringJoiner = new StringJoiner ( "" );
        stringJoiner.add ( "Matriculation number: " ).add ( getMatriculationNumber () ).add ( "\n" ).add ( getStudentName ().toString () ).add ( "\n" )
                        .add ( getStudentAddress ().toString () ).add ( "\n\nVisited lectures: \n" );
        for ( int lectureIndex = 0; lectureIndex < lectures.length; lectureIndex++ ) {
            if ( lectures[ lectureIndex ] != null ) {
                stringJoiner.add ( lectures[ lectureIndex ].getLectureName () ).add ( "\n" );
            }
        }
        return stringJoiner.toString ();
    }
}