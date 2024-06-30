package encapsulation;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        // Setting a valid pin from the User
        System.out.println("Set your PIN: ");
        int userPin = scanner.nextInt();
        bank.setPin(userPin);

        // Simulating an ATM withdrawal
        System.out.println("Enter your PIN to withdraw: ");
        int enteredPin = scanner.nextInt();

        if (bank.validatePin(enteredPin)) {
            System.out.println("PIN validated. You can withdraw your money.");
        } else {
            System.out.println("Invalid PIN. Transaction denied.");
        }

        scanner.close();
    }
}