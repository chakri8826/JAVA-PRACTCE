public class Number {
    int n;
    boolean logic;

    public synchronized void push(int n) {
        if (logic) {
            try {
                wait();
            } catch (Exception e) {
            }
        }

        this.n = n;
        logic = true;
        notify();
    }

    public synchronized int pop() {
        if (!logic) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        logic = false;
        notify();
        return this.n;
    }

}
