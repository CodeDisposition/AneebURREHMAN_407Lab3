public class Loan {
    private double amount;
    private double interestRate;

    public Loan(double amount, double interestRate) {
        this.amount = amount;
        this.interestRate = interestRate;
    }

    public double getAmount() {
        return amount;
    }

    public double calculateTotalAmountOwed() {
        return amount * (1 + interestRate);
    }

    public double getInterestRate() {
        return interestRate;
    }
}