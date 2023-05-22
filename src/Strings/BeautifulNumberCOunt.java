package Strings;

public class BeautifulNumberCOunt {
    public static int solve(String A, String B) {
        String curr = A;
        int count = 0;
        int i = A.length()-1;
        int mod = 1000000007;
        while(!curr.equals(B)){
            //System.out.println(curr);
            int j = 0;
            int xor = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            while(j != curr.length()){

                if((curr.charAt(j) - '0') < min){
                    min = curr.charAt(j) - '0';
                }
                if((curr.charAt(j)-'0') > max){
                    max = curr.charAt(j) - '0';
                }
                xor ^= curr.charAt(j) - '0';
                j++;
            }
            int avg = (min+max)/2;
            if(xor> avg){
                count = count%mod +1;
            }
            if(curr.charAt(i) == '9' && i >= 1) {
                String newcurr=  "";
                while (curr.charAt(i) == '9' && i-1 >=0 ) {
                    newcurr = String.valueOf(((curr.charAt(i-1)-'0')+1))+'0';
                    i--;
                }
                curr = newcurr;
                i =  curr.length()-1;

            }else{
                //System.out.println(i+">>"+curr.substring(0,i));
                //System.out.println(">>>"+String.valueOf(curr.charAt(i) - '0'));
                curr = curr.substring(0,i)+ ""+((curr.charAt(i) - '0') + 1);
                i= curr.length()-1;
            }

        }
        int j = 0;
        int xor = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        while(j != curr.length()){

            if((curr.charAt(j) - '0') < min){
                min = curr.charAt(j) - '0';
            }
            if((curr.charAt(j)-'0') > max){
                max = curr.charAt(j) - '0';
            }
            xor ^= curr.charAt(j) - '0';
            j++;
        }
        int avg = (min+max)/2;
        if(xor> avg){
            count = count%mod +1;
        }

        return count;

    }

    public static void main(String[] args) {
        System.out.println(solve("170888","676277"));
    }
}
