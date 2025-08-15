/*
 * With public fields, there’s no control.
 * With private + getters/setters, you create a controlled access point where you can add rules, validation, security, and logging.
 * 
 */

class BankAccount {
    private double balance; // private - hidden

    // Getter
    public double getBalance() {
        return balance;
    }

    // Setter with validation
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance! Cannot set negative value.");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setBalance(1000);
        System.out.println("Initial Balance: " + account.getBalance());

        // Attempt invalid value
        account.setBalance(-5000);
        System.out.println("After Attempt: " + account.getBalance());
    }
}

