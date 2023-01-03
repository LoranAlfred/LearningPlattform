package tasksheet4;

/**
 * This class represents the name validator.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class NameValidator {

    /**
     * Verifies if the first name is valid or not.
     *
     * @param firstNameToCheck The first name to check.
     * @return <code>true</code> The first name is valid.<br><code>false</code> The first name is valid.
     * @since 1.0
     */
    public static boolean firstNameIsValid ( String firstNameToCheck ) {
        if ( firstNameToCheck == null ) {
            return false;
        } else if ( firstNameToCheck.length () < 3 ) {
            return false;
        }
        return true;
    }

    /**
     * Verifies if the first name is valid or not.
     *
     * @param lastNameToCheck The last name to check.
     * @return <code>true</code> The last name is valid.<br><code>false</code> The last name is valid.
     * @since 1.0
     */
    public static boolean lastNameIsValid ( String lastNameToCheck ) {
        if ( lastNameToCheck == null ) {
            return false;
        } else if ( lastNameToCheck.length () < 3 ) {
            return false;
        }
        return true;
    }

}
