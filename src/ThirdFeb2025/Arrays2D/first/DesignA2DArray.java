package ThirdFeb2025.Arrays2D.first;

public class DesignA2DArray {
    public static void main(String[] args) {
        /*
         * Print 2D matrix as below
         * 1  2   3  4
         * 4  5   6  8
         * 7  8   9  7
         * 3  2   1  0
         */
        int [][] a = {{1, 2, 3, 4}, 
                      {4, 5, 6, 8}, 
                      {7, 8, 9, 7}, 
                      {3, 2, 1, 0}};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    }

}
