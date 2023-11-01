import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankingSystem bankingSystem = new BankingSystem();

        while (true) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Disburse a Loan");
            System.out.println("2. Show the list of all loans");
            System.out.println("3. Show sum of all loans");
            System.out.println("4. Exit");
            System.out.print("Select Option: ");

            int selection = scanner.nextInt();
            scanner.nextLine();

            if (selection == 1) {
                System.out.println("\nSelect the loan type:");
                System.out.println("1. House mortgage");
                System.out.println("2. Car loan");
                System.out.println("3. Personal loan");
                System.out.print("Enter loan type: ");
                int loanType = scanner.nextInt();
                System.out.print("Enter loan amount: $");
                double loanAmount = scanner.nextDouble();
                scanner.nextLine();
                bankingSystem.disburseLoan(loanType, loanAmount);
            } else if (selection == 2) {
                System.out.println("\nList of all loans:");
                bankingSystem.displayAllLoans();
            } else if (selection == 3) {
                System.out.println("\nSum of all loans:");
                bankingSystem.loanTotal();
            } else if (selection == 4) {
                System.out.println("Exiting. \nThank you for using this system!");
                System.exit(0);
            } else if (selection != 1 ||selection != 2 || selection != 3 || selection != 4) {
                System.out.println("Invalid entry, Please select a valid entry.");
            }
        }
    }
}