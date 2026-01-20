
import java.util.Scanner;

public class FahrToCels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Temperature calculator\n");
        System.out.print("Enter your temp in F : ");
        float F = input.nextFloat();
        float C = (F - 32)*5/9;
        System.out.println("Your temperature is : " + C + " C");
    }
}
