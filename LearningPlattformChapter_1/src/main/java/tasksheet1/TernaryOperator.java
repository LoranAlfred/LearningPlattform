package tasksheet1;

/**
 * Class that shows the usage of the ternary operator.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class TernaryOperator {

    /**
     * Run method.
     *
     * @param args The arguments may set.
     * @since 1.0
     */
    public static void main ( String[] args ) {
        int firstNumber = 5;
        int secondNumber = 7;
        int thirdNumber = ( firstNumber == secondNumber ) ? 1 : 0;
        System.out.println ( thirdNumber );
    }
}