
import java.util.Scanner;

public class PerimeterOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter all 4 sides in cms: ");
        System.out.print("Enter first side A : ");
        float A = input.nextFloat();
        System.out.print("Enter second side B : ");
        float B = input.nextFloat();
        System.out.print("Enter third side C : ");
        float C = input.nextFloat();
        System.out.print("Enter fourth side D : ");
        float D = input.nextFloat();
        float ABCD = A+B+C+D;
        System.out.println("Perimeter of rectangle ABCD is : "+ ABCD);

    }
}
