package tasksheet1;

/**
 * This class is the class for task arithmetic average with loops.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class ArithmeticAverageWithLoops {

    /**
     * Run - method.
     *
     * @param arguments The arguments may set.
     * @since 1.0
     */
    public static void main ( String[] arguments ) {
        int maximumStepsToCount = 10;
        System.out.println ( "The arithmetic average is: " + arithmeticAverageWithForLoop ( maximumStepsToCount ) );
        System.out.println ( "The arithmetic average is: " + arithmeticAverageWithWhileLoop ( maximumStepsToCount ) );
        System.out.println ( "The arithmetic average is: " + arithmeticAverageWithDoWhileLoop ( maximumStepsToCount ) );
    }

    /**
     * Method which determines the arithmetic average by using a for loop.
     *
     * @param maximumStepsToCountForLoop The maximum steps to count to.
     * @return The arithmetic average.
     * @since 1.0
     */
    private static double arithmeticAverageWithForLoop ( int maximumStepsToCountForLoop ) {
        double sum = 0;
        for ( int currentStep = 0; currentStep < maximumStepsToCountForLoop; currentStep++ ) {
            sum += currentStep;
        }
        return sum / maximumStepsToCountForLoop;
    }

    /**
     * Method which determines the arithmetic average by using a while loop.
     *
     * @param maximumStepsToCountWhileLoop The maximum steps to count to.
     * @return The arithmetic average.
     * @since 1.0
     */
    private static double arithmeticAverageWithWhileLoop ( int maximumStepsToCountWhileLoop ) {
        double sum = 0;
        int currentStep = 0;
        while ( currentStep < maximumStepsToCountWhileLoop ) {
            sum += currentStep;
            currentStep++;
        }
        return sum / maximumStepsToCountWhileLoop;
    }

    private static double arithmeticAverageWithDoWhileLoop ( int maximumStepsToCountDoWhileLoop ) {
        double sum = 0;
        int currentStep = 0;
        do {
            sum += currentStep;
            currentStep++;
        } while ( currentStep < maximumStepsToCountDoWhileLoop );
        return sum / maximumStepsToCountDoWhileLoop;
    }
}