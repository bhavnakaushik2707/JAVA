/*
49. TASK 2 - LEAP YEAR
----------------------

Required filename: LeapYear.java

Write a program that determines whether an entered year is a Gregorian leap
year.

Requirements:

- Create static boolean isLeapYear(int year).
- Test 2024, 1900, 2000, and 2023.
- Explain why checking only divisibility by 4 is insufficient. */
import java.util.Scanner;

public class LeapYear {
    public void isLeapYear() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter year ");
        int year = scan.nextInt();
        if(year %400 ==0)
        {
            System.out.println("is a leap year");
        }
        else if(year % 100 ==0)
        {
            System.out.println("not a leap year");
        }
        else if(year % 4 ==0)
        {
            System.out.println("is a leap year");
        }
        else
        {
            System.out.println("not a leap year");
        }
    }
}