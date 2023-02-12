package expert.os.business;

import java.util.List;

public class ReaderService {

    public void buy(Order order) {
        Reader user = order.getUser();
        List<Product> products = order.getProducts();
        Money money = order.total();
        //get payment service
        //
        //fire events
    }
}
