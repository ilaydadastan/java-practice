package loan_evaluation;

import java.math.BigDecimal;

class Main {
    public static void main(String[] args) {
        LoanApplication application = new LoanApplication(
                "Ilayda",
                30,
                BigDecimal.valueOf(3000),
                false,
                720
        );

        LoanEvaluator evaluator = new LoanEvaluator();
        LoanDecision decision = evaluator.evaluate(application);

        System.out.println("Loan decision: " + decision);
    }
}
