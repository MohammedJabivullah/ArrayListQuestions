package SixthMar2025.CarryForward;

import java.util.ArrayList;

public class LA {
    // Leaders in an array

    //Given an integer array A containing N distinct integers,
    // you have to find all the leaders in array A.
    // An element is a leader if it is strictly greater than all the elements to its right side.
    public static void main(String[] args) {
        int[] A = {16, 17, 4, 3, 5, 2};

        Solution(A);
    }
    public static void Solution(int[] A){
        int max = A[A.length-1];
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(max);
        for(int i=A.length-2;i>=0;i--){
            if(A[i]>max){
                max = A[i];
                ans.add(0,max);
            }
        }
        System.out.println(ans);
    }
}
