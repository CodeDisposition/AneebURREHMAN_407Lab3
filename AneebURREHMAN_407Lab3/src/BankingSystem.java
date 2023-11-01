public class BankingSystem {
    private Loan[] loanList = new Loan[999999999];
    private int loanCount = 0;
    private static final double baseInterest = 0.02;
    private static final double maxLoan = 300000.00;

    public void disburseLoan(int loanType, double loanAmount) {
        double interestRate;

        if (loanType == 1) {
            interestRate = baseInterest + 0.01;
        } else if (loanType == 2) {
            interestRate = baseInterest + 0.03;
        } else if (loanType == 3) {
            interestRate = baseInterest + 0.04;
        } else {
            System.out.println("Invalid loan type.");
            return;
        }
        if (loanAmount <= maxLoan) {
            if (loanCount < loanList.length) {
                loanList[loanCount] = new Loan(loanAmount, interestRate);
                loanCount++;
                System.out.println("Loan disbursed.");
            } else {
                System.out.println("Loan list is full. Cannot disburse more loans.");
            }
        } else {
            System.out.println("Loan amount exceeds the maximum limit.");
        }
    }

    public void displayAllLoans() {
        int loanIndex = 1;
        for (Loan loan : loanList) {
            String loanType = getLoanType(loan.getInterestRate());
            System.out.println("Loan " + loanIndex + ": Type - " + loanType + ", Amount - $" + loan.getAmount());
            loanIndex++;
        }
    }

    public void loanTotal() {
        double totalLoanAmount = 0;
        double totalOwedAmount = 0;

        for (Loan loan : loanList) {
            totalLoanAmount += loan.getAmount();
            totalOwedAmount += loan.calculateTotalAmountOwed();
        }

        System.out.println("Total Loan Amount: $" + totalLoanAmount);
        System.out.println("Total Owed Amount: $" + totalOwedAmount);
    }

    private String getLoanType(double interestRate) {
        if (interestRate == baseInterest + 0.01) {
            return "House mortgage";
        } else if (interestRate == baseInterest + 0.03) {
            return "Car loan";
        } else {
            return "Personal loan";
        }
    }
}