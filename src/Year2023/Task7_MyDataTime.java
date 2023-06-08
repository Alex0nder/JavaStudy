package Year2023;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task7_MyDataTime {
    public static void main(String[] args) {
        //DataTime RU — Jar file
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(formatter));
    }
}
