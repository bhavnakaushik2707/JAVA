/*31. TASK 4 - SIMPLE INTEREST
Read principal, annual interest rate, and time in years. Calculate:
	simpleInterest = principal * rate * time / 100
	finalAmount = principal + simpleInterest
Use double variables where fractional values are possible. Print both the
interest and final amount.*/
import java.util.Scanner;
public class simpleint {
    public static void main(String[] args) throws Exception 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter principal");
        double principal = scan.nextDouble();
        System.out.println("enter rate");
        double rate = scan.nextDouble();
        System.out.println("enter time");
        double time = scan.nextDouble();
        System.out.println("Simple Interest  is : " + (principal * rate *time));

    }
    
}
