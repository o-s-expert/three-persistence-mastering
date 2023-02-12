package expert.os.business;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Currency;
import java.util.Locale;
import java.util.Objects;

public record Money(Currency currency, BigDecimal value) {
    public static final Money ZERO = new Money(Currency.getInstance(Locale.US), BigDecimal.ZERO);

    public Money {
        Objects.requireNonNull(currency, "Currency is required");
        Objects.requireNonNull(value, "value is required");
    }

    public Money sum(Money money) {
        Objects.requireNonNull(money, "money is required");
        if (this.currency.equals(money.currency)) {
            BigDecimal result = this.value.add(money.value, MathContext.DECIMAL64);
            return new Money(this.currency, result);
        }
        throw new RuntimeException("There is a currency mistake: " + currency + " " + money.currency);
    }
}
