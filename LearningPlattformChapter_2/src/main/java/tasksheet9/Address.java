package tasksheet9;

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

    @Override
    public String toString () {
        StringJoiner stringJoiner = new StringJoiner ( "" );
        stringJoiner.add ( street ).add ( " " ).add ( "" + houseNumber ).add ( "\n" ).add ( postalCode ).add ( " " ).add ( town );
        return stringJoiner.toString ();
    }
}
