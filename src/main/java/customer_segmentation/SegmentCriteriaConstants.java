package customer_segmentation;

import java.math.BigDecimal;

final class SegmentCriteriaConstants {
    static final BigDecimal VIP_INCOME = BigDecimal.valueOf(15_000);
    static final BigDecimal VIP_ASSETS = BigDecimal.valueOf(1_000_000);
    static final BigDecimal PREMIUM_INCOME = BigDecimal.valueOf(7_000);
    static final BigDecimal PREMIUM_ASSETS = BigDecimal.valueOf(200_000);

    private SegmentCriteriaConstants() {
    }

}
