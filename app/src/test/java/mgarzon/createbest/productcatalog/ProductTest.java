package mgarzon.createbest.productcatalog;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductTest {

    @Test
    public void checkProductName() {
        Product aProduct = new Product("1", "DELL MONITOR", 180);
        assertEquals("Check the name of the product", "DELL MONITOR", aProduct.getProductName());
    }

    @Test
    public void checkProductId() {
        Product aProduct = new Product("1", "DELL MONITOR", 180);
        assertEquals("Check the id of the product", "1", aProduct.getId());
    }

    @Test
    public void checkProductPrice() {
        // I am making this test to fail
        Product aProduct = new Product("1", "DELL MONITOR", 180);assertEquals("Check the price of the product", aProduct.getPrice(), aProduct.getPrice(), 0.01);
    }


}
