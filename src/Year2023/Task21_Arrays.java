package Year2023;

public class Task21_Arrays {
    public static void main(String[] args) {
        //Use more Arrays, but it's not normal code
//        int[] daysInMonth = new int[13];
//        daysInMonth[0] = 31;
//        daysInMonth[1] = 28;
//        daysInMonth[2] = 31;
//        daysInMonth[3] = 30;
//        daysInMonth[4] = 31;
//        daysInMonth[5] = 30;
//        daysInMonth[6] = 31;
//        daysInMonth[7] = 30;
//        daysInMonth[8] = 31;
//        daysInMonth[9] = 30;
//        daysInMonth[10] = 31;
//        daysInMonth[11] = 30;
//        daysInMonth[12] = 31;
//
//        for (int i = 0; i < daysInMonth.length; i++) {
//            System.out.println(daysInMonth[i]);
//        }

        //Array 100 - 1 = 99
        int[] nums = new int[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i * 10;
        }

//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }

        // Loop — When we use for each (for everyone)
        // This loop can't = new elements
        for (int i : nums) {
            System.out.println(i);
        }
        //Array char - This array will not be displayed because it has an empty value
        char[] chars = new char [10];
        for (char ch : chars) {
            System.out.println(ch);
        }
    }
}
