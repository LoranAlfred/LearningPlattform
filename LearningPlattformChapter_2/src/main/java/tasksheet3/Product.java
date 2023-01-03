package tasksheet3;

/**
 * This class represents a product.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class Product {

    private String productName;

    private int amount;

    private float price;

    private float totalPrice;

    /**
     * Constructor.
     *
     * @param productName The product name to set.
     * @param amount      The amount to set.
     * @param price       The price to set.
     * @since 1.0
     */
    public Product ( String productName, int amount, float price ) {
        this.productName = productName;
        this.amount = amount;
        this.price = price;
        determineTotalPrice ();
    }

    /**
     * Determines the total price.
     *
     * @since 1.0
     */
    private void determineTotalPrice () {
        this.totalPrice = this.price * this.amount;
    }

    public String getProductName () {
        return productName;
    }

    public void setProductName ( String productName ) {
        this.productName = productName;
    }

    public int getAmount () {
        return amount;
    }

    public void setAmount ( int amount ) {
        this.amount = amount;
    }

    public float getPrice () {
        return price;
    }

    public void setPrice ( float price ) {
        this.price = price;
    }

    public float getTotalPrice () {
        return totalPrice;
    }
}
