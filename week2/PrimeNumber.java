/*
51. TASK 4 - PRIME NUMBER
Required filename: PrimeNumber.java

Write static boolean isPrime(int number), then use it to display whether an
entered integer is prime.

Requirements:

- Values less than 2 are not prime.
- Test possible divisors only while divisor * divisor <= number.
- Test -5, 0, 1, 2, 3, 4, 17, 25, and 97.
- Explain the loop condition.

*/
import java.util.Scanner;

public class PrimeNumber {
    public void isPrimeNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num :  ");
        int num = scan.nextInt();
        int count = 0;
        if(num < 2) 
        {
            System.out.println("enter a number greater than or equal to 2");
            return;
        }

        for(int i = 2; i * i <= num; i++) 
        {
            if(num % i == 0)
            {
                count++;
            }
        }
        if(count == 0)
            System.out.println(num + " is prime");
        else
            System.out.println(num + " is not prime");
    }
}