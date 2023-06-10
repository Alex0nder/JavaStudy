package Year2023.Task32_OOP_OverloadConstructor;

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

    public Box(double size) {
        width = size;
        height = size;
        length = size;
    }

    Box() {
        width = 0;
        height = 0;
        length = 0;
    }

    void setDimens(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    double volume() {
        return width * height * length;
    }

    void showVolume() {
        System.out.println(volume());
    }
}
