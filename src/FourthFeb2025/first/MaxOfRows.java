package FourthFeb2025.first;

public class MaxOfRows {
    public static void main(String[] args) {
        /*
         * Given a 2D array A of N rows and M columns. 
         * Find value of largest element in each row.
         * Return an array with all elements
         * 2D matrix as below
         * 1  2   3  4
         * 4  5   6  8
         * 7  8   9  7
         * 3  2   1  0
         * ansArray[] = {4,8,9,3}
         */

        int[][] A ={ {1,2,3,4},
                {4,5,6,8},
                {7,8,9,7},
                {3,2,1,0} };
        int[] ansA = new int[A.length];

        for(int i=0;i<A.length;i++){
            int max = A[i][0];
            for(int j=0;j<A[i].length;j++){
                if(A[i][j]>max){
                    max = A[i][j];
                }
            }
            ansA[i] = max;
        }
        for(int i=0;i<ansA.length;i++){
            System.out.print(ansA[i]+" ");
        }
    }
}
