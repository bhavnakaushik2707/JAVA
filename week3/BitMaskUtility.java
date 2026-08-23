/*
69. TASK 7 - BIT MASK UTILITY
Required filename: BitMaskUtility.java
Implement:
    static boolean isBitSet(int number, int position)
    static int setBit(int number, int position)
    static int clearBit(int number, int position)
    static int toggleBit(int number, int position)
    static String toBinary32(int number)
Build a menu that reads a number, bit position, and operation. Validate bit
positions from 0 through 31. Display values before and after in decimal and
32-bit binary.
*/
public class BitMaskUtility 
{
    boolean isBitSet(int number, int position)
    {
        return(number & (1 << position))!=0;
    }
    int setBit(int number, int position)
    {
        return number|(1 << position);
    }
    int clearBit(int number, int position)
    {
        return number & ~(1 << position);
    }
    int toggleBit(int number, int position)
    {
        return number ^ (1 << position);
    }
    String toBinary32(int number)
    {
        String binary = "";
        for(int i = 31; i >= 0; i--)
            {
                if((number & (1 << i)) != 0)
                    {
                        binary += "1";
                    }
                else
                    {
                        binary += "0";
                    }
            }
    return binary;
    }
}
