package tasksheet1;

/**
 * This class is the clas for the task allocation operator
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class AllocationOperator {

    /**
     * Run method.
     *
     * @param arguments The arguments may set.
     * @since 1.0
     */
    public static void main ( String[] arguments ) {
        int firstNumber = 39;
        int secondNumber = 5;
        while ( firstNumber >= secondNumber ) {
            firstNumber -= secondNumber;
        }
        System.out.println ( "??????? is: " + firstNumber );
    }
}
