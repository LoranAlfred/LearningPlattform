package tasksheet1;

/**
 * This class is the sample for task square simplified.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class SquareSimplified {

    /**
     * Main method.
     *
     * @param arguments The arguments may set.
     * @since 1.0
     */
    public static void main ( String[] arguments ) {
        for ( int currentIndex = 0; currentIndex < 20; currentIndex++ ) {
            System.out.print ( "*" );
        }

        System.out.println ();
        for ( int currentIndex = 0; currentIndex < 8; currentIndex++ ) {
            System.out.println ( "*                  *" );
        }

        for ( int currentIndex = 0; currentIndex < 20; currentIndex++ ) {
            System.out.print ( "*" );
        }
    }
}