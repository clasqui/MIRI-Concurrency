package Museum;

public class Control {
    int count = 0;
    boolean opened = false;

    public synchronized void arrive() throws InterruptedException {
        while (!opened) {
            wait();
        }
        // update count
        count++;
    }

    public synchronized void leave() throws InterruptedException {
        while (count <= 0) {
            wait();
        }
        // update count
        count--;

        // TODO: WTF
        // if (count == 0) {

        // }
    }

    public synchronized void open() throws InterruptedException {
        opened = true;
        System.out.println(Thread.currentThread().getName() + " Museum is open");
    }

    public synchronized void close() throws InterruptedException {
        opened = false;
        System.out.println(Thread.currentThread().getName() + " Museum is closed");

    }
}
