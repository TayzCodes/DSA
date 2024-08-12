package Stacks;
import java.util.*;
public class EncodeDecode {
    public static String decodeString(String s) {

        Stack<String> st = new Stack<>();
        Stack<Integer> nst = new Stack<>();

        int num = 0;
        String currStr = "";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(s.charAt(i)-'0'>= 0 && s.charAt(i)-'0' <= 9){
                if(!currStr.equals("")){
                    st.push(currStr);
                    currStr = "";
                }
                int currVal = c-'0';
                num = num*10 + currVal;
            }else if(c == '{'){
                nst.push(num);
                num =0;

            }else if(c>= 'a' && c<='z' ){
                currStr = currStr+c;
            }else if(c == '}'){
                if(!currStr.equals("")){
                    st.push(currStr);
                    currStr = "";
                }

                int noOfTimes = nst.pop();
                String str = st.pop(), target="";
                for(int k = 0;k< noOfTimes;k++){
                    target = target+ str;
                }
                if(!st.isEmpty()){
                    target = st.pop() + target;
                }

                st.push(target);
            }

        }//for
        return st.pop();
    }

    public static void main(String[] args) {


        /**
         * 10{yash}10{rahul}10{priya}
         *
         */
    }
}
