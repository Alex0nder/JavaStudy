package Year2023.Task25_OOP_Dog;

public class Dog {
    //Basic data for dog
    String name;
    String breed;
    int speed;

    void run() {
        String result = "";
        for (int i = 0; i < speed; i++) {
            result += "Run";

            //Check last word "Run" - if last, - put dot ".", if no - put Comma and space ", "
            if (i == speed - 1) {
                result += ".";
            } else {
                result += ", ";
            }
        }
        System.out.println(result);
    }

    //Display data dog
    String info() {
        return "Nickname: " + name + " Breed: " + breed + " Speed " + speed;
    }
}
