package lec_4;
import java.util.Scanner;
public class B9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int absoluteValue = (number >= 0) ? number : -number;

        System.out.println("The absolute value is " + absoluteValue + ".");
    }
}