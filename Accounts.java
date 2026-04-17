abstract class Accounts {
    double balance;
    int accountNumber;
    String accountHoldersName;
    String address;

    Accounts(double bal, int accNo, String name, String addr) {
        balance = bal; accountNumber = accNo;
        accountHoldersName = name; address = addr;
    }

    abstract void withdraw(double amount);
    abstract void deposit(double amount);

    void display() {
        System.out.println("Account No: " + accountNumber +
            " | Holder: " + accountHoldersName +
            " | Balance: " + balance);
    }
}

class SavingsAccount extends Accounts {
    double rateOfInterest;

    SavingsAccount(double bal, int accNo, String name, String addr, double rate) {
        super(bal, accNo, name, addr);
        rateOfInterest = rate;
    }

    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient funds!");
    }

    public void deposit(double amount) { balance += amount; }

    double calculateAmount() { return balance + (balance * rateOfInterest / 100); }
}

public class AccountsDemo {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(5000, 101, "Alice", "123 Main St", 5.0);
        sa.deposit(1000);
        sa.withdraw(500);
        sa.display();
        System.out.println("Amount with interest: " + sa.calculateAmount());
    }
}
