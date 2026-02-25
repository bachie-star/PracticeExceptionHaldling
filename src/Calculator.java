import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double result;
        String operator = "";
        double num1=0;
        double num2=0;
        try {
            System.out.println("Enter an operator(+,-,/,*)");
            operator=input.next();//to get the next token from the user
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
            System.out.println("You are only allowed to enter an operator");
        }

        try {
            System.out.println("Enter the first number ");
            num1= input.nextDouble();
            System.out.println("Enter the second number");
            num2= input.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("Allowed to enter only a number");

        }
        finally {

        }

        switch (operator){
            case "+":
                result= num1+num2;
                System.out.println(result);
                break;
            case "-":
                result= num1-num2;
                System.out.println(result);
                break;
            case "/":
                if(num2==0){
                    System.out.println("Cannot divide by zero");
                }
                else {
                    result= num1/num2;
                    System.out.println(result);
                }

                break;
            case "*":
                result=num1*num2;
                System.out.println(result);
                break;
            default:
                System.out.println("Invalid Operator");
        }

    }

}
