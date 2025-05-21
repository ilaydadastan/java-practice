package customer_segmentation;

import java.math.BigDecimal;

public class SegmentAssigner {

    private static final BigDecimal VIP_INCOME = new BigDecimal("15000");
    private static final BigDecimal VIP_ASSETS = new BigDecimal("1000000");
    private static final BigDecimal PREMIUM_INCOME = new BigDecimal("7000");
    private static final BigDecimal PREMIUM_ASSETS = new BigDecimal("200000");

    public CustomerSegment assignSegment(Customer customer) {
        if (customer.getMonthlyIncome().compareTo(VIP_INCOME) > 0 ||
                customer.getTotalAssets().compareTo(VIP_ASSETS) > 0) {
            return CustomerSegment.VIP;
        }

        if (customer.getMonthlyIncome().compareTo(PREMIUM_INCOME) > 0 ||
                customer.getTotalAssets().compareTo(PREMIUM_ASSETS) > 0) {
            return CustomerSegment.PREMIUM;
        }

        return CustomerSegment.STANDARD;
    }
}


