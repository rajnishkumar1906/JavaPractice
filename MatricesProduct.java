import java.util.Scanner;
public class MatricesProduct
{
    public int[][] matricesProduct(int[][] P, int[][] Q )
    {
        int row = P.length;
        int col1 = P[0].length;
        int col2 = Q[0].length;
        int[][] Product = new int[row][col2];
        for(int i = 0 ; i < row; i++)
        {
            for(int j = 0 ; j < col2 ; j++)
            {
                for(int k = 0 ; k < col1 ; k++ )
                {
                    Product[i][j] += P[i][k] * Q[k][j] ;
                }
            }
        }
        return Product;
    }
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);

        //Matrix 1:-----------------
        System.out.println("Matrix1: ");
        System.out.print("Enter rows of matrix1 : ");
        int R = S.nextInt();
        System.out.print("Enter columns of matrix1 : ");
        int C = S.nextInt();
        int[][] matrix1 = new int[R][C];
        for(int i=0; i<R ; i++)
        {
            System.out.print("Enter row "+ (i+1)+ ": ");
            for(int j = 0 ; j<C ; j++)
            {
                matrix1[i][j] = S.nextInt();
            }
        }

        //Matrix 2:--------------------------------------------
        System.out.println("Matrix2: ");
        System.out.print("Enter rows of matrix2 : ");
        int r = S.nextInt();
        System.out.print("Enter columns of matrix2 : ");
        int c = S.nextInt();
        int[][] matrix2 = new int[r][c];
        for(int i=0; i<r ; i++)
        {
            System.out.print("Enter row "+ (i+1)+ ": ");
            for(int j = 0 ; j<c ; j++)
            {
                matrix2[i][j] = S.nextInt();
            }
        }


        System.out.println("----------------PRODUCT OF MATRICES --------------------");
        MatricesProduct M = new MatricesProduct();
        int[][] Product = M.matricesProduct(matrix1, matrix2);

        if(C == r)
        {
            for(int i = 0 ; i<Product.length ; i++)
            {
                for(int j=0;j<Product[0].length;j++)
                {
                    System.out.print(Product[i][j]+" ");
                }
                System.out.print("\n");
            }
        }
        else
        {
            System.out.println("Multiplication of matrices is not possible");
        }
    }
}
