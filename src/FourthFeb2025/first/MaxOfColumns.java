package FourthFeb2025.first;

public class MaxOfColumns {
    public static void main(String[] args) {
        /*
         * Given a 2D array A of N rows and M columns. 
         * Find value of largest element in each column.
         * Return an array with all elements
         * 2D matrix as below
         * 1  2   3  4
         * 4  5   6  8
         * 7  8   9  7
         * 3  2   1  0
         * ansArray[] = {7,8,9,8}
         */
        int[][] A = { {1,2,3,4},
                {4,5,6,8},
                {7,8,9,7},
                {3,2,1,0} };
        int N = A.length;
        int M = A[0].length;

        int[] ansA = new int[A[0].length];

        for(int i=0;i<M;i++){
            int max = A[0][i];
            for(int j=0;j<N;j++){
                if(A[j][i]>max){
                    max = A[j][i];
                }
            }
            ansA[i] = max;
        }

        for(int i=0;i<ansA.length;i++){
            System.out.print(ansA[i]+" ");
        }
    }

}
