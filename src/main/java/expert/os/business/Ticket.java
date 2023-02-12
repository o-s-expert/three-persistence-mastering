package expert.os.business;

import java.time.LocalDate;

public class Ticket implements Product{

    private LocalDate date;

    private int room;

    private Money price;

    private Movie attraction;

    @Override
    public Money price() {
        return price;
    }
}
