import java.util.ArrayList;
import java.util.List;

// This is our DAO (Data Access Object, or data access class)
public class ListProductsDao implements Products {
    // list all the products, find a product by ID, create a product

    // This will list all the products in the database table
    private List<Product> products;

    // Constructor
    public ListProductsDao() {
        this.products = new ArrayList<>();
        // add some dummy data

    }

    // TODO: Implement our interface requirements (from Products.java)


    @Override
    public Product findById(long id) {
        // We want to return the 'Product' object for the ID passed in
        // This will return the full row in the database
        // i.e. id | title | priceInCents | description (the full row)
        return products.get((int)id - 1);
    }

    @Override
    public long createProduct(Product product) {
        // Create a product and insert into our ArrayList (eventually, the DB)
        // assign an ID
        product.setId(products.size()+1); // same as auto-increment

        // Add a new Product to the ArrayList
        products.add(product); // when we call the createProduct method, we are sending in a 'Product' type object. This will add that object to the ArrayList
        return product.getId();
    }
}

