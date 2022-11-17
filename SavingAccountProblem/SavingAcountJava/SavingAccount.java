package SavingAccountProblem.SavingAcountJava;
public class SavingAccount {

    public static void main(String args[]) {
        Account acc = new Account(50);

        Thread a = new Person(acc);
        a.setName("alice");
        Thread b = new Person(acc);
        b.setName("bob");

        Thread c = new Company(acc);
        c.setName("company");

        a.start();
        b.start();
        c.start();

    }
}
