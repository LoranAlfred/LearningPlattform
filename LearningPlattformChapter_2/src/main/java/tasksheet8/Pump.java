package tasksheet8;

import java.util.StringJoiner;


/**
 * This class represents a pump.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class Pump extends PlumberObject {

    private float maximumOperatingPressure;

    private int maximumOutput;

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
    public Pump ( String name, int height, int width, int weight, int depth ) {
        super ( name, height, width, weight, depth );
    }

    /**
     * Constructor.
     *
     * @param name                     The name to set.
     * @param height                   The height to set.
     * @param width                    The width to set.
     * @param weight                   The weight to set.
     * @param depth                    The depth to set.
     * @param maximumOperatingPressure The maximum operating pressure to set.
     * @param maximumOutput            The maximum output to set.
     * @since 1.0
     */
    public Pump ( String name, int height, int width, int weight, int depth, float maximumOperatingPressure, int maximumOutput ) {
        super ( name, height, width, weight, depth );
        this.maximumOperatingPressure = maximumOperatingPressure;
        this.maximumOutput = maximumOutput;
    }

    public float getMaximumOperatingPressure () {
        return maximumOperatingPressure;
    }

    public void setMaximumOperatingPressure ( float maximumOperatingPressure ) {
        this.maximumOperatingPressure = maximumOperatingPressure;
    }

    public int getMaximumOutput () {
        return maximumOutput;
    }

    public void setMaximumOutput ( int maximumOutput ) {
        this.maximumOutput = maximumOutput;
    }

    @Override
    public void print () {
        StringJoiner stringJoiner =
                        new StringJoiner ( "" ).add ( "Name: " ).add ( getName () ).add ( "\nHeight: " ).add ( "" + getHeight () ).add ( "\nWidth: " )
                                        .add ( "" + getWidth () ).add ( "\nWeight: " ).add ( "" + getWeight () ).add ( "\nDepth: " ).add ( "" + getDepth () )
                                        .add ( "\nMaximum operating pressure: " ).add ( "" + getMaximumOperatingPressure () ).add ( "\nMaximum output: " )
                                        .add ( "" + getMaximumOutput () );
        System.out.println ( stringJoiner );
    }
}
