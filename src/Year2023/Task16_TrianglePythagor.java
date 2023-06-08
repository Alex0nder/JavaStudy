package Year2023;

public class Task16_TrianglePythagor {
    public static void main(String[] args) {
        //Formula Pythagor's: a2 + b2 = c2 or = (a * a) + (b * b) = (c * c)
        // a = right Triangle, b = right Triangle, c = hypotenuse;
        double a = 3;
        double b = 4;
        double c = Math.sqrt(a * a + b * b);
        System.out.println(c);
    }
}
