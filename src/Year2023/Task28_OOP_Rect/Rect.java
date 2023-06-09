package Year2023.Task28_OOP_Rect;

public class Rect {
    // The method takes 2 parameters: Height and Width and sets them for the rectangle
    // Method with no parameters: returns an example of a rectangle
    // Method without parameters: returns the area of a rectangle

    // Rect width
    double width;
    //Rect height
    double height;

    // Method Height and Width and sets them for the rectangle
    void setDimens(double width, double height) {
        this.width = width;
        this.height = height;
    }
    // Multiply the width and height = returns an example of a rectangle
    double area() {
        return width * height;
    }
    // Add without parameters and multiply by 2 = returns the area of a rectangle
    double perimeter() {
        return (width + height) * 2;
    }
}
