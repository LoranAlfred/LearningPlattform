package tasksheet11.lecture;

import tasksheet11.professor.Professor;
import tasksheet11.student.Student;

import java.util.StringJoiner;


/**
 * This class represents a lecture.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class Lecture {

    private String lectureName;

    private Professor professorHoldingTheLecture;

    private Student[] studentsInLecture;

    /**
     * Constructor.
     *
     * @param lectureName The lecture name to set.
     * @since 1.0
     */
    public Lecture ( String lectureName ) {
        this.lectureName = lectureName;
        this.studentsInLecture = new Student[ 20 ];
    }

    /**
     * Constructor.
     *
     * @param lectureName             The lecture name to set.
     * @param professorHoldingLecture The {@link Professor} holding {@link Lecture} to set.
     * @since 1.0
     */
    public Lecture ( String lectureName, Professor professorHoldingLecture ) {
        this ( lectureName );
        this.professorHoldingTheLecture = professorHoldingLecture;
    }

    public String getLectureName () {
        return lectureName;
    }

    public void setLectureName ( String lectureName ) {
        this.lectureName = lectureName;
    }

    public Professor getProfessorHoldingTheLecture () {
        return professorHoldingTheLecture;
    }

    public void setProfessorHoldingTheLecture ( Professor professorHoldingTheLecture ) {
        this.professorHoldingTheLecture = professorHoldingTheLecture;
    }

    /**
     * Adds a {@link Student} to lecture.
     *
     * @param studentToAddToLecture The {@link Student} to add to set.
     * @since 1.0
     */
    public void addStudentToLecture ( Student studentToAddToLecture ) {
        if ( studentIsAlreadyVisitingLecture ( studentToAddToLecture ) ) {
            System.out.println ( "The given student is already visiting this lecture!" );
        } else {
            addStudentenToLectureArray ( studentToAddToLecture );
        }
    }

    /**
     * Verifies if the given {@link Student} is already visiting this {@link Lecture}.
     *
     * @param studentToAddToLecture The {@link Student} to add to set.
     * @return <code>true</code> The {@link Student} is already visiting this lecture.<br><code>false</code> The {@link Student} is not visiting this lecture.
     * @since 1.0
     */
    private boolean studentIsAlreadyVisitingLecture ( Student studentToAddToLecture ) {
        for ( int studentIndex = 0; studentIndex < studentsInLecture.length; studentIndex++ ) {
            if ( studentsInLecture[ studentIndex ] != null ) {
                if ( studentsInLecture.equals ( studentsInLecture[ studentIndex ] ) ) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Adds a {@link Student} to the lecture.
     *
     * @param studentToAddToLecture The {@link Student} to the lecture.
     * @since 1.0
     */
    private void addStudentenToLectureArray ( Student studentToAddToLecture ) {
        for ( int studentIndex = 0; studentIndex < studentsInLecture.length; studentIndex++ ) {

            if ( studentsInLecture[ studentIndex ] == null ) {
                studentsInLecture[ studentIndex ] = studentToAddToLecture;
                return;
            }
        }
    }

    /**
     * Removes a {@link Student} from the lecture.
     *
     * @param studentToRemoveFromLecture The {@link Student} to remove to set.
     * @since 1.0
     */
    public void removeStudentFromLecture ( Student studentToRemoveFromLecture ) {
        if ( studentIsAlreadyVisitingLecture ( studentToRemoveFromLecture ) ) {
            removeStudentFromArray ( studentToRemoveFromLecture );
        } else {
            System.out.println ( "The given student is not visiting this lecture!" );
        }
    }

    /**
     * Removes the given {@link Student} from the array.
     *
     * @param studentToRemove The {@link Student} to remove to set.
     * @since 1.0
     */
    private void removeStudentFromArray ( Student studentToRemove ) {
        for ( int studentIndex = 0; studentIndex < studentsInLecture.length; studentIndex++ ) {
            if ( studentsInLecture[ studentIndex ] != null ) {
                if ( studentToRemove.equals ( studentsInLecture[ studentIndex ] ) ) {
                    studentsInLecture[ studentIndex ] = null;
                }
            }
        }
        readjustArray ();
    }

    /**
     * Readjusting the array.
     *
     * @since 1.0
     */
    private void readjustArray () {
        Student[] newStudentArray = new Student[ studentsInLecture.length ];
        int newLectureIndex = 0;
        for ( int studentIndex = 0; studentIndex < studentsInLecture.length; studentIndex++ ) {
            if ( studentsInLecture[ studentIndex ] != null ) {
                newStudentArray[ newLectureIndex ] = studentsInLecture[ studentIndex ];
                newLectureIndex++;
            }
        }
        this.studentsInLecture = newStudentArray;
    }

    /**
     * Determines how many students are currently in the lecture.
     *
     * @return The amount of {@link Student}s in this lecture.
     * @since 1.0
     */
    private int amountOfStudentsInLecture () {
        int amountOfStudentsInLecture = 0;
        for ( int studentsInLectureIndex = 0; studentsInLectureIndex < studentsInLecture.length; studentsInLectureIndex++ ) {
            if ( studentsInLecture[ studentsInLectureIndex ] != null ) {
                amountOfStudentsInLecture++;
            }
        }
        return amountOfStudentsInLecture;
    }

    /**
     * Returns the values of the object.
     *
     * @return The values of the object.
     * @since 1.0
     */
    @Override
    public String toString () {
        StringJoiner stringJoiner = new StringJoiner ( "" );
        stringJoiner.add ( "Lesson " ).add ( getLectureName () ).add ( " is hold by professor " )
                        .add ( getProfessorHoldingTheLecture ().getProfessorName ().toString () );
        stringJoiner.add ( "\nCurrently the following students attend the lecture:\n\n" );
        for ( int currentStudentsIndex = 0; currentStudentsIndex < studentsInLecture.length; currentStudentsIndex++ ) {
            if ( studentsInLecture[ currentStudentsIndex ] != null ) {
                stringJoiner.add ( studentsInLecture[ currentStudentsIndex ].getMatriculationNumber () ).add ( "\t" )
                                .add ( studentsInLecture[ currentStudentsIndex ].getStudentName ().getFirstName () ).add ( " " )
                                .add ( studentsInLecture[ currentStudentsIndex ].getStudentName ().getLastName () ).add ( "\n" );
            }
        }
        return stringJoiner.toString ();
    }
}
