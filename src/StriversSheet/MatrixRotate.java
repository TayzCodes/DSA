package StriversSheet;

public class MatrixRotate {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        //first transpose the matrix
        for(int i = 0;i< n;i++){
            for(int j =i;j<n ;j++){
                if(i!=j){
                    int t = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = t;
                }
            }
        }
        //now we reverse the matrix using a simple column matrix as temp
        int[] temp = new int[n];
        for(int i = 0;i<n/2;i++){// col
            for(int j = 0;j < n; j++){
                temp[j]= matrix[j][i];
                matrix[j][i] = matrix[j][n-1-i];
                matrix[j][n-1-i] = temp[j];
            }
        }
        for(int i = 0;i<n;i++){// col
            System.out.print("{");
            for(int j = 0;j < n; j++){
                System.out.print(matrix[i][j]+",");
            }
            System.out.println("}");
        }

    }

    public static void main(String[] args) {
        int[][] mat = new int[][]{{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(mat);
    }
}
