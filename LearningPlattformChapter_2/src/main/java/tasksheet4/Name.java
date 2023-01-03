package tasksheet4;

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
        setFirstName ( firstName );
        setLastName ( lastName );
    }

    public String getFirstName () {
        return firstName;
    }

    public void setFirstName ( String firstName ) {
        if ( NameValidator.firstNameIsValid ( firstName ) ) {
            this.firstName = firstName;
        } else {
            System.err.println ( "The first name has to be at least 3 characters long or not null!" );
        }
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName ( String lastName ) {
        if ( NameValidator.lastNameIsValid ( lastName ) ) {
            this.lastName = lastName;
        } else {
            System.err.println ( "The last name has to be at least 3 characters long or not null!" );
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
        if ( this.firstName == null || this.lastName == null ) {
            return "No values available!";
        } else {
            return this.firstName + ' ' + this.lastName;
        }
    }
}
