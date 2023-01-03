package tasksheet7;

/**
 * This class represents a dog.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class Dog extends Animal {

    /**
     * Constructor.
     *
     * @param name The name to set.
     * @since 1.0
     */
    public Dog ( String name ) {
        super ( name );
    }

    @Override
    public void makeNoise () {
        System.out.println ("Wau wau");
    }
}
