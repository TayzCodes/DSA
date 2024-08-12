package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
    public static int precedence(char c){
        if(c == '^'){
            return 5;
        }else if(c == '*'|| c=='/'){
            return 4;
        }else {
            return 3;
        }

    }

    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String infix = sc.nextLine();
        Stack<Character> st =  new Stack();
        String postfix = "";
        for(int i=0;i< infix.length();i++){
            char c =  infix.charAt(i);
            if(c == '('){
                st.push(c);
            }else if(c == ')'){
                while(st.peek() != '('){
                    char s = st.pop();
                    postfix = postfix + s;
                }
                st.pop();
            }else if(c == '^'|| c == '*'||c =='/'||c =='+'||c=='-'){
                while(!st.isEmpty() && st.peek() !='('&& precedence(c)<=precedence(st.peek())){
                    char s = st.pop();
                    postfix = postfix + s;
                }
                st.push(c);

            }else{
                postfix = postfix + c;
            }

        }
        while(!st.isEmpty()){
            char s = st.pop();
            postfix = postfix+s;
        }
        System.out.println(postfix);


    }
}
