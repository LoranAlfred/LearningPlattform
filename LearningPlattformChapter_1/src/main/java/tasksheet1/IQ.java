package tasksheet1;

/**
 * This class represents the IQ.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class IQ {

    /**
     * Determines how intelligent you are.
     *
     * @param iq The iq to set.
     * @since 1.0
     */
    private static void howIntelligentAreYou ( int iq ) {
        if ( iq < 100 ) {
            System.out.println ( "Worse than average" );
        } else {
            if ( iq > 130 ) {
                System.out.println ( "You belong to the most intelligent 2% of the population" );
            } else {
                System.out.println ( "Not intelligent enough for Mensa test" );
            }
        }
    }

    /**
     * Run method.
     *
     * @param arguments The arguments may set.
     * @since 1.0
     */
    public static void main ( String[] arguments ) {
        int iq = 126;
        howIntelligentAreYou ( iq );
    }
}