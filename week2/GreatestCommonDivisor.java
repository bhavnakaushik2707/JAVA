/*
52. TASK 5 - GREATEST COMMON DIVISOR
------------------------------------

Required filename: GreatestCommonDivisor.java

Write static int gcd(int first, int second) using Euclid's algorithm.

Repeatedly apply:

    remainder = first % second
    first = second
    second = remainder

until second becomes zero.

Requirements:

- Handle negative inputs using Math.abs().
- Test (48, 18), (21, 14), (7, 5), and (100, 0).
- Trace the variables for gcd(48, 18) in the notebook.


*/
import java.util.Scanner;

public class GreatestCommonDivisor
{
    Scanner scan = new Scanner(System.in);
    public void gcd()
    {
        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.print("enter second number: ");
        int num2 = scan.nextInt();
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        while(num2!= 0) {
            int rem= num1 % num2;
            num1 =num2;
            num2= rem;
        }

        System.out.println("Greatestt common divisor is: " + num1);
    }
}