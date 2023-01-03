package tasksheet5;

import java.util.StringJoiner;


/**
 * This class represents a cast.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class Cast {

    private String castName;

    private Actor[] cast;

    public Cast ( String castName ) {
        this.castName = castName;
        this.cast = new Actor[ 5 ];
    }

    /**
     * Adds an {@link Actor} to the {@link Cast}.
     *
     * @param actorToAddToCast The {@link Actor} to add.
     * @since 1.0
     */
    public void addActorToCast ( Actor actorToAddToCast ) {
        if ( castIsFull () ) {
            System.err.println ( "The cast is full. No other actor can be added to it!" );
        } else {
            if ( actorToAddToCast.actorIsHired () ) {
                System.err.println ( "The actor is already hired in a cast. It can't be added to this cast!" );
            } else {
                addActor ( actorToAddToCast );
            }
        }
    }

    /**
     * Verifies if the cast is full or not.
     *
     * @return <code>true</code> The cast is full.<br><code>false</code> The cast is not full.
     * @since 1.0
     */
    private boolean castIsFull () {
        for ( int currentCastIndex = 0; currentCastIndex < cast.length; currentCastIndex++ ) {
            if ( cast[ currentCastIndex ] == null ) {
                return false;
            }
        }
        return true;
    }

    /**
     * Adds the {@link Actor} to {@link Cast}.
     *
     * @param actorToAdd The {@link Actor} to add.
     * @since 1.0
     */
    public void addActor ( Actor actorToAdd ) {
        for ( int currentCastIndex = 0; currentCastIndex < cast.length; currentCastIndex++ ) {
            if ( cast[ currentCastIndex ] == null ) {
                cast[ currentCastIndex ] = actorToAdd;
                cast[ currentCastIndex ].actorIsHired ( true );
                return;
            }
        }
    }

    /**
     * Sorts the {@link Actor} from young to old.
     *
     * @since 1.0
     */
    public void sortCast () {
        for ( int currentCastIndex = 0; currentCastIndex < cast.length - 1; currentCastIndex++ ) {
            if ( cast[ currentCastIndex ] != null && cast[ currentCastIndex + 1 ] != null ) {
                if ( cast[ currentCastIndex ].getAge () > cast[ currentCastIndex + 1 ].getAge () ) {
                    Actor temporaryActor = cast[ currentCastIndex ];
                    cast[ currentCastIndex ] = cast[ currentCastIndex + 1 ];
                    cast[ currentCastIndex + 1 ] = temporaryActor;
                }
            }
        }

        if ( !castIsSorted () ) {
            sortCast ();
        }
    }

    /**
     * Verifies if the {@link Cast} is sorted or not.
     *
     * @return <code>true</code>> {@link Cast} is sorted.<br><code>false</code> {@link Cast} is not sorted.
     * @since 1.0
     */
    private boolean castIsSorted () {
        for ( int currentCastIndex = 0; currentCastIndex < cast.length - 1; currentCastIndex++ ) {
            if ( cast[ currentCastIndex ] != null && cast[ currentCastIndex + 1 ] != null ) {
                if ( cast[ currentCastIndex ].getAge () > cast[ currentCastIndex + 1 ].getAge () ) {
                    return false;
                }
            }
        }
        return true;
    }

    public String getCastName () {
        return castName;
    }

    public void setCastName ( String castName ) {
        this.castName = castName;
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
        stringJoiner.add ( "The cast " ).add ( this.castName ).add ( " contains this actors: \n" );
        for ( int currentCastIndex = 0; currentCastIndex < cast.length; currentCastIndex++ ) {
            if ( cast[ currentCastIndex ] != null ) {
                stringJoiner.add ( cast[ currentCastIndex ].toString () ).add ( "\n" );
            }
        }
        return stringJoiner.toString ();
    }
}
