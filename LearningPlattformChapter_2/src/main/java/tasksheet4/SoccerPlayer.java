package tasksheet4;

import java.util.Objects;


/**
 * This class represents a soccer player.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class SoccerPlayer {

    private int playerNumber;

    private Name name;

    public SoccerPlayer ( int playerNumber, String firstName, String lastName ) {
        this.playerNumber = playerNumber;
        this.name = new Name ( firstName, lastName );
    }

    public int getPlayerNumber () {
        return playerNumber;
    }

    public void setPlayerNumber ( int playerNumber ) {
        this.playerNumber = playerNumber;
    }

    public Name getName () {
        return name;
    }

    public void setName ( Name name ) {
        this.name = name;
    }

    @Override
    public String toString () {
        return "Player number: " + this.playerNumber + "\nSoccer player: " + this.name.toString ();
    }

    @Override
    public boolean equals ( Object objectToCheck ) {
        if ( this == objectToCheck )
            return true;
        if ( objectToCheck == null || getClass () != objectToCheck.getClass () )
            return false;
        SoccerPlayer that = ( SoccerPlayer ) objectToCheck;
        return playerNumber == that.playerNumber && Objects.equals ( name, that.name );
    }

    @Override public int hashCode () {
        return Objects.hash ( playerNumber, name );
    }
}
