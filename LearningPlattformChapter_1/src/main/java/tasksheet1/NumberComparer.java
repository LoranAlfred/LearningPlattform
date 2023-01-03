package tasksheet1;

import java.util.Scanner;


/**
 * This class represents a number comparer.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class NumberComparer {

    /**
     * Run method.
     *
     * @param arguments The arguments may set.
     * @since 1.0
     */
    public static void main ( String[] arguments ) {
        int firstNumber = inputNumber ();
        int secondNumber = inputNumber ();

        if ( firstNumber == secondNumber ) {
            System.out.println ( "The numbers are equal!" );
        } else {
            if ( firstNumber > secondNumber ) {
                System.out.println ( "The number " + firstNumber + " is larger than " + secondNumber + "!" );
            } else {
                System.out.println ( "The number " + secondNumber + " is larger than " + firstNumber + "!" );
            }
        }
    }

    /**
     * Returns the input number.
     *
     * @return The input number.
     * @since 1.0
     */
    public static int inputNumber () {
        try {
            Scanner scanner = new Scanner ( System.in );
            System.out.print ( "Type a number: " );
            return scanner.nextInt ();
        } catch ( Exception exception ) {
            System.out.println ( exception );
        }
        return -1;
    }

}