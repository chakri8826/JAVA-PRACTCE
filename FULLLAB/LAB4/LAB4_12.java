//Matrix multiplication
import java.util.*;
public class LAB4_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows of 1st matrix:");
        int r1 = sc.nextInt();
        System.out.print("Enter number of columns of 1st matrix:");
        int c1 = sc.nextInt();
        int matrix1[][] = new int[r1][c1];
        for (int i = 0; i < r1; i++) 
        {
            for (int j = 0; j < c1; j++) 
            {
                System.out.printf("Enter element matrix1[%d][%d]:", i + 1, j + 1);
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter number of rows of 2nd matrix:");
        int r2 = sc.nextInt();
        System.out.print("Enter number of columns of 2nd matrix:");
        int c2 = sc.nextInt();
        int matrix2[][] = new int[r2][c2];
        for (int i = 0; i < r2; i++) 
        {
            for (int j = 0; j < c2; j++) 
            {
                System.out.printf("Enter element matrix1[%d][%d]:", i + 1, j + 1);
                matrix2[i][j] = sc.nextInt();
            }
        }
        int result[][] = new int[r1][c2];
        sc.close();
        if (c1 != r2) 
        {
            System.out.println(" Matrix multiplication is not possible for given two matrices");
            return;
        }

        for (int i = 0; i < r1; i++) 
        {
            for (int j = 0; j < c2; j++) 
            {
                int sum = 0;
                for (int k = 0; k < c1; k++) 
                {
                    sum = sum + (matrix1[i][k] * matrix2[k][j]);
                }
                result[i][j] = sum;

            }
        }

        System.out.println("1st matrix:");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("2nd matrix:");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix after multiplication:");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

    }

}
