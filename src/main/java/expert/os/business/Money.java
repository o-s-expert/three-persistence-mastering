package expert.os.business;

import java.math.BigDecimal;
import java.util.Currency;

public record Money(Currency currency, BigDecimal value) {
}
