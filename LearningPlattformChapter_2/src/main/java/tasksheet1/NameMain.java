package tasksheet1;

/**
 * This class is the sample class to run the program.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class NameMain {

    /**
     * Main - method.
     *
     * @param args The arguments may set.
     * @since 1.0
     */
    public static void main ( String[] args ) {
        Name firstNameObject = new Name ( "Alfred", "Loran" );
        Name secondNameObject = new Name ( "Sebastian", "Littau" );
        System.out.println ( firstNameObject.getObjectValuesToShowOnConsole () );
        System.out.println ();
        System.out.println ( secondNameObject.getObjectValuesToShowOnConsole () );
    }
}