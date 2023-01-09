package services;

import enums.StateTaxRate;
import interfaces.TaxRateStrategy;

import java.math.BigDecimal;

/**
 * Retrieves the corresponding tax rate of the desired state
 * and computes the sales tax amount
 */

public class SalesTaxStrategy implements TaxRateStrategy {

    /**
     * Retrieves the corresponding tax rate of the desired state
     * @param stateStr String State
     * @param amount BigDecimal Amount
     * @return salesTaxAmount BigDecimal
     */
    public BigDecimal getSalesTaxAmount(String stateStr, BigDecimal amount) {
        BigDecimal salesTax = BigDecimal.ZERO;

        switch(StateTaxRate.valueOf(stateStr)) {
            case MN:
                salesTax = computeTaxAmount(amount,StateTaxRate.MN.taxRate);
                break;
            case CA:
                salesTax = computeTaxAmount(amount,StateTaxRate.CA.taxRate);
                break;
            case NY:
                salesTax = computeTaxAmount(amount,StateTaxRate.NY.taxRate);
                break;
            case NM:
                salesTax = computeTaxAmount(amount,StateTaxRate.NM.taxRate);
                break;
            case TX:
                salesTax = computeTaxAmount(amount,StateTaxRate.TX.taxRate);
                break;
        }
        return salesTax;
    }

    /**
     * Computes Total Amount with Sales Tax
     * @param amount BigDecimal Amount
     * @param taxRate BigDecimal Tax Rate
     * @return salesTaxAmount (Sales Tax % * Amount)
     */
    private BigDecimal computeTaxAmount (BigDecimal amount, BigDecimal taxRate){
        System.out.println("Amount: "+amount);
        System.out.println("TaxRate: "+taxRate);
        return taxRate.multiply(amount);
    }

}
