package Level1;

import java.util.ArrayList;
import java.util.List;

public class Sale{
    private List<Product> products;
    private double totalPrice;

    public Sale() {
        this.products = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public void addProduct(Product product) {
        products.add(product);
        totalPrice += product.getPrice();
    }

    public void calculateTotal() throws EmptySaleException {
        if (products.isEmpty()) {
           throw new EmptySaleException();
        }
        totalPrice = 0.0;
        for (Product p : products) {
            totalPrice += p.getPrice();
        }
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public List<Product> getProducts() {
        return products;
    }
}