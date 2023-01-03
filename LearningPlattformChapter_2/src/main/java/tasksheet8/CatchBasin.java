package tasksheet8;

import java.util.StringJoiner;


/**
 * This class represents a catch basin.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class CatchBasin extends PlumberObject {

    private int capacity;

    /**
     * Constructor.
     *
     * @param name   The name to set.
     * @param height The height to set.
     * @param width  The width to set.
     * @param weight The weight to set.
     * @param depth  The depth to set.
     * @since 1.0
     */
    public CatchBasin ( String name, int height, int width, int weight, int depth ) {
        super ( name, height, width, weight, depth );
    }

    /**
     * Constructor.
     *
     * @param name     The name to set.
     * @param height   The height to set.
     * @param width    The width to set.
     * @param weight   The weight to set.
     * @param depth    The depth to set.
     * @param capacity The capacity to set.
     * @since 1.0
     */
    public CatchBasin ( String name, int height, int width, int weight, int depth, int capacity ) {
        super ( name, height, width, weight, depth );
        this.capacity = capacity;
    }

    public int getCapacity () {
        return capacity;
    }

    public void setCapacity ( int capacity ) {
        this.capacity = capacity;
    }

    @Override
    public void print () {
        StringJoiner stringJoiner =
                        new StringJoiner ( "" ).add ( "Name: " ).add ( getName () ).add ( "\nHeight: " ).add ( "" + getHeight () ).add ( "\nWidth: " )
                                        .add ( "" + getWidth () ).add ( "\nWeight: " ).add ( "" + getWeight () ).add ( "\nDepth: " ).add ( "" + getDepth () )
                                        .add ( "\nCapacity: " ).add ( "" + getCapacity () );
        System.out.println ( stringJoiner );

    }
}
