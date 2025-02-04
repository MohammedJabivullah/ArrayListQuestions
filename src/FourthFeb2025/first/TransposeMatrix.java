package FourthFeb2025.first;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        /*
         * Given a 2D integer array A, return the transpose of A. 
         * The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
         * -----Example -----
         * [[1, 2, 3],
         *  [4, 5, 6],
         *  [7, 8, 9]]
         * ----Transpose of above Matrix is --------
         * [[1, 4, 7],
         *  [2, 5, 8],
         *  [3, 6, 9]]
         * 
         */
        Scanner sc = new Scanner(System.in);

        int[][] A = { {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9} };
        int N = A[0].length;

        for(int i=0;i<N;i++){
            for(int j=0;j<A.length;j++){
                System.out.print(A[j][i]+" ");
            }
            System.out.println();
        }
    }
}
