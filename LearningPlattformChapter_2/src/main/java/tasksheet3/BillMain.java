package tasksheet3;

/**
 * Sample class to run the program.
 *
 * @author Alfred Loran
 * @since 1.0
 */
public class BillMain {

    /**
     * Main method.
     *
     * @param args The arguments may set.
     * @since 1.0
     */
    public static void main ( String[] args ) {
        Product apple = new Product ( "Apple", 2, 1.5f );
        Product eggs = new Product ( "Egg", 10, 0.3f );
        Product milk = new Product ( "Milk", 2, 1.25f );
        Bill createdBill = new Bill ();
        createdBill.addProductToBill ( apple );
        createdBill.addProductToBill ( eggs );
        createdBill.addProductToBill ( milk );
        System.out.println ( createdBill );
    }
}
