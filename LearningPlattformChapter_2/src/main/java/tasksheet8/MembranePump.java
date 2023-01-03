package tasksheet8;

import java.util.StringJoiner;


/**
 * This class represents a membrane pump.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class MembranePump extends Pump {

    private String membraneMaterial;

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
    public MembranePump ( String name, int height, int width, int weight, int depth ) {
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
     * @param membraneMaterial         The membrane material to set.
     * @since 1.0
     */
    public MembranePump ( String name, int height, int width, int weight, int depth, float maximumOperatingPressure, int maximumOutput,
                    String membraneMaterial ) {
        super ( name, height, width, weight, depth, maximumOperatingPressure, maximumOutput );
        this.membraneMaterial = membraneMaterial;
    }

    public String getMembraneMaterial () {
        return membraneMaterial;
    }

    public void setMembraneMaterial ( String membraneMaterial ) {
        this.membraneMaterial = membraneMaterial;
    }

    @Override
    public void print () {
        StringJoiner stringJoiner =
                        new StringJoiner ( "" ).add ( "Name: " ).add ( getName () ).add ( "\nHeight: " ).add ( "" + getHeight () ).add ( "\nWidth: " )
                                        .add ( "" + getWidth () ).add ( "\nWeight: " ).add ( "" + getWeight () ).add ( "\nDepth: " ).add ( "" + getDepth () )
                                        .add ( "\nMaximum operating pressure: " ).add ( "" + getMaximumOperatingPressure () ).add ( "\nMaximum output: " )
                                        .add ( "" + getMaximumOutput () ).add ( "\nMembrane material: " ).add ( getMembraneMaterial () );
        System.out.println ( stringJoiner );
    }
}
