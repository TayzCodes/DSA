import java.util.Scanner;

public class Candies {

    public static  void printSeconds(String s){
        int time = 0;
        char[] sarray = s.toCharArray();
        int lastPosF = 0;

        for(int i=0;i<s.length();i++ ){
            if(sarray[i] == 'F') {
                if ((i - lastPosF) <= time && time != 0) {
                    time++;
                } else {
                    time = i-lastPosF;
                }
                lastPosF++;
            }

        }
        System.out.println(time);
    }
    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);
        String input = sc.next();
        printSeconds(input);
    }
}
