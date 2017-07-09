import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {

    public void count(int start,int end) {
        Lock lock = new ReentrantLock();
        lock.lock();
        int array[] = Main.getArray();
        int sum = Main.getSum();
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
        Main.setSum(sum);
        lock.unlock();
    }

    public void run(int start, int end) {
        count(start, end);
    }
}
