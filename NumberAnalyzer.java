/*
57. TASK 10 - MODULAR NUMBER ANALYZER
-------------------------------------

Required filename: NumberAnalyzer.java

Build one program that reads an integer and produces a small analysis report.
The purpose is to practise designing, calling, and tracing multiple methods.

Create exactly these methods:

        static int readNumber(Scanner input)
        static boolean isEven(int number)
        static boolean isPositive(int number)
        static int absoluteValue(int number)
        static int countDigits(int number)
        static int sumDigits(int number)
        static void printReport(
                        int number,
                        boolean even,
                        boolean positive,
                        int digitCount,
                        int digitSum)

Required flow in main:

1. Create the Scanner.
2. Call readNumber and store the returned number.
3. Call isEven and store its result.
4. Call isPositive and store its result.
5. Call absoluteValue before digit processing.
6. Call countDigits with the absolute value.
7. Call sumDigits with the absolute value.
8. Call printReport with all calculated results.
9. Close the Scanner.

Additional requirements:

- countDigits and sumDigits must each use a loop.
- Treat 0 as a one-digit number.
- Test positive, negative, and zero inputs.
- Draw the active call stack when main calls countDigits.
- Explain why local variables in countDigits are not directly available to
    sumDigits or printReport.

Optional stack-depth extension:

Create static int analyzeMagnitude(int number) that calls absoluteValue and
then countDigits. Trace the deeper call sequence:

        main -> analyzeMagnitude -> absoluteValue
        main -> analyzeMagnitude -> countDigits

*/
import java.util.Scanner;

public class NumberAnalyzer
{
    Scanner scan = new Scanner(System.in);
    int readNumber()
    {
        System.out.print("Enter number: ");
        int num = scan.nextInt();
        return num;
    }

    boolean isEven(int num)
    {
        if (num % 2 == 0)
            {
                return true;
            }
        else
            {
                return false;
            }
    }

    boolean isPositive(int num)
    {
        if (num> 0)
            {
                return true;
            }
        else
            {
                return false;
            }
    }

    int absoluteValue(int num)
    {
        if (num< 0)
            {
                return -num;
            }
        else
            {
            return num;
            }
    }

    int countDigits(int num) {

        if (num== 0)
        {
            return 1;
        }
        int count= 0;
        while (num> 0)
        {
            count++;
            num =num/ 10;
        }
        return count;
    }

    int sumDigits(int num)
    {
        int sum= 0;
        while (num> 0)
        {
            sum = sum + num% 10;
            num =num / 10;
        }
        return sum;
    }

    void printReport(int number, boolean even, boolean positive,int digitCount, int digitSum)
    {

        System.out.println("Number = " + number);
        System.out.println("Even = " + even);
        System.out.println("Positive = " + positive);
        System.out.println("Number of digits = " + digitCount);
        System.out.println("Sum of digits = " + digitSum);
    }
}