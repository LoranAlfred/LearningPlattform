package tasksheet1;

/**
 * This class is the class for task TestWarp.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class TestWarp {

    /**
     * Run method.
     *
     * @param arguments The arguments may set.
     * @since 1.0
     */
    public static void main ( String[] arguments ) {
        int warpFactor = 2;
        System.out.println ( "The current warp factor is: " + warp ( warpFactor ) );
    }

    private static String warp ( int warpFactor ) {
        switch ( warpFactor ) {
        case 9:
            return "Warp 9";
        case 8:
            return "Warp 8";
        case 7:
            return "Warp 7";
        case 6:
            return "Warp 6";
        case 5:
            return "Warp 5";
        case 4:
            return "Warp 4";
        case 3:
            return "Warp 3";
        case 2:
            return "Warp 2";
        case 1:
            return "Warp 1";
        default:
            System.err.println ( "Invalid warp factor!" );
        }
        return null;
    }
}