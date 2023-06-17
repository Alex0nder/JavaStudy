package Year2023.Task53_Multithreading;

public class Timer1 {
    public static void main(String[] args) {
        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                // Error but Loop
                try {
                    int i = 0;
                    while (true) {
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

        // Two timer - number 2 or i
//        Thread timer2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                // Error but Loop
//                try {
//                    for (int i = 0; i < 1000000; i++) {
//                        System.out.println(2);
//                        Thread.sleep(1000);
//                    }
//                    // catch error
//                } catch (Exception e) {
//
//                }
//            }
//        });
//        timer2.start();

//        RunnableTimer runnableTimer = new RunnableTimer();
        // main flow
//        Thread timer = new Thread(runnableTimer);

//        for (int i = 0; i < 1000000; i++) {
//            System.out.println(2);
//        }
    }
}
