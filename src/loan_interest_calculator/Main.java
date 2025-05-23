package loan_interest_calculator;

import java.math.BigDecimal;

class Main {
    public static void main(String[] args) {

        BigDecimal loanAmount = BigDecimal.valueOf(10000);
        BigDecimal annualInterestRate = BigDecimal.valueOf(0.06);
        int loanTermInYears = 3;

        LoanInterestCalculator calculator = new LoanInterestCalculator();
        BigDecimal totalRepayment = calculator.calculateRepayment(loanAmount, annualInterestRate, loanTermInYears);

        System.out.println("Total repayment amount: " + totalRepayment);

    }
}
