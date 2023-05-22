package BinarySearch;

public class FloorAndCeil {
    public static int findLower(int a[], int n,int k){
        int l = 0;
        int r = n-1;
        int ans = -1;
        while(l<=r){
            int mid = (l+r)/2;
            if(a[mid]<=k){
                l = mid+1;
            }else{
                r = mid -1;
                ans = r;
            }
        }
        return ans;
    }
    static void floorAndCeil(int a[], int N, int x){
        int i = findLower(a,N,x);
        if(i !=-1) {
            if (a[i] == x) {
                System.out.println(a[i] + " " + a[i]);
            } else if (i == N - 1) {
                System.out.println(a[i] + " " + "-1");
            }  else {
                System.out.println(a[i] + " " + a[i + 1]);
            }
        }else{
            if(x< a[0]){
                System.out.println(-1 + " " + a[0]);
            }else if(x> a[N-1]){
                System.out.println(a[N-1] + " " + -1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,5,6,11,15};
        int[] q = new int[]{2,4,8,1,16};
        for(int x: q) {
            floorAndCeil(arr, 5,x);
        }
    }

}
