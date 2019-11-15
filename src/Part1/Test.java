package Part1;

public class Test {
    public static void main(String[] args) throws InterruptedException {
    MyThread myThread = new MyThread();
        for (Class c : myThread.getClass().getInterfaces()) {
            System.out.println(c.getSimpleName());
        }
    }
}
