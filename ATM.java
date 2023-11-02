package atmMachine;
import java.util.Scanner;

public class ATM {
    private static Scanner input = new Scanner(System.in);
    private static double balance = 0;
   

    public static void main(String[] args) {
        System.out.println("Welcome to XYZ Bank ATM");
        System.out.println("Please enter your account number:");
        int accountNumber = input.nextInt();
        input.nextLine(); // consume the newline character

        System.out.println("Please enter your PIN:");
        int pin = input.nextInt();
        input.nextLine(); // consume the newline character

        ATMOperations atmOperations = new ATMOperationsImpl(accountNumber, pin);
        boolean exit = false;
        while (!exit) {
            System.out.println("Please select an option:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Change PIN");
            System.out.println("5. Exit");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    atmOperations.withdraw();
                    break;
                case 2:
                    atmOperations.deposit();
                    break;
                case 3:
                    atmOperations.checkBalance();
                    break;
                case 4:
                    atmOperations.changePIN();
                    break;
                case 5:
                    System.out.println("Thank you for using XYZ Bank ATM");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option selected");
                    break;
            }
        }
    }
}
