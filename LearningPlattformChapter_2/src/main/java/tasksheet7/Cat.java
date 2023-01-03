package tasksheet7;

/**
 * This class represents a cat.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class Cat extends Animal {

    /**
     * Constructor.
     *
     * @param name The name to set.
     * @since 1.0
     */
    public Cat ( String name ) {
        super ( name );
    }

    @Override
    public void makeNoise () {
        System.out.println ("Miau miau");
    }
}
