package interfaces;

import java.math.BigDecimal;

/**
 * Interface for the computation of sales tax
 */
public interface TaxRateStrategy {

    BigDecimal getSalesTaxAmount(String state, BigDecimal amount);
}
