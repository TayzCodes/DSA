
public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int target = 4;
        //linear search
        boolean flag = false;
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] == target) {
                System.out.print("Found " + target + " at " + i);
                flag = true;
                break;
            }//if
        }// for
        if (!flag) {
            System.out.println("Not Found");
        }//if

    }// end of main
}// end of class

/**
 * 1. naming
 * 2. logic - pseudo code write on paper
 *
 *      step 1: target
 *      step 2: i =0 -> n
 * 3. Correct syntax; but understand compiler....
 */
