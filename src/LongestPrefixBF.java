public class LongestPrefixBF {

    public static String solve(String[] strs){
        String res = "";

        int i=0;// index of the Strign array
        // strs = ["ab"];
        if(strs.length == 1){
            return strs[0];
        }
        //common case
        //  flow, flowht, flower ==> fl
        while(i+1 < strs.length){// iterates over string array
            // at each iteration i am comparing string at i and string at i+1
            // character by character check till length of smallestt of the two strings
            String stringcomp = strs[i];
            if(res.length() != 0)  stringcomp = res;
            int minLength = Math.min(stringcomp.length(), strs[i+1].length()); // 6
            int maxidx = -1;
                for(int j=0;j< minLength;j++){// character by character check

                    if(stringcomp.charAt(j) == strs[i+1].charAt(j)){
                        maxidx=j; //1
                    }else {
                        break;
                    }
                }// for
            i++;
            if(res.length() == 0 || maxidx < res.length())
                res = strs[i].substring(0,maxidx+1); // flow
            if(maxidx == -1){
                return "";
            }
        }
        return res;

    }
    public static void main(String args[]){
        // String[] strs = {"dog","racecar","car"};

        //
       //  String[] strs = {"flow","flight","flower"};
        String[] strs = {"aaa","aaf","are"};
        System.out.println("\n");
        System.out.print(solve(strs));
    }
}
