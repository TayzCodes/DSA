import java.io.*;
import java.util.*;


public class ropecutting {
    public static void main (String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);
        int rope = sc.nextInt();


        System.out.println(possibleValues(rope));

    }
    static long possibleValues(int rope)
    {
        long ans = 1;

        for(int i = 1; i < 12; i++)
        {
            ans *= (rope-i);
            ans /= i;
        }

        return ans;
    }
}
