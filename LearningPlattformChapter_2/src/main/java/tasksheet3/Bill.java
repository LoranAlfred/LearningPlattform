package tasksheet3;

import java.util.StringJoiner;


/**
 * This class represents a bill.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class Bill {

    private static int amountOfBills = 0;

    private int billNumber;

    private Product[] products;

    private float totalPrice;

    /**
     * Constructor.
     *
     * @since 1.0
     */
    public Bill () {
        ++Bill.amountOfBills;
        this.billNumber = Bill.amountOfBills;
        products = new Product[ 10 ];
    }

    /**
     * Adds a {@link Product} to the {@link Bill}.
     *
     * @param productToAdd The {@link Product} to add.
     * @since 1.0
     */
    public void addProductToBill ( Product productToAdd ) {
        if ( billIsFull () ) {
            System.err.println ( "A bill can not contain more than 10 products!" );
        } else {
            for ( int currentProductIndex = 0; currentProductIndex < products.length; currentProductIndex++ ) {
                if ( products[ currentProductIndex ] == null ) {
                    products[ currentProductIndex ] = productToAdd;
                    break;
                }
            }
        }
        this.totalPrice = calculateTotalPriceForBill ();
    }

    /**
     * Verifies if the bill has a null space in array or not.
     *
     * @return <code>true</code> No null space in array.<br><code>false</code> A null space is found in array.
     * @since 1.0
     */
    private boolean billIsFull () {
        for ( int currentProductIndex = 0; currentProductIndex < products.length; currentProductIndex++ ) {
            if ( products[ currentProductIndex ] == null ) {
                return false;
            }
        }
        return true;
    }

    /**
     * Calculates the total price for bill.
     *
     * @return The total price for bill.
     * @since 1.0
     */
    private float calculateTotalPriceForBill () {
        for ( int currentProductIndex = 0; currentProductIndex < products.length; currentProductIndex++ ) {
            if ( products[ currentProductIndex ] != null ) {
                this.totalPrice += products[ currentProductIndex ].getTotalPrice ();
            }
        }
        return this.totalPrice;
    }

    /**
     * Returns the values of the object.
     *
     * @return The values of the object.
     * @since 1.0
     */
    @Override
    public String toString () {
        StringJoiner stringJoiner = new StringJoiner ( "" );
        stringJoiner.add ( "Bill number: " ).add ( "" + this.billNumber );
        stringJoiner.add ( "\nBill contains this products: \n" );
        stringJoiner.add ( "Product name" ).add ( "\t" ).add ( "Amount" ).add ( "\t" ).add ( "Sum" );

        for ( int currentProductIndex = 0; currentProductIndex < products.length; currentProductIndex++ ) {
            if ( products[ currentProductIndex ] != null ) {
                stringJoiner.add ( "\n" );
                stringJoiner.add ( products[ currentProductIndex ].getProductName () );
                stringJoiner.add ( determineProductNameLength ( products[ currentProductIndex ].getProductName () ) );
                stringJoiner.add ( "" + products[ currentProductIndex ].getAmount () );
                stringJoiner.add ( "\t\t" );
                stringJoiner.add ( "" + products[ currentProductIndex ].getTotalPrice () ).add ( " €" );
            }
        }

        stringJoiner.add ( "\n\n" );
        stringJoiner.add ( "Total: " ).add ( "" + this.totalPrice ).add ( " €" );
        return stringJoiner.toString ();
    }

    /**
     * Just a method to adjust tab usage determine by product length.
     *
     * @param productName The product name to set.
     * @return The adjusted tabs.
     * @since 1.0
     */
    private String determineProductNameLength ( String productName ) {
        if ( productName.length () <= 3 ) {
            return "\t\t\t\t";
        } else {
            return "\t\t\t";
        }
    }
}
