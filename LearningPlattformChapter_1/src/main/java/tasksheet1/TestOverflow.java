package tasksheet1;

/**
 * This class is the class for task TestOverflow.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class TestOverflow {

    /**
     * Run method.
     *
     * @param arguments The arguments may set.
     * @since 1.0
     */
    public static void main ( String[] arguments ) {
        short variableToOverflow = 32767;
        System.out.println (variableToOverflow);
        System.out.println (++variableToOverflow);
    }
}