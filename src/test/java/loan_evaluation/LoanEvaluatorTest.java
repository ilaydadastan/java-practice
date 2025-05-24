package loan_evaluation;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class LoanEvaluatorTest {
    @Test
    void shouldApproveLoanWhenAllCriteriaAreMet() {
        // Given
        LoanApplication application = new LoanApplication(
                "Ilayda",
                28,
                new BigDecimal("3500"),
                false,
                700
        );
        LoanEvaluator evaluator = new LoanEvaluator();

        // When
        LoanDecision decision = evaluator.evaluate(application);

        // Then
        assertEquals(LoanDecision.APPROVED, decision);
    }
}
