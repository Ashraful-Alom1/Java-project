
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcomr to LCM ");
        System.out.print("Please enter first number: ");
        int first = input.nextInt();
        System.out.print("Please enter second number: ");
        int second = input.nextInt();
        int lcm = lcm(first , second);
        System.out.print("LCM of two numbers is: " + lcm);


    }

    public static int lcm(int first , int second){
        int i = 1; 
        while(true){
            int factor = first * i;
            if(factor%second==0){
                return factor;
            }
            i++;
        }
    
    }
}
