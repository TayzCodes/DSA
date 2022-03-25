package Arrays;

public class ClosestMinMax {
    public static int solve(int[] arr) {
        int minA = arr[0];
        int maxA = arr[0];
        int lIdx = 0;
        int hIdx = 0;
        for(int i =1;i< arr.length;i++){
            if(arr[i]<= minA ){
                minA = arr[i];
                if(arr[i] == minA){
                    if(lIdx<i)lIdx = i;
                }
                else
                lIdx = i;
            }
            if(arr[i]>= maxA){
                maxA = arr[i];
                if(arr[i] == maxA){
                    if(hIdx<i)hIdx = i;
                }
                else
                hIdx = i;
            }

        }

        return Math.abs(lIdx-hIdx)+1;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{834, 563, 606, 221, 165};
        System.out.println(solve(arr));
    }
}
