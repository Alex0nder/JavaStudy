package Year2023.Task43_OOP_Inheritance;

public class CatFamily {
    private int ears;
    private int legs;
    private boolean bigClaws;

//    public CatFamily() {
//        ears = 2;
//        legs = 4;
//        bigClaws = true;
//    }

    public CatFamily(int ears, int legs, boolean bigClaws) {
        this.ears = ears;
        this.legs = legs;
        this.bigClaws = bigClaws;
    }

    public void showInfo() {
        System.out.println(
                "Number of ears: " + ears
                + " Numbers paws: " + legs
                + " Have claws: " + bigClaws);
    }

    public void setBigClaws(boolean bigClaws) {
        this.bigClaws = bigClaws;
    }

    public void eat() {
        System.out.println("Eat");
    }
}
