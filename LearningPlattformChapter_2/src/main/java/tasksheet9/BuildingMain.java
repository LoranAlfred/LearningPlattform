package tasksheet9;

/**
 * Sample class to run the program.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class BuildingMain {

    /**
     * Main - method.
     *
     * @param arguments The arguments may set.
     * @since 1.0
     */
    public static void main ( String[] arguments ) {
        Address firstAddress = new Address ( "Street", 1, "12345", "Town" );

        Building firstBuilding = new House ( "First building", firstAddress);
        Building secondBuilding = new School ( "Second Building", "Another street", 8, "54321", "Town"  );

        System.out.println (firstBuilding);
        System.out.println ();
        System.out.println (secondBuilding);
    }
}
