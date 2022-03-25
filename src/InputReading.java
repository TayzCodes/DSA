import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class InputReading {


    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        Scanner sc =  new Scanner(System.in);

        // we have first line as T -> number of test cases
        // we have second line as x, y -> two space separated integers
        String readLine = br.readLine();
        String[] breakInput = readLine.split(" ");
        for(int  i=0;i< breakInput.length;i++){
            System.out.println( Integer.parseInt(breakInput[i]) + " ");
        }
        System.out.println();


    }}
