package lec_4;
import java.util.Scanner;
public class B8 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x=scanner.nextDouble();
        System.out.println(x);
        System.out.print("Enter y: ");
        double y=scanner.nextDouble();
        System.out.println(y);
        
        if(x>0 && y>0){
        System.out.println("Quadrant 1");
        }else if(x<0 && y>0){
        System.out.println("Quadrant 2");
        }else if(x<0 && y<0){
        System.out.println("Quadrant 3");
        }else if(x>0 && y<0){
        System.out.println("Quadrant 4");
        }else{
        System.out.println("If x = 0 or y = 0, the point is on an axis");
        }
    }
}
