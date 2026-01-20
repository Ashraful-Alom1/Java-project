
import java.util.Scanner;

public class AreaOT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Area calculator\n ");
        System.out.print("Entr your base in cms : ");
        double base = input.nextDouble();
        System.out.print("Enter your perpendicular height in cms : ");
        double height = input.nextDouble();
        double area = (base * height)/2;
        System.out.println("Area of Triangle is " + area + " cms2");

    }
}
