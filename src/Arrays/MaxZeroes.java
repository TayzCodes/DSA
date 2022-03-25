package Arrays;

/**
 * Maximum number of zeroes
 * Easy Accuracy: 35.24%
 * Given an array arr[] of N values, the task is to find the number which has the maximum number of zeroes.
 * If there are no zeroes then print -1.
 *
 * Note: If there are multiple numbers with the same (max) number of zeroes then print the Maximum number among them.
 *
 * Example 1:
 *
 * Input: N = 5
 * arr[] = {10, 20, 3000, 9999, 200}
 * Output:  3000
 * Explanation: 3000 contains 3 zero's
 * in it.
 *
 * Example 2:
 *
 * Input: N = 4
 * arr[] = {1, 2, 3, 4}
 * Output:  -1
 * Explanation: No zero is present.
 *
 *
 *
 */
public class MaxZeroes {
    static String checkIfGreater(String cur, String ans){
        if(cur.length() > ans.length()){
            return cur;
        } else if(ans.length() > cur.length()){
            return ans;
        } else {
            int i =0;
            char[] ansChars = ans.toCharArray();
            char[] curChars = cur.toCharArray();
            while(i < ans.length()-1 && Integer.parseInt(String.valueOf(ansChars[i]))
                    == Integer.parseInt(String.valueOf(curChars[i]) )) {
                i++;
            }
            if(Integer.parseInt(String.valueOf(ansChars[i]))
                    > Integer.parseInt(String.valueOf(curChars[i]))){
                return ans;
            }else{
                return cur;
            }
        }

    }
    static String MaxZero(String arr[], int N)
    {
        String ans = "-1";
        int maxZeroes = 0;
        for(int i = 0;i< N;i++){
            String cur = arr[i];
            char[] curChars  =cur.toCharArray();
            int curCnt = 0;
            for(int j=0;j<curChars.length;j++){
                if(curChars[j] == '0'){
                    curCnt++;
                }
            }
            if(curCnt > 0 && curCnt > maxZeroes){
                maxZeroes = curCnt;
                ans = cur;
            }else if(curCnt > 0 && curCnt == maxZeroes){
                ans = checkIfGreater(cur,ans);

            }

        }
        return ans;
    }

    public static void main(String[] args) {
        /**
         * Input: N = 5
         * arr[] = {10, 20, 3000, 9999, 200}
         * Output:  3000
         */
        String[] arr = new String[]{"10", "20", "3000", "9999", "200"};
        System.out.println(MaxZero(arr,5));
    }
}
