
import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        // boolean isSeniorCitizen = false;
        // boolean isAdult = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if(age>=60){
            System.out.println("Hello senior citizen");
        } else if(age>=18){
            System.out.println("Hello adult");
        }else{
            System.out.println("Hello child");
        }
    }
}
