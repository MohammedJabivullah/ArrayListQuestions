package TenthFeb2025;

public class RangeSum {
    public static void main(String[] args) {
        /*
         * Given an Array of Integers
         * A[] = {5,7,9,2,1,-5,8,6,4};
         * find sum of elements within a given Range in 2D Matrix
        B[][] {{0,3}
               {1,4}
               {2,8}
               {0,5}};
               -----------Explanation------
               {0,3} = 5+7+9+2       = 23
               {1,4} = 7+9+2+1       = 19
               {2,8} = 9+2+1-5+8+6+4 = 25
               {0,5} = 5+7+9+2+1-5   = 18
         */
        int[] A = {5,7,9,2,1,-5,8,6,4};
        int[][] B = {{0,3},
                {1,4},
                {2,8},
                {0,5}};

        for(int i=0;i<B.length;i++){
            int C = 0;
            for(int j=B[i][0];j<=B[i][1];j++){
                C +=A[j];
            }
            System.out.print(C+" ");
        }
    }

}
