package tasksheet9;

/**
 * This class represents a house.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class House extends Building {

    /**
     * Constructor.
     *
     * @param name    The name to set
     * @param address The {@link Address} to set
     * @since 1.0
     */
    public House ( String name, Address address ) {
        super ( name, address );
    }

    /**
     * Constructor.
     *
     * @param name        The name to set.
     * @param street      The street to set.
     * @param houseNumber The house number to set.
     * @param postalCode  The postal code to set.
     * @param town        The town to set.
     * @since 1.0
     */
    public House ( String name, String street, int houseNumber, String postalCode, String town ) {
        super ( name, street, houseNumber, postalCode, town );
    }

    @Override
    public String toString () {
        return super.toString ();
    }
}
