package Year2023.Task54_TimerRandom;

public class Main {
    static boolean win = false;

    public static void main(String[] args) {
        // Random number
        int random = (int) (Math.random() * 1000000000);
        // Display number
        System.out.println(random);

        // 2 Flow
        // Loop - should be win game!
        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                try {
                    while (!win) {
                        System.out.println(i);
                        i++;
                        // Sleep 1000 sec
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {

                }
            }
        });
        Thread player = new Thread(new Runnable() {
            @Override
            public void run() {
                // Loop run to win
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
