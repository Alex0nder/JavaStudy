package Year2023.Task29_OOP_Constructor;

public class Box {
    double width;
    double height;
    double length;

    //Command N - Constructor
    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    void setDimens(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    double volume() {
        return width * height * length;
    }
}
