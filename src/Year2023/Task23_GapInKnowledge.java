package Year2023;

public class Task23_GapInKnowledge {
    public static void main(String[] args) {

        //Array int to index
//        int[] dayOfMonth = new int[12];
//        dayOfMonth[0] = 12;


        //Array int right now
//        int[] dayOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        //Loop for
//        for (int i : dayOfMonth) {
//            System.out.println(i);
//        }


        //Array string — My Name and How many years + quotes and spaces
//        String name = "Alexander Young";
//        int age = 33;
//        String result = "Hello \"" + name + "\"! \nYou are " + age + " years old.";
//        System.out.println(result);

        //Array month => Calendar
//        String[] namesOfMonth = {
//                "January",
//                "February",
//                "March",
//                "April",
//                "May",
//                "June",
//                "July",
//                "August",
//                "September",
//                "October",
//                "November",
//                "December"
//        };
//        //Empty string
//        String result = "";
//
//        //Loop
//        for (int i = 0; i < namesOfMonth.length; i++) {
//            result += namesOfMonth[i];
//            if (i == namesOfMonth.length - 1) {
//                result += ".";
//            } else {
//                result += ", ";
//            }
//        }
//        System.out.println(result);

        // Array have months and months have number and submit his name in display. If we don't have month, so show text "This month does not exist"
        int numberOfMoth = 6;

        // The code is too huge and unreadable
//        if (numberOfMoth == 1) {
//            System.out.println("January");
//        } else if (numberOfMoth == 2) {
//            System.out.println("February");
//        } else if (numberOfMoth ==3) {
//            System.out.println("March");
//        } else if (numberOfMoth == 4) {
//            System.out.println("April");
//        } else if (numberOfMoth == 5) {
//            System.out.println("May");
//        } else if (numberOfMoth == 6) {
//            System.out.println("June");
//        } else if (numberOfMoth == 7) {
//            System.out.println("July");
//        } else if (numberOfMoth == 8) {
//            System.out.println("August");
//        } else if (numberOfMoth == 9) {
//            System.out.println("September");
//        } else if (numberOfMoth == 10) {
//            System.out.println("October");
//        } else if (numberOfMoth == 11) {
//            System.out.println("November");
//        } else if (numberOfMoth == 12) {
//            System.out.println("December");
//        }  else {
//            System.out.println("This month does not exist");
//        }
        switch (numberOfMoth) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("This month does not exist");
                break;
        }

    }
}
