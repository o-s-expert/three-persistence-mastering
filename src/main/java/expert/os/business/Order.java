package expert.os.business;

import java.util.List;

public class Order {

    private Reader user;

    private List<Product> products;

    public Reader getUser() {
        return user;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Money total() {
        return products.stream().map(Product::price)
                .reduce(Money::sum)
                .orElse(Money.ZERO);
    }
}
