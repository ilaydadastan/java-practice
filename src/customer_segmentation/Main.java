package customer_segmentation;


import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Ilayda",
                new BigDecimal("9000"),
                new BigDecimal("200000")
        );

        SegmentAssigner assigner = new SegmentAssigner();
        CustomerSegment segment = assigner.assignSegment(customer);

        System.out.println("Customer segment: " + segment);
    }
}
