package Year2023;

public class Task11_CountingTime {
    public static void main(String[] args) {
        //Data = sec
        int seconds = 1000000;

        //How much seconds in minutes
        int secondsInMinutes = 60;
        int secondInHours = secondsInMinutes * 60;
        int secondsInDays = secondInHours * 24;

        //Total days — it is equal to the total number of seconds divided by the number of seconds in days
        int days = seconds / secondsInDays;

        //Total hours — we take the remainder of the division (from the previous action) and divide it by the number of seconds in hours
        int hours = (seconds % secondsInDays) / secondInHours;

        //Total minutes — we take the remainder of the division (from the previous action) and divide it by the number of seconds in minutes
        int minutes = ((seconds % secondsInDays) % secondInHours) / secondsInMinutes;

        //Total seconds — we take the total number of seconds and subtract the number of seconds it took to form days, hours and minutes
        int leftSeconds = seconds - days * secondsInDays - hours * secondInHours - minutes * secondsInMinutes;

        //Display the information
        System.out.println("Given seconds: " + seconds);
        System.out.println("Days: " + days);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + leftSeconds);
    }
}
