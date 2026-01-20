
import java.util.Scanner;

public class CheckNum {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to number checkimg system\n");
    System.out.print("Enter a Number : ");
    int Num = input.nextInt();
    if(Num>0)
    {
        System.out.println("Given number "+ Num + " is a positive number");
    }
    else if(Num==0)
    {
        System.out.println("Your number is zero ");
    }
    else 
    {
         System.out.println("Given number " + Num + " is a negative number ");
    }

   } 
}
