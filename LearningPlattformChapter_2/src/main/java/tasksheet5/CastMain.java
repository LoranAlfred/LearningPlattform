package tasksheet5;

/**
 * This class is the sample for the task.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class CastMain {

    /**
     * Main - method.
     *
     * @param arguments The arguments may set.
     * @since 1.0
     */
    public static void main ( String[] arguments ) {
        Actor firstActor = new Actor ( "Leonardo", "Turtle", 20 );
        Actor secondActor = new Actor ( "Donatello", "Turtle", 19 );
        Actor thirdActor = new Actor ( "Michelangelo", "Turtle", 18 );
        Actor fourthActor = new Actor ( "Raphael", "Turtle", 17 );

        Actor sixthActor = new Actor ( "Leonardo", "Turtle", 30 );
        sixthActor.actorIsHired ( true );

        Cast cast = new Cast ( "Teenage Mutant Ninja Turtles" );
        cast.addActorToCast ( firstActor );
        cast.addActorToCast ( secondActor );
        cast.addActorToCast ( thirdActor );
        cast.addActorToCast ( fourthActor );

        cast.addActorToCast ( sixthActor );

        System.out.println ( "Cast before sorting:" );
        System.out.println ( cast );
        cast.sortCast ();
        System.out.println ( "Cast after sorting:" );
        cast.sortCast ();
        System.out.println ();
        System.out.println ( cast );
    }

}
