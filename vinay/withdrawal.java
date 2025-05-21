
package vinay;

public class withdrawal {
    private int balance;

    public withdrawal() {
        this.balance = 1000; // Initial balance for testing
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Error: Insufficient funds. Current balance: " + balance);
            return;
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Amount withdrawn: " + amount + ", New balance: " + balance);
    }

    public static void main(String[] args) {
        withdrawal account = new withdrawal();
        System.out.println("Initial balance: " + account.balance);
        account.withdraw(500);  // Valid withdrawal
        account.withdraw(600);  // Insufficient funds
        account.withdraw(-100); // Invalid amount
    }
}