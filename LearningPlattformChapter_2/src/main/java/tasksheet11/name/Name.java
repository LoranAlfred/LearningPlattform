package tasksheet11.name;

import java.util.StringJoiner;


/**
 * This class represents a name.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class Name {

    private String firstName;

    private String lastName;

    /**
     * Constructor.
     *
     * @param firstName The first name to set.
     * @param lastName  The last name to set.
     * @since 1.0
     */
    public Name ( String firstName, String lastName ) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    /**
     * Returns the values of the object.
     *
     * @return The values of the object.
     * @since 1.0
     */
    @Override
    public String toString () {
        return new StringJoiner ( "" )
                        .add ( firstName + " " )
                        .add ( lastName )
                        .toString ();
    }
}
