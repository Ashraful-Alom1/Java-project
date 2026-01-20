
import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Age Group calculator\n");
        System.out.print("Enter Age of a person : ");
        int Age = input.nextInt();
        if(Age>=65)
        {
            System.out.println("You are a senior citizen");
        }
        else if (Age>=20)
        {
            System.out.println("You are an Adult");
        }
        else if (Age>=13)
        {
            System.out.println("You are a Teenager");
        }
        else 
        {
            System.out.println("You are a Child");
        }
    }
}
