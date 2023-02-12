package expert.os.business;

import java.util.Objects;

public class MovieGoer {

    private final String nickname;

    private String city;

    private Payment payment;

    public MovieGoer(String nickname, String city, Payment payment) {
        this.nickname = nickname;
        this.city = city;
        this.payment = payment;
    }

    public String getNickname() {
        return nickname;
    }

    public String getCity() {
        return city;
    }

    public Payment getPayment() {
        return payment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MovieGoer movieGoer = (MovieGoer) o;
        return Objects.equals(nickname, movieGoer.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nickname);
    }

    public void pay(Product product) {
        this.payment.pay(product);
    }
}
