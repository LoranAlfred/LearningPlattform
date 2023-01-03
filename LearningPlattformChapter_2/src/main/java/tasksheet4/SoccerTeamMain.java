package tasksheet4;

/**
 * This class is the sample class to run the programm.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class SoccerTeamMain {

    /**
     * Main method.
     *
     * @param args The arguments may set.
     * @since 1.0
     */
    public static void main ( String[] args ) {
        SoccerPlayer player1 = new SoccerPlayer ( 10, "Leonardo", "Turtle" );
        SoccerPlayer player2 = new SoccerPlayer ( 1, "Donatello", "Turtle" );
        SoccerPlayer player3 = new SoccerPlayer ( 5, "Michelangelo", "Turtle" );
        SoccerPlayer player4 = new SoccerPlayer ( 3, "Raphael", "Turtle" );

        SoccerTeam soccerTeam = new SoccerTeam ( "Turtle Power" );
        soccerTeam.addSoccerPlayerToTeam ( player1 );
        soccerTeam.addSoccerPlayerToTeam ( player2 );
        soccerTeam.addSoccerPlayerToTeam ( player3 );
        soccerTeam.addSoccerPlayerToTeam ( player4 );
        System.out.println ( soccerTeam );

        soccerTeam.orderAllSoccerPlayersInTeam ();
        System.out.println ( soccerTeam );
    }
}