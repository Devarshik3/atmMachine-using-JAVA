package atmMachine;
import java.util.Scanner;

class ATMOperationsImpl implements ATMOperations {
    private static Scanner input = new Scanner(System.in);
    private static int pin;
    private double balance;
    private int accountNumber;

    public ATMOperationsImpl(int accountNumber, int pin) {
        this.balance = 0;
        this.accountNumber = accountNumber;
        ATMOperationsImpl.pin = pin;
    }


    public void withdraw() {
        System.out.println("Please enter the amount to withdraw:");
        double amount = input.nextDouble();
        input.nextLine();

        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Please take your cash");
            System.out.println("Your new balance is: " + balance);
        } else {
            System.out.println("Invalid amount entered or insufficient balance");
        }
    }

    public void deposit() {
        System.out.println("Please enter the amount to deposit:");
        double amount = input.nextDouble();
        input.nextLine();

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful");
            System.out.println("Your new balance is: " + balance);
        } else {
            System.out.println("Invalid amount entered");
        }
    }

    public void checkBalance() {
        System.out.println("Your balance is: " + balance);
    }

    public void changePIN() {
        System.out.println("Please enter your current PIN:");
        int currentPIN = input.nextInt();
        input.nextLine();

        if (currentPIN == pin) {
            System.out.println("Please enter your new PIN:");
            int newPIN = input.nextInt();
            pin = newPIN;
            System.out.println("PIN changed successfully");
        } else {
            System.out.println("Invalid PIN entered");
        }
    }
}