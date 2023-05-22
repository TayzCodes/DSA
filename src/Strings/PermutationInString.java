package Strings;

public class PermutationInString {
    public static  boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }

        int i =0 , j=0;

        while(i< s2.length() && j< s1.length()){
            if(s1.charAt(j) == s2.charAt(i)){
                i++;
                j++;
            }else{
                j=0;
                i++;
            }
        }
        if(j >= s1.length())
            return true;

        return false;
    }

    public static void main(String[] args) {
        String s1= "ab";
        String s2 = "eidbaooo";

        System.out.println(checkInclusion(s1,s2));
    }
}
