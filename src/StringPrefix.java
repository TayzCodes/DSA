import java.util.*;
public class StringPrefix {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int noOfGoodWellStrs = 0;
        // int i = 2;
        if(str.charAt(0) == str.charAt(1)){
            noOfGoodWellStrs++;
        }

         /*while((2*i)<= str.length()){
            String sub1 = str.substring(0,i);
            sub1=sub1+sub1 ;
            int d = 2*i;
            String sub2 = str.substring(0,d);
            if(sub1.equals(sub2)){
                noOfGoodWellStrs++;

            }
            i++;
        }
       while(i < str.length()){
            String sub = str.substring(0,i-1);
            i= i+2;
            int h = sub.length();
            if(sub.substring(0,h/2 ).equals(sub.substring(h/2, h-1))){
                noOfGoodWellStrs++;
            }
        }*/
        int i = str.length();
       /// System.out.println(str.substring(3,2));
        while(i>2) {
            if (i % 2 != 0) {
                i = i - 1;
            }
            else {
                String sub1 = str.substring(0, i/2);
                String sub2 = str.substring(i/2, i );
                if (sub1.equals(sub2)) {
                    noOfGoodWellStrs++;
                }
                i = i-2;
            }
        }


        Stack<String> st = new Stack<>();
        st.push("a");
        String s = "some";
        String[] sarrr = s.split("");
        String res = "";
        int slen = s.length();

        while(slen != 0){


        }


        System.out.println(noOfGoodWellStrs);

        String strr = "123";
        String testlead = strr.substring(0,1);
        strr.length();
    }
}