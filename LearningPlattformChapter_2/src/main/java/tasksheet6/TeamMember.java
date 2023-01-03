package tasksheet6;

import java.util.Objects;
import java.util.StringJoiner;


/**
 * This class represents a team member.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class TeamMember {

    private String firstName;

    private String lastName;

    private float salary;

    /**
     * Constructor.
     *
     * @param firstName The first name to set.
     * @param lastName  The last name to set.
     * @param salary    The salary to set.
     * @since 1.0
     */
    public TeamMember ( String firstName, String lastName, float salary ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName () {
        return firstName;
    }

    public void setFirstName ( String firstName ) {
        this.firstName = firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName ( String lastName ) {
        this.lastName = lastName;
    }

    public float getSalary () {
        return salary;
    }

    public void setSalary ( float salary ) {
        this.salary = salary;
    }

    /**
     * Returns the values of the object.
     *
     * @return The values of the object.
     * @since 1.0
     */
    @Override public String toString () {
        StringJoiner stringJoiner = new StringJoiner ( "" );
        stringJoiner.add ( "Team member: " ).add ( this.firstName ).add ( " " ).add ( this.lastName ).add ( "\nSalaray: " ).add ( "" + this.salary ).add ( " €" )
                        .add ( "\n" );
        return stringJoiner.toString ();
    }

    /**
     * Verifies if two {@link TeamMember}s are equal or not.
     *
     * @param objectToCheck The {@link TeamMember} to check.
     * @return <code>true</code> {@link TeamMember}s are equal.<br><code>false</code> {@link TeamMember}s are not equal.
     * @since 1.0
     */
    @Override
    public boolean equals ( Object objectToCheck ) {
        if ( this == objectToCheck )
            return true;
        if ( objectToCheck == null || getClass () != objectToCheck.getClass () )
            return false;
        TeamMember that = ( TeamMember ) objectToCheck;
        return Float.compare ( that.salary, salary ) == 0 && Objects.equals ( firstName, that.firstName ) && Objects.equals ( lastName, that.lastName );
    }

    /**
     * Returns the generated hash code.
     *
     * @return The generated hash code.
     * @since 1.0
     */
    @Override
    public int hashCode () {
        return Objects.hash ( firstName, lastName, salary );
    }
}
