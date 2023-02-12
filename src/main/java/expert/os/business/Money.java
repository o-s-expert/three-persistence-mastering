package expert.os.business;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Currency;
import java.util.Locale;
import java.util.Objects;

public record Money(Currency currency, BigDecimal value) {

    public static final Money ZERO = new Money(Currency.getInstance(Locale.US), BigDecimal.ZERO);

    public Money sum(Money money) {
        Objects.requireNonNull(money, "money is required");
        if (currency.equals(money.currency)) {
            BigDecimal result = this.value.add(money.value, MathContext.DECIMAL64);
            return new Money(currency, result);
        }
        throw new MoneyCurrencyException("You cannot operate two different currencies: " + currency + " "  + money.currency);
    }
}
