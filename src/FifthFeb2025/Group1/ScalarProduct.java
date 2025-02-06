package FifthFeb2025.Group1;

public class ScalarProduct {
    public static void main(String[] args) {
        /*
         * ou are given a matrix A and and an integer B, 
         * you have to perform scalar multiplication of matrix A with an integer B
         * 
         * A = [[1, 2, 3],
                [4, 5, 6],
                [7, 8, 9]]
            B = 2 
            ---Answer array will be -------
            [[2, 4, 6], 
             [8, 10, 12], 
             [14, 16, 18]]
         */
        int[][] A = { {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9} };
        int B = 2;

        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                A[i][j] = A[i][j]*B;//A[i][j] *= B;
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
}
