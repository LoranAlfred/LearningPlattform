package tasksheet11.address;

import java.util.StringJoiner;


/**
 * This class represents an address.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class Address {

    private String street;

    private int houseNumber;

    private String postalCode;

    private String town;

    /**
     * Constructor.
     *
     * @param street      The street to set.
     * @param houseNumber The house number to set.
     * @param postalCode  The postal code to set.
     * @param town        The town to set.
     * @since 1.0
     */
    public Address ( String street, int houseNumber, String postalCode, String town ) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.postalCode = postalCode;
        this.town = town;
    }

    public String getStreet () {
        return street;
    }

    public void setStreet ( String street ) {
        this.street = street;
    }

    public int getHouseNumber () {
        return houseNumber;
    }

    public void setHouseNumber ( int houseNumber ) {
        this.houseNumber = houseNumber;
    }

    public String getPostalCode () {
        return postalCode;
    }

    public void setPostalCode ( String postalCode ) {
        this.postalCode = postalCode;
    }

    public String getTown () {
        return town;
    }

    public void setTown ( String town ) {
        this.town = town;
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
                        .add ( street + " " )
                        .add ( "" + houseNumber )
                        .add ( "\n" + postalCode + " " )
                        .add ( town )
                        .toString ();
    }
}
