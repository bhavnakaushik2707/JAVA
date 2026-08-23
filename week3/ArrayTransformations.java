/*
65. TASK 3 - ARRAY TRANSFORMATIONS
Required filename: ArrayTransformations.java
Implement:
    static void reverseInPlace(int[] values)
    static int[] reversedCopy(int[] values)
    static int removeValue(int[] values, int target)
    static int[] runningSum(int[] values)
Requirements:
- Use two pointers for in-place reversal.
- Do not call a library reverse method.
- Explain original versus logical length after removeValue.
- Compare mutation, returned copy, time, and auxiliary space.
*/
public class ArrayTransformations

{
    void reverseInPlace(int[]arr)
    {
        int left= 0;
        int right=arr.length - 1;
        while(left<right)
            {
                int temp = arr[left];
                arr[left] =arr[right];
                arr[right] = temp;
                left++;
                right--;
        }
    }
    int[]reversedCopy(int[] arr)
    {
        int[]result =new int[arr.length];
        for(int i = 0; i <arr.length; i++)
            {
            result[i] = arr[arr.length - 1 - i];
            }
        return result;
    }

    int removeValue(int[]arr, int target)
    {
        int index= 0;
        for(int i = 0; i <arr.length; i++)
        {
            if(arr[i] != target)
            {
                arr[index] =arr[i];
                index++;
            }
        }
        return index;
    }


    int[] runningSum(int[]arr)
    {
        int[] result = new int[arr.length];

        if(arr.length == 0)
        {
            return result;
        }
        result[0] = arr[0];


        for(int i = 1; i <arr.length; i++)
        {
            result[i] = result[i - 1] + arr[i];
        }
        return result;
    }
}


