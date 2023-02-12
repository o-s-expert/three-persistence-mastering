package expert.os.business;

public class BookProduct implements Product{
    private Book book;

    private Money price;

    @Override
    public Money price() {
        return price;
    }
}
