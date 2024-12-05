package assignment9;
import java.util.Scanner;

class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private double balance;
    private double dailyWithdrawalLimit = 5000.0;
    private double amountWithdrawnToday;

    // Constructor to create a new account
    public BankAccount(String accountHolderName, String accountNumber, double initialDeposit) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
        this.amountWithdrawnToday = 0;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount! Please enter a positive amount.");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount! Please enter a positive amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds! Your balance is: " + balance);
        } else if (amount + amountWithdrawnToday > dailyWithdrawalLimit) {
            System.out.println("Withdrawal failed! You have exceeded the daily withdrawal limit of " + dailyWithdrawalLimit);
        } else {
            balance -= amount;
            amountWithdrawnToday += amount;
            System.out.println("Withdrawal successful! New balance: " + balance);
        }
    }

    // Check balance
    public double getBalance() {
        return balance;
    }

    // Display account information
    public void displayAccountInfo() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

 class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = null;

        while (true) {
            System.out.println("\nBanking System Menu:");
            System.out.println("1. Create an account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Check balance");
            System.out.println("5. Display Account Information");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (option) {
                case 1:
                    // Create an account
                    System.out.print("Enter Account Holder Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Account Number: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("Enter Initial Deposit: ");
                    double initialDeposit = scanner.nextDouble();

                    if (initialDeposit >= 0) {
                        account = new BankAccount(name, accountNumber, initialDeposit);
                        System.out.println("Account created successfully!");
                    } else {
                        System.out.println("Initial deposit cannot be negative.");
                    }
                    break;

                case 2:
                    // Deposit money
                    if (account != null) {
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                    } else {
                        System.out.println("No account found. Please create an account first.");
                    }
                    break;

                case 3:
                    // Withdraw money
                    if (account != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawalAmount = scanner.nextDouble();
                        account.withdraw(withdrawalAmount);
                    } else {
                        System.out.println("No account found. Please create an account first.");
                    }
                    break;

                case 4:
                    // Check balance
                    if (account != null) {
                        System.out.println("Your current balance is: " + account.getBalance());
                    } else {
                        System.out.println("No account found. Please create an account first.");
                    }
                    break;

                case 5:
                    // Display account information
                    if (account != null) {
                        account.displayAccountInfo();
                    } else {
                        System.out.println("No account found. Please create an account first.");
                    }
                    break;

                case 6:
                    // Exit
                    System.out.println("Thank you for using the Banking System!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option! Please choose a valid option.");
            }
        }
    }
}

