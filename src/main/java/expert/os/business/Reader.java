package expert.os.business;

public class Reader {

    private final String nickname;

    private String city;

    private String language;

    private Payment payment;

    public Reader(String nickname, String city, String language, Payment payment) {
        this.nickname = nickname;
        this.city = city;
        this.language = language;
        this.payment = payment;
    }
}
