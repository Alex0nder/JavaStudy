package Year2023.Task34_OOP_ObjectsAsParameters;

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

        Box(Box box) {
            this.width = box.width;
            this.height = box.height;
            this.length = box.length;
        }


        void setDimens(double width, double height, double length) {
            this.width = width;
            this.height = height;
            this.length = length;
        }

        Box increase(int i) {
            return new Box(width * i, height * i, length * i);
        }

        double volume() {
            return width * height * length;
        }

        void showVolume() {
            System.out.println(volume());
        }

        int compare(Box box) {
            double thisVolume = volume();
            double boxVolume = box.volume();
            int result;
            if (thisVolume > boxVolume) {
                result = 1;
//                System.out.println("Our box is bigger");
            } else if (thisVolume < boxVolume) {
                result = -1;
//                System.out.println("Our box less");
            } else {
//                System.out.println("Boxes are equal");
                result = 0;
            }
            return result;
        }
}
