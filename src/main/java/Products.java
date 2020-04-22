public interface Products {

    // this method will return an object of type 'Product'
    // searched by ID
    Product findById(long ID);

    // this method will insert a 'Product' into our table
    // the return of this will be said product's ID
    long createProduct(Product product);
}
