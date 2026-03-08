import java.util.Scanner;

public class PracticeThrow {

    public static void validateUser(String name, int age){

            if (name.equals("")) {
                throw new IllegalArgumentException("Name cannot be empty");
            } else if (age < 18) {
                throw new ArithmeticException("You are under age");
            } else if (age > 60) {
                throw new IllegalStateException("You above age");

            } else {
                System.out.println("All inputs are valid");
            }

    }

    public static void main(String[] args) {
        try {
            validateUser("gsds", 67);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (ArithmeticException a) {
            System.out.println("Exception cought: " + a.getMessage());
        } catch (IllegalStateException r) {
            System.out.println("Exception caught: " + r.getMessage());
        }
    }

}
