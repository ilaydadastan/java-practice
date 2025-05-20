package loan_evaluation;

import java.math.BigDecimal;

class LoanEvaluator {
    private static final int MIN_AGE = 18;
    private static final BigDecimal MIN_INCOME = new BigDecimal("2000");
    private static final int MIN_CREDIT_SCORE = 600;

    public LoanDecision evaluate(LoanApplication loanApplication) {
        if (loanApplication.getAge() < MIN_AGE) {
            return LoanDecision.DENIED;
        }

        if (loanApplication.getMonthlyIncome().compareTo(MIN_INCOME) < 0) {
            return LoanDecision.DENIED;
        }

        if (loanApplication.hasExistingDebt()) {
            return LoanDecision.DENIED;
        }

        if (loanApplication.getCreditScore() < MIN_CREDIT_SCORE) {
            return LoanDecision.DENIED;
        }

        return LoanDecision.APPROVED;
    }
}
