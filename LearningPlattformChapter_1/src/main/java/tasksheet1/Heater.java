package tasksheet1;

/**
 * This class represents a heater.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class Heater {

    /**
     * Method to heat.
     *
     * @param heatingGrade The heating grade to set. Has to be a number between 1 and 5.
     * @since 1.0
     */
    private static void heat ( int heatingGrade ) {
        switch ( heatingGrade ) {
        case 1:
            System.out.println ( "Pretty cold" );
            break;
        case 2:
            System.out.println ( "Cold" );
            break;
        case 3:
            System.out.println ( "Normal" );
            break;
        case 4:
            System.out.println ( "Hot" );
            break;
        case 5:
            System.out.println ( "Damn hot" );
            break;
        default:
            System.err.println ( "Not a valid number. Please use a number between 1 and 5" );
        }
    }

    /**
     * Run method.
     *
     * @param arguments The arguments may set.
     * @since 1.0
     */
    public static void main ( String[] arguments ) {
        int heatingGrade = 6;
        heat ( heatingGrade );
    }
}