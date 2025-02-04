package ThirdFeb2025.Arrays2D.Third;
import java.util.Scanner;

public class printCol {
    public static void main(String[] args) {
        /*
         * Given a matrix of N rows and M columns, 
         * print it column by column. 
         * Firstly print 0th column, then 1st column, 2nd column and so on.
         * {{10 20 30 40},
            {50 60 70 80},
            {90 100 110 120}};
            -------output------------
            10  50  90   
            20  60  100
            30  70  110 
            40  80  120
         */
         Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] a = new int[N][M];

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                a[i][j] = sc.nextInt();
            }
        }
         for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                System.out.print(a[j][i]+" ");
            }
             System.out.println("");
        }
    }

}
