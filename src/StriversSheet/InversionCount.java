package StriversSheet;

public class InversionCount {
    //static int inv_cnt = 0;
    static int merge(long[] arr, long[] temp, int l, int m, int r){
        int i = l,j = r, k = l;
        int inv_cnt = 0;
        while(i<= m-1 && j<=r){
            if(arr[i]<=arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
                inv_cnt = inv_cnt+ (m-i);
            }
        }
        while(i<=m-1){
            temp[k++] = arr[i++];
        }
        while(j<=r){
            temp[k++] = arr[j++];
        }
        for(int t = l;t<=r;t++){
            arr[t] = temp[t] ;
        }


        return inv_cnt;

    }
    static int mergeSort(long[] arr,long[] temp, int s, int e){
        int inv_cnt = 0, mid=0;
        if(s<e) {
            mid = (s + e) / 2;
            inv_cnt = mergeSort(arr,temp, s, mid);
            inv_cnt += mergeSort(arr, temp,mid + 1, e);
            inv_cnt += merge(arr,temp, s, mid, e);
        }

        return inv_cnt;
    }

    /**brute force
     *
     * @param arr
     * @param n
     * @return
     */
    static long inversionCount(long arr[], int n) {
        // Your Code Here
        long ans = 0;
        for(int i =0;i<arr.length;i++){
            for(int j = i+1; j< arr.length;j++){
                if(arr[i]> arr[j]){
                    ans++;
                }
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        long[] arr = new long[]{2,4,1,3,5};
        long[] temp = new long[arr.length];
        System.out.println(mergeSort(arr, temp,0, arr.length-1));
    }
}
