package FifthFeb2025.Group1;

public class RowColSum {
    public static void main(String[] args) {
        /*
         * You are given a matrix A, 
         * you have to return an array containing sum of each row elements followed by sum of each column elements of the matrix.
         * A = [[1, 2],
         *      [4, 5],
         *      [8, 9]]
         * 
         * ans[] = {{3,9,17,13,16}};
         */
        int[][] A = { {1, 2, 3},
                {4, 5, 6},
                {8, 9, 10} };
        int[] ans = new int[A.length +  A[0].length];

        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                ans[i] += A[i][j];
                if(ans.length>A.length+j){
                    ans[A.length+j] += A[i][j];
                }
            }
        }
        // To print ans[]
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }

}
