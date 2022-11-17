package SavingAccountProblem.SavingAcountJava;
public class Account extends Thread {

    private int balance = 0;

    private int maxBalance;

    public Account(int maxBalance) {
        this.maxBalance = maxBalance;
    }

    public synchronized void withdraw(int quantity) throws InterruptedException {
        if (quantity > balance) {
            System.out.println(Thread.currentThread().getName() + " is going to earn some money");
        } else {
            balance -= quantity;
            System.out.println(Thread.currentThread().getName() + " withdraws " + quantity);
            print_balance();
        }
    }

    public synchronized void deposit(int quantity) throws InterruptedException {
        if (balance + quantity > maxBalance) {
            System.out.println(Thread.currentThread().getName() + " is going to spend some money");
        } else {
            balance += quantity;
            System.out.println(Thread.currentThread().getName() + " deposits " + quantity);
            print_balance();
        }
    }

    public synchronized void print_balance() {
        System.out.println("Balance in the account: " + balance);
    }

}