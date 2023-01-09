package enums;

import java.math.BigDecimal;

/**
 * Enums of each states and their corresponding tax rates
 */
public enum StateTaxRate {
    MN(BigDecimal.valueOf(0.0675), "MN"),
    NY(BigDecimal.valueOf(0.04), "NY"),
    NM(BigDecimal.valueOf(0.05125), "NM"),
    TX(BigDecimal.valueOf(0.0625), "TX"),
    CA(BigDecimal.valueOf(0.065), "CA");

    public BigDecimal taxRate;
    public String state;

    private StateTaxRate(BigDecimal taxRate, String state) {
        this.taxRate = taxRate;
        this.state = state;
    }

    private StateTaxRate(String state) {
        this.state = state;
    }

    public String getState(){
        return this.state;
    }

    private StateTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public BigDecimal getTaxRate(){
        return this.taxRate;
    }

}
