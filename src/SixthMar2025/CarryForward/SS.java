package SixthMar2025.CarryForward;
import java.lang.*;


public class SS {
    //Special Subsequences "AG"

    //Problem Description
    //You have given a string A having Uppercase English letters.
    //You have to find how many times subsequence "AG" is there in the given string.

    public static void main(String[] args) {
        String A = "ABCGAG";

        Solution(A);
    }
    public static void Solution(String A){
        int sum = 0;
        int count = 0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='A'){
                count++;
            }
            else if(A.charAt(i)=='G'){
                sum += count;
            }
        }
        System.out.println(sum);
    }
}
