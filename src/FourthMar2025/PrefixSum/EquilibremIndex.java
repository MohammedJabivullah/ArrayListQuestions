package FourthMar2025.PrefixSum;

public class EquilibremIndex {
    public static void main(String[] args) {
        int[] A = {-7, 1, 5, 2, -4, 3, 0};

        System.out.println(Solution(A));
    }
    public static int Solution(int[] A){
        int[] pfs = new int[A.length];
        pfs[0] = A[0];
        for(int i=1;i<A.length;i++){
            pfs[i] = pfs[i-1]+A[i];
        }

        for(int i=0;i<A.length;i++){
            int left,right;
            if(i==0){
                left = 0;
                right = pfs[0]-pfs[pfs.length-1];
            }
            else if(i==A.length-1){
                left = pfs[i-1];
                right = 0;
            }
            else{
                left = pfs[i-1];
                right = pfs[A.length-1]-pfs[i];
            }
            if(left == right){
                return i;
            }
        }
        return -1;
    }
}
