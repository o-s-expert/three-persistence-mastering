package expert.os.business;

import java.util.List;

public class MovieGoerService {

    public void buy(Order order) {
        MovieGoer user = order.getMovieGoer();
        List<Product> products = order.getProducts();
        Money total = products.stream().map(Product::price)
                .reduce(Money::sum).orElse(Money.ZERO);
        //check the availability of the products
        user.pay(total);
    }
}
