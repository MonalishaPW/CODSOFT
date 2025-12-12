import java.util.Scanner;

// Bank Account Class
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited Successfully!");
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal Successful!");
        }
    }

    public double getBalance() {
        return balance;
    }
}

// ATM Machine Class
class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void showMenu() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double w = sc.nextDouble();
                    account.withdraw(w);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double d = sc.nextDouble();
                    account.deposit(d);
                    break;

                case 3:
                    System.out.println("Current Balance: " + account.getBalance());
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM!");
                    return;

                default:
                    System.out.println("Invalid Option! Try again.");
                     sc.close();
            }
        }
    }
}

// Main Class
public class ATMInterface {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(5000); // Initial Balance = 5000
        ATM atm = new ATM(userAccount);
        atm.showMenu();
        
    }
}
