package tasksheet1;

/**
 * This class represents the task for two digit arithmetic operators.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class TwoDigitArithmeticOperators {

    /**
     * Run method.
     *
     * @param args The arguments may set.
     * @since 1.0
     */
    public static void main ( String[] args ) {

        System.out.println ( "Division of 10 by 12: " + ( 10 / 12 ) );
        System.out.println ( "Division of 10. by 12: " + ( 10. / 12 ) );
        System.out.println ( "Division of 10 by 12.: " + ( 10 / 12. ) );

        int integerNumber;

        float floatNumber = 1.5f, secondFloatNumber;

        integerNumber = 10 * ( int ) floatNumber;
        secondFloatNumber = 10 * floatNumber;
        System.out.println ( "Multiplication (int)1.5f * 10: " + integerNumber );
        System.out.println ( "Multiplication 1.5f * 10: " + secondFloatNumber );
    }
}