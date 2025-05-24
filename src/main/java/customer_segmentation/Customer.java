package customer_segmentation;

import java.math.BigDecimal;

public class Customer {
    private final String name;
    private final BigDecimal monthlyIncome;
    private final BigDecimal totalAssets;

    public Customer(String name, BigDecimal monthlyIncome, BigDecimal totalAssets) {
        this.name = name;
        this.monthlyIncome = monthlyIncome;
        this.totalAssets = totalAssets;
    }

    public BigDecimal getMonthlyIncome() {
        return monthlyIncome;
    }

    public BigDecimal getTotalAssets() {
        return totalAssets;
    }

}
