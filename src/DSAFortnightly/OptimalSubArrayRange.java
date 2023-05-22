package DSAFortnightly;

public class OptimalSubArrayRange {
    public static long[] solve(int[] A, int[][] B) {

        long[] result = new long[B.length];
        int k = 0;
        for(int i = 0;i< B.length;i++){
            int x = B[i][0]-1, y=B[i][1]-1;
            int maxSum = Integer.MIN_VALUE;
            int rangeSum = 0;
            for(int j = x;j<=y;j++){
                rangeSum+=A[j];
            }
            maxSum = Math.max(maxSum, rangeSum);

            while(x>=0 || y<=A.length-1){
                int sum1 = x-1>=0 ? rangeSum+A[x-1]:Integer.MIN_VALUE;
                int sum2 = y+1<=A.length-1? rangeSum+A[y+1]: Integer.MIN_VALUE;
                int sum3 = x-1>=0 && y+1 <= A.length-1 ? rangeSum+A[x-1]+A[y+1]: Integer.MIN_VALUE;

                int currMaxSum = Integer.MIN_VALUE;
                if(sum1 > sum2 && sum1> sum3){
                    x--;
                    currMaxSum = sum1;
                    maxSum = Math.max(maxSum, currMaxSum);
                }
                else if(sum2 > sum1 && sum2> sum3){
                    y++;
                    currMaxSum = sum2;
                    maxSum = Math.max(maxSum, currMaxSum);
                }
                else if(sum3 > sum2 && sum3> sum1){
                    x--;y++;
                    currMaxSum = sum3;
                    maxSum = Math.max(maxSum, currMaxSum);
                }else {
                    x--;y++;
                }

            }


            result[k++] = maxSum;
            System.out.println(result[k-1]);
        }

        return result;
    }

    public static void main(String[] args) {
       /* int n = 4;
        int[] A = new int[]{-1, 0, -2, 5};
        int Q = 2;
        int[][] B = new int[][]{{1,3},{2,4}};*/
        int n = 5;
        int[] A = new int[]{5, -4, -3, 2, -1};
        int Q = 2;
        int[][] B = new int[][]{{1,4},{2,5}};
        System.out.println(solve(A, B));
    }
}
