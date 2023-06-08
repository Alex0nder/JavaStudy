package Year2023;

public class Task5_DataTimeFormat {
    //Information about the system
    public static void main(String[] args) {
        System.out.println("Information about the system");
        System.out.print("Operation system: ");
        System.out.println(System.getProperty("os.name") + " " + System.getProperty("os,version"));
        System.out.println("Number of cores");
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println("The amount of memory available to the JVM");
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024 + "Mb");
    }
}
