package FourthFeb2025.first;

public class identityMatrix {
    public static void main(String[] args) {
        /*
         * You are given a N X N square integer matrix A. You have to tell whether A is an identity matrix or not.
         * Identity matrix is a special square matrix whose main diagonal elements are equal to 1 and all other elements are 0.
         * 
         * [[1, 0], 
         *  [0, 1]]
         * Above 2x2 matrix is Identity Matrix
         * 
         * [[1, 0, 0], 
         *  [0, 1, 0],
         *  [0, 0, 1]]
         * Above 3x3 matrix is Identity Matrix
         * 
         * [[0, 0, 1], 
         *  [0, 1, 0],
         *  [1, 0, 0]]
         * Above 3x3 matrix is not Identity Matrix
         */

        int[][] A = { {0, 0, 1},
                {0, 1, 0},
                {1, 0, 0} };

        for(int i=0;i<A.length;i++){
            int c = 0;
            for(int j=0;j<A.length;j++){
                if(i==j){
                    if(A[i][j]!=1){
                        c++;
                        break;
                    }
                }
                else if(A[i][j]!=0){
                    c++;
                    break;
                }
            }
            if(c==0){
                System.out.println("Is Identity Matrix");
                break;
            }
            else{
                System.out.println("Not Identity Matrix");
                break;
            }
        }
    }

}
