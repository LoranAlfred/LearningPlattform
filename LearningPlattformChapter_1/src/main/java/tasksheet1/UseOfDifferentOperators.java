package tasksheet1;

/**
 * Class for the task usage of different operators
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class UseOfDifferentOperators {

    /**
     * Run method.
     *
     * @param arguments The arguments may set.
     * @since 1.0
     */
    public static void main ( String[] arguments ) {
        System.out.println ( "First number has value " + methodA () );
        System.out.println ( "First number has value " + methodB () );
        System.out.println ( "First number has value " + methodC () );
        System.out.println ( "First number has value " + methodD () );
        System.out.println ( "Second number has value " + methodE () );
        System.out.println ( "First number has value " + methodF () );
        System.out.println ( "Second number has value " + methodG () );
        System.out.println ( "Second number has value " + methodH () );
        System.out.println ( "First number has value " + methodI () );
        System.out.println ( "Second number has value " + methodJ () );
        System.out.println ( "First number has value " + methodK () );
        System.out.println ( "First number has value " + methodL () );
        System.out.println ( "First number has value " + methodM () );
    }

    /**
     * Method representing task A.
     *
     * @return The first number.
     * @since 1.0
     */
    private static int methodA () {
        int firstNumber = 2;
        int secondNumber = 1;
        firstNumber = secondNumber = 2;
        return firstNumber;
    }

    /**
     * Method representing task B.
     *
     * @return The first number.
     * @since 1.0
     */
    private static int methodB () {
        int firstNumber = 2;
        int secondNumber = 1;
        firstNumber = secondNumber * 3 + 2;
        return firstNumber;
    }

    /**
     * Method representing task C.
     *
     * @return The first number.
     * @since 1.0
     */
    private static int methodC () {
        int firstNumber = 2;
        int secondNumber = 1;
        firstNumber = secondNumber * ( 3 + 2 );
        return firstNumber;
    }

    /**
     * Method representing task D.
     *
     * @return The first number.
     * @since 1.0
     */
    private static int methodD () {
        int firstNumber = 2;
        int secondNumber = 1;
        firstNumber *= secondNumber + 5;
        return firstNumber;
    }

    /**
     * Method representing task E.
     *
     * @return The second number.
     * @since 1.0
     */
    private static int methodE () {
        int firstNumber = 2;
        int secondNumber = 1;
        secondNumber %= 2 * firstNumber;
        return secondNumber;
    }

    /**
     * Method representing task F.
     *
     * @return The first number.
     * @since 1.0
     */
    private static int methodF () {
        int firstNumber = 2;
        int secondNumber = 1;
        firstNumber = --secondNumber;
        return firstNumber;
    }

    /**
     * Method representing task G.
     *
     * @return The second number.
     * @since 1.0
     */
    private static int methodG () {
        int firstNumber = 2;
        int secondNumber = 1;
        secondNumber = ~firstNumber;
        return secondNumber;
    }

    /**
     * Method representing task H.
     *
     * @return The second number.
     * @since 1.0
     */
    private static int methodH () {
        int firstNumber = 2;
        int secondNumber = 1;
        secondNumber = secondNumber++ * firstNumber;
        return secondNumber;
    }

    /**
     * Method representing task I.
     *
     * @return The first number.
     * @since 1.0
     */
    private static int methodI () {
        int firstNumber = 2;
        int secondNumber = 1;
        firstNumber = -5 - 5;
        return firstNumber;
    }

    /**
     * Method representing task J.
     *
     * @return The second number.
     * @since 1.0
     */
    private static int methodJ () {
        int firstNumber = 2;
        int secondNumber = 1;
        secondNumber = secondNumber << 2;
        return secondNumber;
    }

    /**
     * Method representing task K.
     *
     * @return The first number.
     * @since 1.0
     */
    private static int methodK () {
        int firstNumber = 2;
        int secondNumber = 1;
        firstNumber = ( firstNumber == secondNumber ) ? 5 : 7;
        return firstNumber;
    }

    /**
     * Method representing task L.
     *
     * @return The first number.
     * @since 1.0
     */
    private static int methodL () {
        int firstNumber = 2;
        int secondNumber = 1;
        firstNumber = --secondNumber * secondNumber++;
        return firstNumber;
    }

    /**
     * Method representing task M.
     *
     * @return The first number.
     * @since 1.0
     */
    private static int methodM () {
        int firstNumber = 2;
        int secondNumber = 1;
        firstNumber = firstNumber ^ secondNumber;
        return firstNumber;
    }

}