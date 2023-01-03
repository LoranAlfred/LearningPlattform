package tasksheet11.professor;

import tasksheet11.address.Address;
import tasksheet11.lecture.Lecture;
import tasksheet11.name.Name;

import java.util.StringJoiner;


/**
 * This class represents a professor.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class Professor {

    private Name professorName;

    private Address professorAddress;

    private Lecture lecture;

    /**
     * Constructor.
     *
     * @param firstName The first name to set.
     * @param lastName  The last name to set.
     * @since 1.0
     */
    public Professor ( String firstName, String lastName ) {
        this.professorName = new Name ( firstName, lastName );
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
    public Professor ( String firstName, String lastName, String street, int houseNumber, String postalCode, String town ) {
        this ( firstName, lastName );
        this.professorAddress = new Address ( street, houseNumber, postalCode, town );
    }

    public Name getProfessorName () {
        return professorName;
    }

    public void setProfessorName ( Name professorName ) {
        this.professorName = professorName;
    }

    public Address getProfessorAddress () {
        return professorAddress;
    }

    public void setProfessorAddress ( Address professorAddress ) {
        this.professorAddress = professorAddress;
    }

    private Lecture getLecture () {
        return lecture;
    }

    private void setLecture ( Lecture lecture ) {
        this.lecture = lecture;
    }

    /**
     * Adds a {@link Lecture} to add.
     *
     * @param lectureToAdd The {@link Lecture} to add.
     * @since 1.0
     */
    public void addLecture ( Lecture lectureToAdd ) {
        lectureToAdd.setProfessorHoldingTheLecture ( this );
        setLecture ( lectureToAdd );
    }

    /**
     * Removes the {@link Lecture}.
     *
     * @param lectureToRemove The {@link Lecture} to remove.
     * @since 1.0
     */
    public void removeLecture ( Lecture lectureToRemove ) {
        if ( lectureToRemove.equals ( getLecture () ) ) {
            lectureToRemove.setProfessorHoldingTheLecture ( null );
            setLecture ( null );
        } else {
            System.out.println ( "This professor does not hold this lecture!" );
        }
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
        stringJoiner.add ( "Professor: " ).add ( getProfessorName ().toString () ).add ( "\n" ).add ( getProfessorAddress ().toString () )
                        .add ( "\n\nLecture hold from professor: " ).add ( getLecture ().getLectureName () );
        return stringJoiner.toString ();
    }
}
