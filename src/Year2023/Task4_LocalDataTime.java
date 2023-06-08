package Year2023;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task4_LocalDataTime {
    public static void main(String[] args) {
        //Data time format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss MM/dd/yyyy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(formatter));
    }
}
