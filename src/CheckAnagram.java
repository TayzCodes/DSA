import java.util.*;

public class CheckAnagram {

    static int NO_OF_CHARS = 256;
    static void isAnagram(char[] str1, char[] str2){
        int[] count = new int[256];
        if(str1.length != str2.length){
            System.out.print("NO");
            return;
        }
        for(int i=0;i< str1.length;i++ ){
            count[str1[i]-'a']++;
            count[str2[i]-'a']--;

        }

        for(int i=0;i< count.length;i++){
            if(count[i]!=0){
                System.out.print("NO");
                return;
            }
        }
        System.out.print("YES");
    }
    public static void main (String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
        s1.charAt(0);
        isAnagram(str1, str2);



    }
}
