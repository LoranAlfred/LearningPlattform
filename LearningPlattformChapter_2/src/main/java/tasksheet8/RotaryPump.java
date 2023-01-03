package tasksheet8;

import java.util.StringJoiner;


/**
 * This class represents a rotary pump.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class RotaryPump extends Pump {

    private int amountOfShovels;

    private int maximumRotationSpeed;

    /**
     * Constructor.
     *
     * @param name                 The name to set.
     * @param height               The height to set.
     * @param width                The width to set.
     * @param weight               The weight to set.
     * @param depth                The depth to set.
     * @param amountOfShovels      The amount of shovels to set.
     * @param maximumRotationSpeed The maximum rotation speed to set.
     * @since 1.0
     */
    public RotaryPump ( String name, int height, int width, int weight, int depth, int amountOfShovels, int maximumRotationSpeed ) {
        super ( name, height, width, weight, depth );
        this.amountOfShovels = amountOfShovels;
        this.maximumRotationSpeed = maximumRotationSpeed;
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
     * @param amountOfShovels          The amount of shovels to set.
     * @param maximumRotationSpeed     The maximum rotation speed to set.
     * @since 1.0
     */
    public RotaryPump ( String name, int height, int width, int weight, int depth, float maximumOperatingPressure, int maximumOutput, int amountOfShovels,
                    int maximumRotationSpeed ) {
        super ( name, height, width, weight, depth, maximumOperatingPressure, maximumOutput );
        this.amountOfShovels = amountOfShovels;
        this.maximumRotationSpeed = maximumRotationSpeed;
    }

    public int getAmountOfShovels () {
        return amountOfShovels;
    }

    public void setAmountOfShovels ( int amountOfShovels ) {
        this.amountOfShovels = amountOfShovels;
    }

    public int getMaximumRotationSpeed () {
        return maximumRotationSpeed;
    }

    public void setMaximumRotationSpeed ( int maximumRotationSpeed ) {
        this.maximumRotationSpeed = maximumRotationSpeed;
    }

    @Override
    public void print () {
        StringJoiner stringJoiner =
                        new StringJoiner ( "" ).add ( "Name: " ).add ( getName () ).add ( "\nHeight: " ).add ( "" + getHeight () ).add ( "\nWidth: " )
                                        .add ( "" + getWidth () ).add ( "\nWeight: " ).add ( "" + getWeight () ).add ( "\nDepth: " ).add ( "" + getDepth () )
                                        .add ( "\nMaximum operating pressure: " ).add ( "" + getMaximumOperatingPressure () ).add ( "\nMaximum output: " )
                                        .add ( "" + getMaximumOutput () ).add ( "\nAmount of shovels: " ).add ( "" + getAmountOfShovels () )
                                        .add ( "\nMaximum rotation speed: " ).add ( "" + getMaximumRotationSpeed () );
        System.out.println ( stringJoiner );
    }
}
