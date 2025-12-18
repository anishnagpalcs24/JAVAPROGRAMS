import java.util.Scanner;

// Base class
class Account {
    String name;
    int accNo;
    double balance;

    Account(String name, int accNo, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited: " + amount);
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}


class SavAcct extends Account {
    double rate = 0.05; // 5% interest

    SavAcct(String name, int accNo, double balance) {
        super(name, accNo, balance);
    }

    void computeInterest() {
        double interest = balance * rate;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

// Current Account
class CurAcct extends Account {
    double minBalance = 1000;
    double penalty = 100;

    CurAcct(String name, int accNo, double balance) {
        super(name, accNo, balance);
    }

    void withdraw(double amount) {
        balance -= amount;

        if (balance < minBalance) {
            balance -= penalty;
            System.out.println("Penalty imposed: " + penalty);
        }
    }
}

// Main class
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SavAcct s = new SavAcct("Ravi", 101, 5000);
        CurAcct c = new CurAcct("Anil", 201, 3000);

        System.out.println("Savings Account:");
        s.deposit(1000);
        s.computeInterest();
        s.withdraw(2000);
        s.displayBalance();

        System.out.println("\nCurrent Account:");
        c.deposit(500);
        c.withdraw(2500);
        c.displayBalance();
    }
}
