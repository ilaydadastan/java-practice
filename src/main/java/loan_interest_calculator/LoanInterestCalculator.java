package loan_interest_calculator;

import java.math.BigDecimal;

class LoanInterestCalculator {

    BigDecimal calculateRepayment(BigDecimal loanAmount, BigDecimal annualInterestRate, int loanTermInYears) {

        BigDecimal interest = loanAmount.multiply(annualInterestRate)
                .multiply(BigDecimal.valueOf(loanTermInYears));

        return loanAmount.add(interest);
    }
}
