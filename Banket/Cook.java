public class Cook extends Thread {

    BadPotTwo pot;

    public Cook(BadPotTwo p) {
        this.pot = p;
    }

    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + " would like to fill the pot");
            try {
                Thread.sleep(200);
                pot.fillpot();
            } catch (InterruptedException e) {
            }
        }
    }

}
