package Year2023.Task50_Exceptions;

public class Main {
    public static void main(String[] args) {

        // Arithmetic
        int a = 1;
        try {
            int b = 7 / a;

        // Error string format
//            String s = "123f3112";
//            int i = Integer.parseInt(s);

        // If you want catch error
        } catch (ArithmeticException el) {
            System.out.println("You can't divide by zero");

        } catch (Exception e) {

        // If you have error when have a problem, but you want to save
        // info, so you can use class finally
        } finally {
            System.out.println("We in block finally");
        }

        // This error Arithmetic and conversion
        //        } catch (ArithmeticException e) {
//            System.out.println("You can't divide by zero");
//        } catch (NumberFormatException e1) {
//            System.out.println("Conversion error");
//        }
        System.out.println("Hello");
    }
}
