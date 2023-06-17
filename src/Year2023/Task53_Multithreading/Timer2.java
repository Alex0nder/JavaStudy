package Year2023.Task53_Multithreading;

public class Timer2 {

    static boolean isFive = false;
    public static void main(String[] args) {
        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                // Error but Loop
                try {
                    int i = 0;
                    while (true) {
                        if (i == 5) {
                            isFive = true;
                        }
                        System.out.println(i);
                        i++;
                        Thread.sleep(1000);
                    }

//                    for (int i = 0; i < 1000000; i++) {
//
//                    }
                    // catch error
                } catch (Exception e) {

                }
            }
        });
        timer.start();
        Thread timer2 = new Thread(new Runnable() {
            @Override
            public void run() {
                // Error but Loop
                try {
                    int i = 0;
                    while (!isFive) {
                        System.out.println(i);
                        i++;
                        Thread.sleep(1000);
                    }

//                    for (int i = 0; i < 1000000; i++) {
//
//                    }
                    // catch error
                } catch (Exception e) {

                }
            }
        });
        timer2.start();
    }
}
