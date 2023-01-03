package tasksheet1;

/**
 * This class represents the output.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class Output {

    /**
     * Shows the output with the help of a for loop
     *
     * @param countUntilHere The number to which should be count.
     * @since 1.0
     */
    private static void outputWithForLoop ( int countUntilHere ) {
        System.out.println ( "Output from for-loop" );
        for ( int counter = 0; counter < countUntilHere; counter++ ) {
            System.out.println ( counter );
        }
    }

    /**
     * Shows the output with the help of a while loop
     *
     * @param countUntilHere The number to which should be count.
     * @since 1.0
     */
    private static void outputWithWhileLoop ( int countUntilHere ) {
        System.out.println ( "Output from while-loop" );
        int counter = 0;
        while ( counter < countUntilHere ) {
            System.out.println ( counter );
            counter++;
        }
    }

    /**
     * Shows the output with the help of a do-while loop
     *
     * @param countUntilHere The number to which should be count.
     * @since 1.0
     */
    private static void outputWithDoWhileLoop ( int countUntilHere ) {
        System.out.println ( "Output from do-while-loop" );
        int counter = 0;
        do {
            System.out.println ( counter );
            counter++;
        } while ( counter < countUntilHere );
    }

    /**
     * Run method.
     *
     * @param arguments The arguments may set.
     * @since 1.0
     */
    public static void main ( String[] arguments ) {
        outputWithForLoop ( 10 );
        outputWithWhileLoop ( 10 );
        outputWithDoWhileLoop ( 10 );
    }
}