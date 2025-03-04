package FourthMar2025.PrefixSum;
/*
   You are given an integer array A of length N.
   You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
   For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
*/
public class PrefixSum {
    public static void main(String[] args) {

        int[] A = {-3,6,2,4,5,2,8,-9,3,1};
        int[][] B = {{4,8},
                     {3,7},
                     {1,3},
                     {0,4},
                     {6,9},
                     {7,7}};
        Solution(A,B);
    }
    public static void Solution(int[] A, int[][] B){
        // Created a Prefix sum Array
        int[] pf = new int[A.length];
        pf[0] = A[0];
        for(int i = 1; i< A.length; i++){
            pf[i] = pf[i-1]+ A[i];
        }

        for(int i=0;i<B.length;i++){
            if(B[i][0]==0){
                System.out.println("Query "+(i+1)+":"+
                        pf[B[i][1]]);
            }
            else{
                System.out.println("Query "+(i+1)+":"+
                        (pf[B[i][1]]-pf[B[i][0]-1]));
            }
        }
    }
}
