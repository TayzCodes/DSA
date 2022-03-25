public class ArraySum {

    public static void main(String args[]){
        // find the  number of repeated elements ; array is sorted
        int A[] = new int[]{1,2,3,4,5,6,7};
        int i=0,j =A.length-1;
        while( i <= j ){
                int t = A[i];
                A[i] = A[j];
                A[j] = t;
                i++;
                j--;
        }


        }


}

