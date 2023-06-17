package Year2023.Task51_Multithreading;

public class RunnableTimer implements Runnable {
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            System.out.println(i);
        }
    }
}
