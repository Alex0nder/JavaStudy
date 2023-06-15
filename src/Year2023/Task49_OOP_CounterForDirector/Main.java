package Year2023.Task49_OOP_CounterForDirector;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        // First variant, methods have 2 arguments
        // counter + Number months

        director.force(new Counter() {
            @Override
            public String report(int countOfMonths) {
                return "Report for " + countOfMonths + " months";
            }
        }, 12);

        // Second variant
        MyCounter counter = new MyCounter();
        director.force(counter, 12);
    }
}
