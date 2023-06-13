package Year2023.Task40_OOP_ParsArray;

public class Main {
    public static void main(String[] args) {
        String sourceData = "This Alex, he is 34 years old. His height 164.5 sm. Job title \"Designer\"";
        //pars Name
        String name = sourceData.substring(5,9);
        //pars Age
        String ageString = sourceData.substring(17,19);

        int age = Integer.parseInt(ageString);
        //Pars Height
        String heightString = sourceData.substring(42,47);
        double height = Double.parseDouble(heightString);
        //pars Job
        String position = sourceData.substring(62,72);

        Man man = new Man(name, position, age, height);
        System.out.println(man.getName()
                + " "
                + man.getPosition()
                + " " + man.getAge()
                + " years "
                + man.getHeight()
                + " sm.");
    }
}
