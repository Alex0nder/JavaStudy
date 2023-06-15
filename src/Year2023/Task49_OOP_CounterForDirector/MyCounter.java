package Year2023.Task49_OOP_CounterForDirector;

public class MyCounter implements Counter {
    @Override
    public String report(int countOfMonths) {
        return "Report for " + countOfMonths + " months";
    }
}
