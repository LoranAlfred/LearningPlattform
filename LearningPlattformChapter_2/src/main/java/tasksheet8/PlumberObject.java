package tasksheet8;

/**
 * This class represents a plumber object.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class PlumberObject {

    private String name;

    private int height;

    private int width;

    private int weight;

    private int depth;

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
    public PlumberObject ( String name, int height, int width, int weight, int depth ) {
        this.name = name;
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.depth = depth;
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public int getHeight () {
        return height;
    }

    public void setHeight ( int height ) {
        this.height = height;
    }

    public int getWidth () {
        return width;
    }

    public void setWidth ( int width ) {
        this.width = width;
    }

    public int getWeight () {
        return weight;
    }

    public void setWeight ( int weight ) {
        this.weight = weight;
    }

    public int getDepth () {
        return depth;
    }

    public void setDepth ( int depth ) {
        this.depth = depth;
    }

    public void print () {
        throw new UnsupportedOperationException ( "Not implemented!" );
    }
}