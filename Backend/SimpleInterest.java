
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to simple interest calculator\n");
        System.out.print("enter your principle amount Rs : ");
        float principle = input.nextFloat();
        System.out.print("Enter your rate of interest : ");
        float rate = input.nextFloat();
        System.out.print("now tell me for how many years are you borrowing this money : ");
        float years = input.nextFloat();
        float SimpleInterest= (principle * rate * years)/100;
        System.out.println(" Your Simple Interest is Rs : " + SimpleInterest );

    }
}
