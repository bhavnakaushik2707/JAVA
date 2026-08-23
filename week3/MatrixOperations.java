/*
66. TASK 4 - MATRIX OPERATIONS
-----------------------------

Required filename: MatrixOperations.java

Implement:

    static int[] rowSums(int[][] matrix)
    static int[] columnSums(int[][] matrix)
    static int[][] add(int[][] first, int[][] second)
    static int[][] transpose(int[][] matrix)
    static int[][] multiply(int[][] first, int[][] second)
    static void printMatrix(int[][] matrix)

Requirements:

- Validate dimensions before addition and multiplication.
- Test a non-square transpose.
- Explain all three loops in multiplication.
- State complexity for each operation.

*/
public class MatrixOperations 
{
    int[] rowSums(int[][] matrix)
    {
        int[] sums =new int[matrix.length];
        for(int i = 0;i <matrix.length;i++)
            {
                for(int j= 0; j <matrix[i].length; j++)
                    {
                        sums[i]+= matrix[i][j];
                    }
            }
            return sums;
        }
    int[] columnSums(int[][] matrix)
    {
        if(matrix.length == 0)
            {
                return new int[0];
            }
            int[] sums = new int[matrix[0].length];
            for(int i = 0; i < matrix.length; i++)
                {
                    for(int j = 0; j < matrix[i].length; j++)
                        {
                            sums[j]+= matrix[i][j];
                         }
            }
            return sums;
    }


    int[][] add(int[][] first, int[][] second)
    {
        if(first.length != second.length||first[0].length != second[0].length)
            {
                return null;
            }
            int[][] result = new int[first.length][first[0].length];
            for(int i = 0; i < first.length; i++)
                {
                    for(int j = 0; j < first[i].length; j++)
                        {
                            result[i][j] = first[i][j] + second[i][j];
                        }
                    }
                    return result;
    }
    
    int[][] transpose(int[][] matrix)
    {
        
        if(matrix.length == 0)
            {
            return new int[0][0];
        }
        int rows= matrix.length;
        int col =matrix[0].length;
        int[][]result =new int[col][rows];



        for(int i = 0; i <rows; i++)
            {
                for(int j = 0; j <col; j++)
                    {
                        result[j][i] = matrix[i][j];
                    }
                }
                return result;
    }

    int[][]multiply(int[][] first, int[][] second)
    {
        if(first.length == 0 || second.length == 0)
        { return null; 
        }

        if(first[0].length != second.length)
        {
            return null;
        }
        int[][] result = new int[first.length][second[0].length];
        for(int i = 0; i < first.length; i++)
            {
                for(int j = 0; j <second[0].length; j++)
                    {
                for(int k = 0; k < second.length; k++)
                {
                    result[i][j] += first[i][k] *second[k][j];
                }
            }
        }
        return result;
    }

    void printMatrix(int[][] matrix)
    {
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


