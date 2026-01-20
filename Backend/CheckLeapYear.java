
import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to leap year finding calculator\n");
        System.out.print("Please enter a year you want to be check : ");
        int Year = input.nextInt();
        if(Year%400==0 || (Year%4==0 && Year%100!=0))
        {
            System.out.println("Your year is a leap year");

        } 
        else
        {
            System.out.println("Your year is not a leap year");
        }
        

    }
}
