package twoDArray;
import java.io.*;
import java.util.Scanner;

public class BooleanMatrixV2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        while(t > 0)
        {
            t--;
            int n=sc.nextInt();
            int m=sc.nextInt();
            String ones = "";
            String zeros = "";
            for(int i = 0;i< m;i++){
                ones+="1 ";
                zeros+="0 ";
            }
            String[] matrix = new String[n];

            for(int i = 0;i< n;i++){
                for(int j=0;j< m;j++)
                matrix[i] = ""+sc.nextInt();
            }
            for(int i = 0;i<n;i++){
                if(matrix[i].contains("1")){
                    System.out.println(ones);
                }else{
                    System.out.println(zeros);
                }
                // System.out.println();
            }
        }
    }
}
