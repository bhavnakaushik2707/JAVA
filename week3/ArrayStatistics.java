/*
63. TASK 1 - ARRAY STATISTICS
Required filename: ArrayStatistics.java

Read an array and report:

- sum and average
- minimum and maximum
- even and odd counts
- positive, negative, and zero counts

Required methods:

    static int sum(int[] values)
    static double average(int[] values)
    static int minimum(int[] values)
    static int maximum(int[] values)
    static int countEven(int[] values)
    static void printSignCounts(int[] values)

Requirements:

- Handle an empty array explicitly.
- Test all-negative, one-element, repeated, and mixed arrays.
- Explain why min/max must not be initialized to zero.
 */
public class ArrayStatistics
{
    /*
    Scanner scan = new Scanner(System.in);
    int[] arr;
    public void input() 
    {

    System.out.print("Enter array size: ");
    int size = scan.nextInt();
    arr = new int [size];

        for (int i = 0; i < size; i++) 
            {
            System.out.print("Enter value: ");
            arr[i] = scan.nextInt();
             }

    }
*/

    public int sum(int [] arr)
    {
        int sums = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            sums += arr[i];
        }
            return sums;
    }

    double average(int [] arr)
    {
        if (arr.length==0)
            {
                return 0.00;
            }
    
    return (double)sum(arr) /(arr.length);
    
    }
    int minimum(int [] arr)
    {
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i< arr.length ; i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        return min;
    }
    int maximum(int [] arr)
    {
        int max= Integer.MIN_VALUE;
        for(int i = 0 ; i< arr.length ; i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max;
    }

    int countEven(int [] arr)
    {
        int even_count = 0;
        for(int i = 0 ; i< arr.length ; i++)
        {
            if(arr[i] % 2 == 0)
            {
                even_count += 1;
            }
        }
        return even_count;
    }
    void printSignCounts(int [] arr)
    {
        int count_positive = 0;
        int count_negative = 0;
        int count_zero = 0;
        for(int i = 0 ; i< arr.length ; i++)
        {
            if(arr[i]>0)
            {
                count_positive += 1;
            }
            if(arr[i]<0)
            {
                count_negative += 1;
            }
            if(arr[i]==0)
            {
                count_zero += 1;
            }

            
        }
        System.out.println("No of +ve : " + count_positive );
        System.out.println("No of -ve : " + count_negative );
        System.out.println("No of zero : " + count_zero );
            
    }
}