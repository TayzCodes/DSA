package Strings;

public class FindSum {
   /* public static  int solution(int N) {
        // Implement your solution here
        String init = "1";
        int sum = 0;
        int res = findSum(N,sum ,'1');
        return res;
    }


        static int findSum(int N,  String init, char ch){

            int currsum = 0;
            int initSum = 0;
            for(int i = 0;i< init.length();i++){
                initSum += init.charAt(i)-'0';
            }
            for(int c = 9; c >= 9;c--){
                currsum = initSum+c  ;
               if(currsum == N){
                   return Integer.parseInt(init+c);
               } else if(currsum > N){
                   findSum(N,init ,'1');
               }
            }
            if(currsum < N){
                return findSum(N, Character.toString(ch++), ch++);
            }

        }


    public static void main(String[] args) {
        System.out.println(solution(16));
    }*/
}
