/*  int st = i;
           int kv = k;
           int sum = 0;
           while(kv>0 && st < n){
               sum += arr[st];
               st = (st+1)%n;
               kv--;
           }
           System.out.print(sum+" ");
       }*/

import java.util.Scanner;

public class KsubArray {
    static void  kCircleSum(int arr[],int n,int k){
    //Enter your code here'
        int sum = 0;
        for(int i=0;i<k;i++){
            sum =  sum+ arr[i];
        }
        System.out.print(sum+ " ");


        for (int i = 0; i < n-1; i++) {

            sum = sum+arr[(i+k)%n] - arr[i];
            System.out.print(sum+ " ");
        }



    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i< n;i++){
            arr[i] = sc.nextInt();
        }
        kCircleSum(arr,n,k);
    }
}
