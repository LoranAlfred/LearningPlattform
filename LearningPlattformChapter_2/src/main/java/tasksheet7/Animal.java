package tasksheet7;

/**
 * This class represents an animal.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class Animal {

    private String name;

    /**
     * Constructor.
     *
     * @param name The name to set.
     * @since 1.0
     */
    public Animal ( String name ) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public void makeNoise () {
        System.out.println ( "I am an animal with no concrete expression. Which noise should I make?" );
    }
}
