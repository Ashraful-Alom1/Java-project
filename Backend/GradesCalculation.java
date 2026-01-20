
import java.util.Scanner;

public class GradesCalculation {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Grades calculation calculator");
    System.out.print("Pleaase enter your obtain marks : ");
    int Num = input.nextInt();
    if (Num>=90)
    {
        System.out.println("You have got Grade A");
    }
    else if (Num>=75)
    {
        System.out.println("You  have got Grade B");
    }
    else if (Num>=60)
    {
        System.out.println("You have got Grade C");
    }
    else if (Num>30)
    {
        System.out.println("You have got Grade D");
    }
    else 
    {
        System.out.println("You have got Grade F");
    }
   } 
}
