package ch14.lecture.p2concurrency;

public class C03SynchronizedMethod {
    public static void main(String[] args) {

    }
}

class MyObject3 implements Runnable {
    private long value;

    public long getValue() {
        return value;
    }

    public synchronized void update() {
        for (int i = 0; i < 30000; i++) {
            value++;
        }
    }

    @Override
    public void run() {
        update();
    }
}
