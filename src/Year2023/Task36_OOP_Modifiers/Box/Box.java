package Year2023.Task36_OOP_Modifiers.Box;

public class Box {
    double width;
    double height;
    double length;

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

    public Box() {
        width = 0;
        height = 0;
        length = 0;
    }

    public Box(Year2023.Task35_OOP_ObjectBox.Box box) {
        this.width = box.width;
        this.height = box.height;
        this.length = box.length;
    }

    // In new box specify the length and width equal to the sum of two boxes
    // So the resulting box in terms of volume will definitely turn out to be
    // more than the sum of those two boxes.
    public Box(Year2023.Task35_OOP_ObjectBox.Box box1, Year2023.Task35_OOP_ObjectBox.Box box2) {
        this.width = box1.width + box2.width;
        this.length = box1.length + box2.length;
        this.height = box1.height + box2.height;
    }

    public void setDimens(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    Year2023.Task35_OOP_ObjectBox.Box increase(int i) {
        return new Year2023.Task35_OOP_ObjectBox.Box(width *i, height * i, length * i);
    }

    Year2023.Task35_OOP_ObjectBox.Box sumBox(Year2023.Task35_OOP_ObjectBox.Box box) {
        return new Year2023.Task35_OOP_ObjectBox.Box(this.width + box.width, this.height + box.height, this.length + box.length);
    }

    public double volume() {
        return width * height * length;
    }

    public void showVolume() {
        System.out.println(volume());
    }

    public int compare(Year2023.Task35_OOP_ObjectBox.Box box) {
        double thisVolume = volume();
        double boxVolume = box.volume();
        int result;
        if (thisVolume > boxVolume) {
            result = 1;
        } else if (thisVolume < boxVolume) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }
}
