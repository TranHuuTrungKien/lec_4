package lec_4;
import java.util.Scanner;
public class B5 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);        
        System.out.print("Enter an number from 1-7:");
        int daynumber=scanner.nextInt();
        System.out.println(daynumber);
        switch (daynumber) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3 :
                System.out.println("Tuesday");
                break;
            case 4 :
                System.out.println("Wednesday");
                break;
            case 5 :
                System.out.println("Thursday");
                break;
            case 6 :
                System.out.println("Friday");
                break;
            case 7 :
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Error: Please enter a number between 1 and 7.");
        }
    }
}
