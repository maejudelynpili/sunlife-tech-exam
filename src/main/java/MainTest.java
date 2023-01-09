import services.SalesTaxStrategy;

import java.math.BigDecimal;

public class MainTest {
    public static void main(String[] args) {

        SalesTaxStrategy salesTax = new SalesTaxStrategy();
        BigDecimal taxRate = salesTax.getSalesTaxAmount("MN",BigDecimal.TEN);

        System.out.println(taxRate);
    }
}
