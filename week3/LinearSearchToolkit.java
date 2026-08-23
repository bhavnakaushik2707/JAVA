/*
64. TASK 2 - LINEAR SEARCH TOOLKIT
---------------------------------

Required filename: LinearSearchToolkit.java

Implement:

    static boolean contains(int[] values, int target)
    static int firstIndexOf(int[] values, int target)
    static int lastIndexOf(int[] values, int target)
    static int countOccurrences(int[] values, int target)

Test empty, absent, first-position, last-position, and duplicate cases. State
the best and worst behavior of each search where appropriate.
*/
import java.util.Scanner;
public class LinearSearchToolkit 
{
    Scanner scan = new Scanner(System.in);
    boolean contains(int[] arr, int target)
    {
        for (int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i]==target)
            {
                return true;
            }

        }
        return false;
    }
}
