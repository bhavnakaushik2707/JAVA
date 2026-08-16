/*
56. TASK 9 - SENTINEL-CONTROLLED MARKS PROCESSOR
Required filename: MarksProcessor.java
Write a program that repeatedly reads marks. Enter -1 to end input. The
sentinel must stop the loop and must not be included as a mark.
After input ends, display:
- number of valid marks entered
- sum of the marks
- average mark
- highest mark
- number of passes (mark >= 50)
- number of failures (mark < 50)
Requirements:
- Use -1 as the sentinel.
- Accept ordinary marks only from 0 through 100.
- Reject an invalid value and continue without including it in any result.
- Avoid division by zero when the first input is -1.
- Use static boolean isValidMark(int mark).
- Use at least two additional methods to print or calculate results.
- Dry-run this input sequence:
  70, 45, 105, 80, -1
Explain which values are processed, which value is rejected, and which value
terminates the loop.
*/

import java.util.Scanner;
public class MarksProcessor 
{
    Scanner scan = new Scanner(System.in);
    public void IsValidMarks()
    {
        int marks = 0, count = 0 , average = 0 ,sum = 0 ,highest = -1, pass = 0 , fail = 0;
        while (marks != -1) 
            {
                System.out.println("Enter marks: ");
                marks = scan.nextInt();
                if (marks != -1)
                {
                    if (marks >= 0 && marks <= 100)
                    {
                        count++;
                        sum += marks;
                        if (marks > highest) 
                            {
                                highest = marks;
                            }
                        if (marks >= 50)
                        {
                            pass += 1;
                        }
                        else if (marks < 50)
                        {
                            fail += 1;
                        }
                    }
                }
                   
            }
             if (count > 0)
                    {
                        average = sum / count ;
                    }

            System.out.println("Count = " + count );
            System.out.println("Highest marks = " + highest );
            System.out.println("No of Passed Subject = " + pass );
            System.out.println("No of Failed Subject = " + fail );
            System.out.println("Average Marks  = " + average );
            System.out.println("Sum = " + sum);

    }

}
