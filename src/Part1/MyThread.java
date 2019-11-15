package Part1;

import java.io.Serializable;
import java.util.concurrent.Callable;

public class MyThread implements Runnable, Serializable, Callable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    @Override
    public Object call() throws Exception {
        return null;
    }
}
