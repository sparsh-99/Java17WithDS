package ExceptionHandling;

class InsuffiencedBalanceException extends Exception {
    public InsuffiencedBalanceException(String message) {
        super(message);
    }
}
class BankAccount {
    private double balance = 1000;
    public void withdrawal(double amount) throws InsuffiencedBalanceException {
        if(amount > balance) {
            throw new InsuffiencedBalanceException("Insufficient Balance");
        }
        balance -= amount;
        System.out.println("Withdrawal Successful. New Balance: " + balance);
    }

}

public class CustomException {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        try {
            account.withdrawal(1200);
        } catch (InsuffiencedBalanceException e) {
            System.out.println(e.getMessage());
        }

    }
}
