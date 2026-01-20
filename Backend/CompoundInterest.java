
import java.util.Scanner;

public class CompoundInterest {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to compound Interest calculator : ");
    System.out.print("Enter your principle amount Rs : ");
    float P = input.nextFloat();
    System.out.print("Enter your rate of Interest : " );
    float R = input.nextFloat();
    System.out.print("Now tell me for years are you borrowing this money : ");
    float T = input.nextFloat();
    double CompdInt = P * Math.pow((1+R/100),T);
    
    System.out.println("Your compound interest is Rs " + CompdInt );
   } 
}
