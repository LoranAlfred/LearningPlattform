package tasksheet1;

/**
 * This class is the sample for task Square.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class Square {

    static final int BREITE = 20;

    static final int HOEHE = 10;

    /**
     * Main - method.
     *
     * @param arguments The arguments to set.
     * @since 1.0
     */
    public static void main ( String[] arguments ) {
        int hoehe;
        int breite;
        breite = 0;
        do {
            System.out.print ( "*" );
            breite++;
        } while ( breite < BREITE );
        System.out.println ();
        hoehe = 0;
        while ( hoehe < HOEHE - 2 ) {
            System.out.print ( "*" );
            breite = 1;
            do {
                System.out.print ( " " );
                breite++;
            } while ( breite < BREITE - 1 );
            System.out.print ( "*" );
            System.out.println ();
            hoehe++;
        }
        breite = 0;
        while ( breite < BREITE ) {
            System.out.print ( "*" );
            breite++;
        }
        System.out.println ();
    }
}