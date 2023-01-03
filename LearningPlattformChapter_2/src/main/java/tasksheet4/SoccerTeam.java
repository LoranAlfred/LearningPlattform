package tasksheet4;

import java.util.StringJoiner;


/**
 * This class represents a soccer team.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class SoccerTeam {

    private String name;

    private SoccerPlayer[] soccerPlayers;

    /**
     * Constructor.
     *
     * @param teamName The team name to set.
     * @since 1.0
     */
    public SoccerTeam ( String teamName ) {
        soccerPlayers = new SoccerPlayer[ 11 ];
        this.name = teamName;
    }

    /**
     * Adds a {@link SoccerPlayer} to the {@link SoccerTeam}.
     *
     * @param soccerPlayerToAdd The {@link SoccerPlayer} to add.
     * @since 1.0
     */
    public void addSoccerPlayerToTeam ( SoccerPlayer soccerPlayerToAdd ) {
        if ( teamIsFull () ) {
            System.err.println ( "Soccer Team is full!" );
        } else {
            for ( int currentSoccerPlayerIndex = 0; currentSoccerPlayerIndex < soccerPlayers.length; currentSoccerPlayerIndex++ ) {
                if ( playerIsAlreadyInTeam ( soccerPlayerToAdd ) ) {
                    System.err.println ( "Soccer player is already in team!" );
                    break;
                } else {
                    if ( soccerPlayers[ currentSoccerPlayerIndex ] == null ) {
                        soccerPlayers[ currentSoccerPlayerIndex ] = soccerPlayerToAdd;
                        return;
                    }
                }
            }
        }
    }

    /**
     * Verifies if the team is full or not.
     *
     * @return <code>true</code> Team is full.<br><code>false</code> Team is not full.
     * @since 1.0
     */
    private boolean teamIsFull () {
        for ( int currentSoccerPlayerIndex = 0; currentSoccerPlayerIndex < soccerPlayers.length; currentSoccerPlayerIndex++ ) {
            if ( soccerPlayers[ currentSoccerPlayerIndex ] == null ) {
                return false;
            }
        }
        return true;
    }

    /**
     * Verifies if the given {@link SoccerPlayer} is already in team or not.
     *
     * @param soccerPlayerToCheck The {@link SoccerPlayer} to check.
     * @return <code>true</code> The {@link SoccerPlayer} is already in {@link SoccerTeam}.<br><code>false</code> The {@link SoccerPlayer} is not in
     * {@link SoccerTeam}.
     * @since 1.0
     */
    private boolean playerIsAlreadyInTeam ( SoccerPlayer soccerPlayerToCheck ) {
        for ( int currentSoccerPlayerIndex = 0; currentSoccerPlayerIndex < soccerPlayers.length; currentSoccerPlayerIndex++ ) {
            if ( soccerPlayers[ currentSoccerPlayerIndex ] != null ) {
                if ( soccerPlayers[ currentSoccerPlayerIndex ].equals ( soccerPlayerToCheck ) ) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Orders all {@link SoccerPlayer}s in {@link SoccerTeam} via player number from small to large.
     *
     * @since 1.0
     */
    public void orderAllSoccerPlayersInTeam () {
        for ( int currentSoccerPlayerIndex = 0; currentSoccerPlayerIndex < soccerPlayers.length - 1; currentSoccerPlayerIndex++ ) {
            if ( soccerPlayers[ currentSoccerPlayerIndex ] != null && soccerPlayers[ currentSoccerPlayerIndex + 1 ] != null ) {
                if ( soccerPlayers[ currentSoccerPlayerIndex ].getPlayerNumber () > soccerPlayers[ currentSoccerPlayerIndex + 1 ].getPlayerNumber () ) {
                    SoccerPlayer currentSoccerPlayer = soccerPlayers[ currentSoccerPlayerIndex ];
                    soccerPlayers[ currentSoccerPlayerIndex ] = soccerPlayers[ currentSoccerPlayerIndex + 1 ];
                    soccerPlayers[ currentSoccerPlayerIndex + 1 ] = currentSoccerPlayer;
                }
            }
        }
        if ( !soccerTeamIsSorted () ) {
            orderAllSoccerPlayersInTeam ();
        }
    }

    /**
     * Verifies if the {@link SoccerTeam} is sorted or not.
     *
     * @return <code>true</code> {@link SoccerTeam} is sorted.<br><code>false</code> {@link SoccerTeam} is not sorted.
     * @since 1.0
     */
    private boolean soccerTeamIsSorted () {
        for ( int currentSoccerPlayerIndex = 0; currentSoccerPlayerIndex < soccerPlayers.length - 1; currentSoccerPlayerIndex++ ) {
            if ( soccerPlayers[ currentSoccerPlayerIndex ] != null && soccerPlayers[ currentSoccerPlayerIndex + 1 ] != null ) {
                if ( soccerPlayers[ currentSoccerPlayerIndex ].getPlayerNumber () > soccerPlayers[ currentSoccerPlayerIndex + 1 ].getPlayerNumber () ) {
                    return false;
                }
            }
        }
        return true;
    }

    public String getName () {
        return name;
    }

    /**
     * Returns the values of the object.
     *
     * @return The values of the object.
     * @since 1.0
     */
    @Override
    public String toString () {
        StringJoiner stringJoiner = new StringJoiner ( "" );
        stringJoiner.add ( "The soccer team " ).add ( getName () ).add ( " contains this soccer players: \n\n" );
        for ( int currentSoccerPlayerIndex = 0; currentSoccerPlayerIndex < soccerPlayers.length - 1; currentSoccerPlayerIndex++ ) {
            if ( soccerPlayers[ currentSoccerPlayerIndex ] != null ) {
                stringJoiner.add ( soccerPlayers[ currentSoccerPlayerIndex ].toString () ).add ( "\n\n" );
            }
        }
        return stringJoiner.toString ();
    }
}
