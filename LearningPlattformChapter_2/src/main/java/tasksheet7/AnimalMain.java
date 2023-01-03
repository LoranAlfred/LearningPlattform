package tasksheet7;

/**
 * This class is the sample class to run the program.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class AnimalMain {

    /**
     * Main - method.
     *
     * @param arguments The arguments may set.
     * @since 1.0
     */
    public static void main ( String[] arguments ) {
        Animal animal = new Animal ( "Animal" );
        System.out.println ( animal.getName () );
        animal.makeNoise ();
        Dog bello = new Dog ( "Bello" );
        System.out.println ( bello.getName () );
        bello.makeNoise ();
        Cat mika = new Cat ( "Mika" );
        System.out.println ( mika.getName () );
        mika.makeNoise ();
    }
}
