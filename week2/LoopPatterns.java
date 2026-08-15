/*
54. TASK 7 - NESTED LOOPS AND PRINT PATTERNS
--------------------------

Required filename: LoopPatterns.java

Use nested loops to produce the following patterns for a user-entered size.

Pattern A for size 4:

    * * * *
    * * * *
    * * * *
    * * * *

Pattern B for size 4:

    *
    * *
    * * *
    * * * *

Pattern C for size 4:

    1
    1 2
    1 2 3
    1 2 3 4

Pattern D for size 4:

        * * * *
        * * *
        * *
        *

Pattern E for size 4:

        1
        2 2
        3 3 3
        4 4 4 4

Requirements:

- Complete at least two patterns: one rectangular or triangular star pattern
    and one number pattern.
- Create a separate static method for every completed pattern.
- Each method must receive size as a parameter.
- Reject a size less than 1 in main.
- For each completed pattern, identify the outer-loop responsibility and the
    inner-loop responsibility.
- State the time complexity in terms of size and justify it.


*/import java.util.Scanner;

public class LoopPatterns
{
    Scanner scan = new Scanner(System.in);
    public void DrawLoop()
    {
        System.out.println("enter a number for pattern");
        int num = scan.nextInt();

        //Ptternn 1
        System.out.println("pattern 2");
        for ( int i = 1; i <= num ; i++)
        {
            for( int j = 1 ; j <=num ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        //patern 2 
        for ( int i = 1; i <= num ; i++)
        {
            for( int j = 1 ; j <=i ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        //pattern 3
        for ( int i = 1; i <= num ; i++)
        {
            for( int j = 1 ; j <=i ; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        //pattern 4
        for(int i = num; i >= 1;i--)
            {
            for(int j = 1; j <= i; j++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        //pattern 5
        for ( int i = 1; i <= num ;i++)
        {
            for( int j =1 ; j <=i ; j++)
            {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
        
    }
        
}