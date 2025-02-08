public class Number {
    int n;
    boolean logic;

    synchronized public void push(int n) {
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

    synchronized public int pop() {
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
