package expert.os.business;

import java.time.LocalDate;

public class Ticket implements Product {

    private int room;

    private LocalDate date;

    private Movie attraction;

    private Money price;


    @Override
    public Money price() {
        return price;
    }
}
