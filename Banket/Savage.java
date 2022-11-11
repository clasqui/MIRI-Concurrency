public class Savage extends Thread {

    BadPot pot;

    public Savage(BadPot p) {
        this.pot = p;
    }

    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + " is hungry and would like to eat");
            try {
                Thread.sleep(200);
                pot.getserving();
            } catch (InterruptedException e) {};
        }
    }

}

