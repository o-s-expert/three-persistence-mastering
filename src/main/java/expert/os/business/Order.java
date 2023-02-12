package expert.os.business;

import java.util.Collections;
import java.util.List;

public class Order {

    private MovieGoer movieGoer;

    private List<Product> products;

    public MovieGoer getMovieGoer() {
        return movieGoer;
    }

    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }
}
