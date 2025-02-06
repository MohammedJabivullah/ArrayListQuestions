package FifthFeb2025.Group1;

public class MainDiagonalSum {
    public static void main(String[] args) {
        /*
         * You are given a N X N integer matrix. You have to find the sum of all the main diagonal elements of A.
         * Main diagonal of a matrix A is a collection of elements A[i, j] such that i = j.
         * for Main diagonal both i and j are same
         * {{1 -2 -3 }
         *  {-4 5 -6 }
         *  {-7 -8 9}}
         * ans = 15
         */
        int[][] A = { {1, -2, -3},
                    {-4, 5, -6},
                    {-7, -8, 9} };
        int ans = 0;

        for(int i=0;i<A.length;i++){
            ans += A[i][i];
        }
        System.out.println(ans);
    }

}
