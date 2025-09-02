
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Withdraw method that propagates exception
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Withdrawal failed! Balance is too low.");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + " || Remaining Balance: " + balance);
    }
}

public class W2_day4{
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);

        try {
            account.withdraw(300); 
        } catch (InsufficientBalanceException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("----Program Finished----");
    }
}
