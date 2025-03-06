package FourthMar2025.PrefixSum;

public class ENA {
    //Even Numbers in Array

    public static void main(String[] args) {
        int[] A = {2, 1, 8, 3, 9, 6};
        int[][] Q = {{0, 3},
                {3, 5},
                {1, 3},
                {2, 4}};
        int[] Ans = Solution(A, Q);
        for(int i=0;i<Ans.length;i++){
            System.out.print(Ans[i]+" ");
        }
    }
    public static int[] Solution(int[] A, int[][] Q){
        int[] EL = new int[A.length];
        int count = 0;
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0){
                count++;
            }
            EL[i] = count;
        }

        int[] ans = new int[Q.length];
        for(int i=0;i<Q.length;i++){
            if(Q[i][0]==0){
                ans[i] = EL[Q[i][1]];
            }
            else{
                ans[i] = EL[Q[i][1]]-EL[Q[i][0]-1];
            }
        }
        return ans;
    }

}
