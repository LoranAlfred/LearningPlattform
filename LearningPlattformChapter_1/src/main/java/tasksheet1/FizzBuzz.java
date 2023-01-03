package tasksheet1;

/**
 * This class is the class for the task FizzBuzz.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class FizzBuzz {

    /**
     * Run - method.
     *
     * @param arguments The arguments may set.
     * @since 1.0
     */
    public static void main ( String[] arguments ) {
        for ( int currentValue = 1; currentValue <= 100; currentValue++ ) {
            if ( ( currentValue % 5 == 0 ) && ( currentValue % 7 == 0 ) ) {
                System.out.println ( "Fizz Buzz" );
            } else if ( currentValue % 7 == 0 ) {
                System.out.println ( "Buzz" );
            } else if ( currentValue % 5 == 0 ) {
                System.out.println ( "Fizz" );
            } else {
                System.out.println ( currentValue );
            }
        }
    }
}