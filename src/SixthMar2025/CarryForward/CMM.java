package SixthMar2025.CarryForward;

public class CMM {
    //Closest Min Max

    //Given N array elements,
    //Find length of Smallest Subarray which contains Min & Max of an array

    public static void main(String[] args) {
        int[] A = {9,6,8,1,4,5,9,9,4,5,1}; // 4 ans
        // test case 2:- 1,2,3,1,3,4,6,4,6,3       val = 4

        Solution(A);
    }
    public static void Solution(int[] A){
        //Finding Min and Max elements
        int min = A[0];
        int max = A[0];
        for(int i=0;i<A.length;i++){
            if(A[i]<min){
                min = A[i];
            }
            else if(A[i]>max){
                max = A[i];
            }
        }

        // Solution
        int min_i = -1;
        int max_i = -1;
        int min_l = A.length;
        for(int i=0;i<A.length;i++){
            int val = min_l;
            if(A[i]==min){
                min_i = i;
                if(max_i != -1){
                    val = min_i - max_i + 1;
                }
            }
            else if(A[i]==max){
                max_i = i;
                if(min_i != -1){
                    val = max_i - min_i + 1;
                }
            }
            if(val < min_l){
                min_l = val;
            }
        }
        System.out.println(min_l);
    }
}
