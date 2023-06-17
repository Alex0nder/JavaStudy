package Year2023.Task51_Multithreading;

public class Main {

    // Create win. have false
    static boolean win = false;

    // math random * 1,000,000,000
    public static void main(String[] args) {
        int random = (int) (Math.random() * 1000000000);
        System.out.println(random);
        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                try {
                    while (!win) {
                        System.out.println(i);
                        i++;
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) { }
            }
        });
        Thread player = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!win) {
                    int guessNumber = (int) (Math.random() * 1000000000);
                    if (guessNumber == random) {
                        win = true;
                        System.out.println(guessNumber);
                    }
                }
            }
        });
        timer.start();
        player.start();
    }
}
