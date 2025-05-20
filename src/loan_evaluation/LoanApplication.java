package loan_evaluation;

import java.math.BigDecimal;

class LoanApplication {
    private final String applicantName;
    private final int age;
    private final BigDecimal monthlyIncome;
    private final boolean hasExistingDebt;
    private final int creditScore;

    public LoanApplication(String applicantName, int age, BigDecimal monthlyIncome,
                           boolean hasExistingDebt, int creditScore) {
        this.applicantName = applicantName;
        this.age = age;
        this.monthlyIncome = monthlyIncome;
        this.hasExistingDebt = hasExistingDebt;
        this.creditScore = creditScore;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public int getAge() {
        return age;
    }

    public BigDecimal getMonthlyIncome() {
        return monthlyIncome;
    }

    public boolean hasExistingDebt() {
        return hasExistingDebt;
    }

    public int getCreditScore() {
        return creditScore;
    }
}
