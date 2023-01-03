package tasksheet1;

/**
 * This class is the class for task TestCast.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class TestCast {

    /**
     * Run method.
     *
     * @param arguments The arguments may set.
     * @since 1.0
     */
    public static void main ( String[] arguments ) {
        int firstVariable;
        float secondVariable = 5.4f;
        firstVariable = (int) secondVariable;
        System.out.println (firstVariable);
    }
}