
import java.util.Scanner;

public class IFcond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // boolean isFemale = false;
        System.out.print("Enter your birth year: ");
        int BirthYear = input.nextInt();
        String name = "Ashraful";
        if (BirthYear/4==0) {
            System.out.println("Mr . " + name + " you'r a person who born in leap year");
        } 
        else{
            System.out.println("Mr. " + name + " you'r not a person who born in a leap year");
        }
        
    }
}
