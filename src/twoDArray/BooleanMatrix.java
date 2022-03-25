package twoDArray;

import java.util.Scanner;

public class BooleanMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] a = new int[1000][1000];
        while(t>0){
            int m = sc.nextInt();
            int n = sc.nextInt();

            boolean[]  b =  new boolean[m];
            for(int i =0; i<m;i++){
                for(int j =0;j< n;j++){
                    a[i][j] = sc.nextInt();
                    if(a[i][j] == 1) {
                        b[i] = true;
                    }
                }
            }

            for(int i =0; i<m;i++){

                if(b[i]){
                    for(int j =0;j< n;j++){
                        System.out.print(1+" ");
                    }
                }else {
                    for(int j =0;j< n;j++){
                        System.out.print(0+" ");
                    }
                }

            }
            System.out.println();
        }


    }


    }
