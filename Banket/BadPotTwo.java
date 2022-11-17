public class BadPotTwo {
    private int servings = 0;
    private int capacity;

    public BadPotTwo(int cap) {
        this.capacity = cap;
    }

    public synchronized void getserving() throws InterruptedException {
        if (servings == 0) {
            System.out.println(Thread.currentThread().getName() + " go walk");
        } else {
            servings--;
            System.out.println(Thread.currentThread().getName() + " is served");
            print_servings();
        }
    }

    public synchronized void fillpot() throws InterruptedException {
        if (servings > 0) {
            System.out.println(Thread.currentThread().getName() + " go walk");
        } else {
            servings = capacity;
            System.out.println(Thread.currentThread().getName() + " filled the pot");
            print_servings();
        }
    }

    // only for trace purposes
    public synchronized void print_servings() {
        System.out.println("servings in the pot: " + servings);
    }
}
