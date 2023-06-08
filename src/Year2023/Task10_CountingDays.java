package Year2023;

public class Task10_CountingDays {
    public static void main(String[] args) {
        int days = 365;
        int years = days / 365;
        int month = (days % 365) / 31;
        int leftDays = days - years * 365 - month * 31;
        System.out.println("Total number of days: " + days);
        System.out.println("Years: " + years);
        System.out.println("Month: " + month);
        System.out.println("Days " + leftDays);
    }
}
