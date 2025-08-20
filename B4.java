package lec_4;
import java.util.Scanner;
public class B4 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);        
        System.out.print("Enter an integer 1:");
        int number1=scanner.nextInt();
        System.out.println(number1);
        System.out.print("Enter an integer 2:");
        int number2=scanner.nextInt();
        System.out.println(number2); 
        System.out.print("Enter a operator{+;-;*;/}:");
         char operator = scanner.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
                break;
            case '-':
                System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
                break;
            case '*':
                System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
                break;
            case '/':
                if (number2 != 0) {
                    System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator. Please use +, -, *, or /.");
        }
    }
}