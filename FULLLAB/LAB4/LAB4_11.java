//Sum of two matrices
import java.util.*;
public class LAB4_11 {
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
                System.out.printf("Enter element matrix1[%d][%d]:", i+1, j+1);
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
                System.out.printf("Enter element matrix1[%d][%d]:", i+1, j+1);
                matrix2[i][j] = sc.nextInt();
            }
        }
        sc.close();
        if (!(r1 == r2 && c1 == c2)) 
        {
            System.out.println("Addition of given two matrices not possible");
            return;
        }
        int result[][] = new int[r1][c1];
        for (int i = 0; i < r1; i++) 
        {
            for (int j = 0; j < c1; j++) 
            {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
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
        System.out.println("matrix after Addition:");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
