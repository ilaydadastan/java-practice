package customer_segmentation;


import java.math.BigDecimal;

class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Ilayda",
                BigDecimal.valueOf(9000),
                BigDecimal.valueOf(200_000)
        );

        SegmentAssigner assigner = new SegmentAssigner();
        CustomerSegment segment = assigner.assignSegment(customer);

        System.out.println("Customer segment: " + segment);
    }
}
