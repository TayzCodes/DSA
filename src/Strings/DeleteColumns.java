package Strings;

/**
 * https://leetcode.com/problems/delete-columns-to-make-sorted/description/
 */
public class DeleteColumns {
    public static int minDeletionSize(String[] strs) {
        int count = 0;

        for(int i =0;i< strs[0].length();i++){
            for(int j = 0;j < strs.length;j++){
                int prevChar = strs[0].charAt(i);
                if(strs[j].charAt(i) < prevChar){
                    count++;
                    break;
                }
                prevChar = strs[j].charAt(i);
            }// for all strings at column i
            // reset prevChar

        }
        return count;
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"cba","daf","ghi"};
        System.out.println(minDeletionSize(strs));
    }
}
