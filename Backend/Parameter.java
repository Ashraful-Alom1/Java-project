public class Parameter {
public static void main(String[]args){
    int num = sumTwoNumber(7,10);  
    System.out.println("Your sum is : " + num);


}

public static int sumTwoNumber(int first , int second){
    System.out.println("first number received: " + first);
    System.out.println("second number received: " + second);
    int sum = first + second;
    return sum;

}

}
