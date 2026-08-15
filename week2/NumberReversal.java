/*53. TASK 6 - NUMBER REVERSAL
Required filename: NumberReversal.java
Read a non-negative integer and reverse its digits using a loop.
Example:
    Input:  5724
    Output: 4275
Useful operations:
    digit = number % 10
    reversed = reversed * 10 + digit
    number = number / 10
Requirements:
- Create static int reverseNumber(int number).
- Draw a dry-run table for input 5724.
- Test a value ending in zero and explain the result.
 */
import java.util.Scanner;

public class NumberReversal
{
    Scanner scan = new Scanner(System.in);
    public void reverseNumber()
    {
        System.out.println("Enter a number");
        int number = scan.nextInt();
        int reversed = 0;
        while(number != 0)
        {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;

        }
        System.out.println("rev num is " +reversed);
    }
}