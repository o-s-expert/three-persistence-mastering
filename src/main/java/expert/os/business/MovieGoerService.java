package expert.os.business;

import java.util.List;

public class MovieGoerService {

    public void buy(OrderCart cart) {
        MovieGoer user = cart.getUser();
        List<Product> products = cart.getProducts();

    }
}
