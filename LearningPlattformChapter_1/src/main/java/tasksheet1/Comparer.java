package tasksheet1;

/**
 * This class represents a comparer.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class Comparer {

    /**
     * Compares two number.
     *
     * @param firstNumber  The first number to compare to set.
     * @param secondNumber The second number to compare to set.
     * @since 1.0
     */
    private static void compare ( int firstNumber, int secondNumber ) {
        if ( firstNumber > secondNumber ) {
            System.out.println ( "The first number is larger" );
        } else if ( firstNumber < secondNumber ) {
            System.out.println ( "The second number is larger" );
        } else {
            System.out.println ( "The numbers are equal" );
        }
    }

    /**
     * Run method.
     *
     * @param arguments The arguments may set.
     * @since 1.0
     */
    public static void main ( String[] arguments ) {
        int firstNumber = 4;
        int secondNumber = 4;
        compare ( firstNumber,secondNumber );
    }
}