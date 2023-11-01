import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Account {
    private String accountNumber;
    private String pin;
    private double balance;
    private List<String> transactionHistory;

    public Account(String accountNumber, String pin) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public boolean validatePin(String pin) {
        return this.pin.equals(pin);
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        String transaction = "Deposit: +" + amount;
        transactionHistory.add(transaction);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            String transaction = "Withdrawal: -" + amount;
            transactionHistory.add(transaction);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void transfer(Account receiver, double amount) {
        if (balance >= amount) {
            balance -= amount;
            receiver.deposit(amount);

            String transaction = "Transfer: -" + amount + " (To Account: " + receiver.getAccountNumber() + ")";
            transactionHistory.add(transaction);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void printTransactionHistory() {
        System.out.println("\nTransaction History:");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
            System.out.println("Balance: "+balance);
        }
    }
}
class BalanceInquiry {
    private Account account;

    public BalanceInquiry(Account account) {
        this.account = account;
    }

    public double getBalance() {
        return account.getBalance();
    }
}

class ATM {
    private List<Account> accounts;
    private Account currentAccount;
    private Scanner scanner;

    public ATM() {
        accounts = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void run() {
        boolean exit = false;
        while (!exit) {
            System.out.println("\nWelcome to the ATM.");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.println("\nEnter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Take user choice

            switch (choice) {
                case 1:
                    register();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    exit = true;
                    System.out.println("\nThank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void register() {
        System.out.println("\nRegistration Form");
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter PIN: ");
        String pin = scanner.nextLine();

        Account account = new Account(accountNumber, pin);
        accounts.add(account);

        System.out.println("\nRegistration successful. \n");
    }

    private void login() {
        System.out.println("\nLogin Form");
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter PIN: ");
        String pin = scanner.nextLine();

        Account account = findAccount(accountNumber);
        if (account != null && account.validatePin(pin)) {
            currentAccount = account;
            showMenu();
        } else {
            System.out.println("Invalid account number or PIN.");
        }
    }

    private void showMenu() {
        boolean logout = false;
        while (!logout) {
            System.out.println("\nWelcome, " + currentAccount.getAccountNumber() + "!");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer");
            System.out.println("4. Transaction History");
            System.out.println("5. Show Balance");
            System.out.println("6. Logout");
            System.out.println("\nEnter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Take user input

            switch (choice) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    transfer();
                    break;
                case 4:
                    currentAccount.printTransactionHistory();
                    break;
                case 5:
                    checkBalance();
                    break;
                case 6:
                    logout = true;
                    currentAccount = null;
                    break;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }
        }
    }
    private void checkBalance() {
        BalanceInquiry balanceInquiry = new BalanceInquiry(currentAccount);
        double balance = balanceInquiry.getBalance();
        System.out.println("\nYour account balance is: " + balance);
    }

    private void deposit() {
        System.out.print("\nEnter deposit amount: ");
        double amount = scanner.nextDouble();
        currentAccount.deposit(amount);
        System.out.println("\nDeposit successful of amount "+amount);
    }

    private void withdraw() {
        System.out.print("\nEnter withdrawal amount: ");
        double amount = scanner.nextDouble();
        currentAccount.withdraw(amount);
        System.out.println("\nWithdrawal successful of amount "+amount);
    }

    private void transfer() {
        System.out.print("Enter receiver's account number: ");
        String receiverAccountNumber = scanner.nextLine();
        Account receiver = findAccount(receiverAccountNumber);
        if (receiver != null) {
            System.out.print("Enter transfer amount: ");
            double amount = scanner.nextDouble();
            currentAccount.transfer(receiver, amount);
        } else {
            System.out.println("Receiver's account not found.");
        }
    }

    private Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.run();
    }
}