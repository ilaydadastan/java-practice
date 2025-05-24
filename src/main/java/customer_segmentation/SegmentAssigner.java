package customer_segmentation;

class SegmentAssigner {
    CustomerSegment assignSegment(Customer customer) {
        if (customer.getMonthlyIncome().compareTo(SegmentCriteriaConstants.VIP_INCOME) > 0 ||
                customer.getTotalAssets().compareTo(SegmentCriteriaConstants.VIP_ASSETS) > 0) {
            return CustomerSegment.VIP;
        }

        if (customer.getMonthlyIncome().compareTo(SegmentCriteriaConstants.PREMIUM_INCOME) > 0 ||
                customer.getTotalAssets().compareTo(SegmentCriteriaConstants.PREMIUM_ASSETS) > 0) {
            return CustomerSegment.PREMIUM;
        }

        return CustomerSegment.STANDARD;
    }
}
