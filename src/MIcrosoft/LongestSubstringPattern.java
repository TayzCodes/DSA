package MIcrosoft;

public class LongestSubstringPattern {
    /**
     *
     */

    public static int solution(String S) {
        int soln = 0;
        int lcount = 0, bIdx = 0,rcount=0, qcount = 0;
        if(S.length() != 0){
            for(int i=0;i< S.length();i++){
                if(S.charAt(i) == '<'){
                    if(rcount == 0){
                        lcount++;
                        if(bIdx == 0) bIdx = i;
                    }else{
                        //find last subsequence
                        if(lcount == 0 && rcount == 0){
                            soln = Math.max(soln, (qcount/2)*2);
                        }else{
                            int totalLen = i-bIdx+1;
                            int minVal = Math.min(lcount,rcount)+qcount;
                            int maxVal = Math.max(lcount, rcount);
                            soln = Math.max(soln, Math.min(maxVal, minVal)*2);
                        }
                        lcount =1;
                        bIdx = 0;
                        rcount = 0; qcount = 0;
                    }

                }else if(S.charAt(i) == '>'){
                    rcount++;
                } else if(S.charAt(i) == '?'){
                    qcount++;
                }
            }
            if(lcount == 0 && rcount == 0){
                soln = Math.max(soln, (qcount/2)*2);
            }else{
                int totalLen = S.length()-bIdx;
                int minVal = Math.min(lcount,rcount)+qcount;
                int maxVal = Math.max(lcount, rcount);
                soln = Math.max(soln, Math.min(maxVal, minVal)*2);
            }
        }

        return soln;


    }

    public static void main(String[] args) {
        System.out.println(solution("<<<<<<<<<<<<<??>"));
    }
}
