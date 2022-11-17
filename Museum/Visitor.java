package Museum;

public class Visitor {
    Control c;

    public Visitor(Control c) {
        this.c = c;
    }

    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + " Visitor would like to enter the museum");
            try {
                // TODO: NO se...
                Thread.sleep(200);
                c.arrive();
                Thread.sleep(200);
                c.leave();
            } catch (InterruptedException e) {
            }
        }
    }
}
