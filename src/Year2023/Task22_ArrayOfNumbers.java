package Year2023;

public class Task22_ArrayOfNumbers {
    public static void main(String[] args) {
        // Array from 100 to 1000
        int[] first = new int[901];

        // Loop this elements Array
        for (int i = 0; i < first.length; i++) {
            first[i] = i + 100;
        }

        // New Array = first to second
        // To be sure, the first array is the same as the second
        int[] second = new int[first.length];

        // Loop for each show second array
        for (int i = 0, j = first.length - 1; i < first.length; i++, j--) {
            second[j] = first[i];
        }
        // Loop for second
        for (int i : second) {
            System.out.println(i);
        }
    }
}
