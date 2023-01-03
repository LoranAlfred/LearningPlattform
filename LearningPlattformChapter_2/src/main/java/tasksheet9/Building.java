package tasksheet9;

import java.util.StringJoiner;


/**
 * This class represents a building.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class Building {

    private String name;

    private Address address;

    /**
     * Constructor.
     *
     * @param name    The name to set.
     * @param address The address to set.
     * @since 1.0
     */
    public Building ( String name, Address address ) {
        this.name = name;
        this.address = address;
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
    public Building ( String name, String street, int houseNumber, String postalCode, String town ) {
        this.name = name;
        this.address = new Address ( street, houseNumber, postalCode, town );
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public Address getAddress () {
        return address;
    }

    public void setAddress ( Address address ) {
        this.address = address;
    }

    @Override
    public String toString () {
        return new StringJoiner ( "" )
                        .add ( name )
                        .add ( "\n" )
                        .add ( address.toString () )
                        .toString ();
    }
}
