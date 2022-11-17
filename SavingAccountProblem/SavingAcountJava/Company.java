package SavingAccountProblem.SavingAcountJava;
import java.util.Random;

public class Company extends Thread {

    Account account;
    Random random = new Random();

    public Company(Account a) {
        this.account = a;
    }

    public void run() {
        int quantity = 0;

        while (true) {
            quantity = random.nextInt(20);
            try {
                System.out.println(
                        Thread.currentThread().getName() + " wants to deposit the earnings");

                Thread.sleep(2000);

                account.deposit(quantity);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
