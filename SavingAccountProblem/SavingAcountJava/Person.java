package SavingAccountProblem.SavingAcountJava;
import java.util.Random;

public class Person extends Thread {

    Account account;
    Random random = new Random();

    public Person(Account a) {
        this.account = a;
    }

    public void run() {
        int quantity = 0;

        while (true) {
            quantity = random.nextInt(20);
            if (random.nextInt(2) == 0) {
                try {
                    System.out.println(Thread.currentThread().getName() + " wants a cookie and wants to withdraw");
                    Thread.sleep(200);
                    account.withdraw(quantity);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    System.out.println(
                            Thread.currentThread().getName() + " has worked a lot and wants to deposit the earnings");
                    Thread.sleep(200);

                    account.deposit(quantity);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
