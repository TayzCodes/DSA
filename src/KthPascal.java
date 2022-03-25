public class KthPascal {

    static long modres = 1000000007;
    static long[][] arr = new long[3002][3002];
    public static void findKthRowMul(int k){
        long prev = 1;
        System.out.print(prev+ " ");
        for(int i = 1;i<= k;i++){
            long val = (prev * (k-i+1))/i;

            System.out.print(val+ " ");
            prev = val%modres;

        }
    }
    public static void findKthRow(int k){


        for(int i=0; i<= 3001;i++){
            for(int j =0;j <=i;j++){
                if(j ==0  || j==i){
                    arr[i][j] = 1;
                }else {
                    arr[i][j] = ((arr[i-1][j] % modres) + (arr[i-1][j - 1] % modres)) % modres;
                }
            }
        }
    }

    public static void main(String[] args){
        findKthRow(100);

        for(int i=0; i< 100+1;i++){
            System.out.print(arr[100][i]+ " ");
        }
        System.out.println();
    }
}
