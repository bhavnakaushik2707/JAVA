/*
Required filename: GradingSystem.java

Write a program that reads a mark and displays:
    80-100    Distinction
    70-79     Merit
    50-69     Pass
    0-49      Fail
Values below 0 or above 100 must display Invalid mark.
Requirements:
- Create static String classifyMark(int mark).
- Return the classification instead of printing it inside the method.
- Test -1, 0, 49, 50, 69, 70, 79, 80, 100, and 101.
*/
import java.util.Scanner;
public class GradingSystem
{
    public void PrintGrades()
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter marks");
        float marks = scan.nextFloat();
        if (marks>100 || marks <0)
        {
            System.out.println("Invalid marks");
        }
        else if (marks >= 80)
        {
            System.out.println("Distinction");
        }
        else if (marks >= 70)
        {
            System.out.println("Merit");
        }
        else if (marks >= 50)
        {
            System.out.println("Pass");
        }
        else if (marks < 50)
        {
            System.out.println("Fail");
        }
    }
}
