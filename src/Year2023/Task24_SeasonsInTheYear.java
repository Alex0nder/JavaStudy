package Year2023;

public class Task24_SeasonsInTheYear {
    public static void main(String[] args) {
        //Long and bad code
        //Add default month
        String month = "September";
        if (month.equals("December") || month.equals("January") || month.equals("February")) {
            System.out.println("Winter");
        } else if (month.equals("March") || month.equals("April") || month.equals("May")) {
            System.out.println("Spring");
        } else if (month.equals("June") || month.equals("July") || month.equals("August")) {
            System.out.println("Summer");
        } else if (month.equals("September") || month.equals("October") || month.equals("November")) {
            System.out.println("Autumn");
        } else {
            System.out.println("This month does not exist");
        }

        //Short and good code
        month = "June";
        switch (month) {
            case "December":
            case "January":
            case "February":
                System.out.println("Winter");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("Spring");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("Summer");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("Autumn");
                break;
            default:
                System.out.println("This month does not exist");
                break;

        }
    }
}
