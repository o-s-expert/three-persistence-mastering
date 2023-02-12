package expert.os.business;

public class MovieGoer {

    private final String nickname;

    private String city;

    private Payment payment;

    public MovieGoer(String nickname, String city, Payment payment) {
        this.nickname = nickname;
        this.city = city;
        this.payment = payment;
    }

    public void pay(Money price) {
        //
    }
}
