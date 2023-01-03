package tasksheet2;

/**
 * This class is the sample class to run the code.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class AddressMain {

    /**
     * Main method.
     *
     * @param args The arguments may set.
     * @since 1.0
     */
    public static void main ( String[] args ) {
        Address firstAddressObject = new Address ( "Some street", 1, "12345", "Town" );
        Address secondAddressObject = new Address ( "Another street", 1, "54321", "Another town" );
        System.out.println ( firstAddressObject.getObjectValuesToShowOnConsole () );
        System.out.println ();
        System.out.println ( secondAddressObject.getObjectValuesToShowOnConsole () );
    }
}
