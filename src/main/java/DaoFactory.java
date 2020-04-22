// This DAO class will provide access to our Model data, but will not require accessing the ListProductsDao class directly
// Instead, we will reference the interface
public class DaoFactory {
    private static Products productsDao;

    public static Products getProductsDao() {
        if (productsDao == null) {
            productsDao = new ListProductsDao(); // this is the ONLY reference to the listProductsDao class
        }
        // if it is not null, return the productsDao that already exists
        // this is an instance of the listProductsDao class
        return productsDao;
    }
}
