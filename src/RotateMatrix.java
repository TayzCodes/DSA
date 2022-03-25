/*Rotate a matrix by 90 degree in clockwise direction
*/


public class RotateMatrix {
    public static void solve(int[][] A) {

        String printStr = "";
        int N = A.length;
        for(int x =0;x < N/2 ;x++) {

            for (int y = x; y < (N - 1 - x); y++) {
                int t = A[x][y];
                A[x][y] = A[N-1-y][x];
                A[N-1-y][x] = A[N-1-x][N-1-y];
                A[N-1-x][N-1-y] = A[y][N-1-x];
                A[y][N-1-x] = t;
            }
        }
        //System.out.println(""+printStr);
        return;
    }
    public static void printArray(int[][] A){
        System.out.println("Demo ---> Matrix state --->");
        for(int i = 0;i< A.length;i++){
            for(int j =0;j< A.length;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int[][] A = new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        printArray(A);
        solve(A);
        printArray(A);

    }
}
