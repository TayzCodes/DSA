package Stacks;
import java.util.Stack;

public class RPN {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<Integer>();
        for(int i = 0;i< tokens.length;i++){
            if(!tokens[i].equals("+") && !tokens[i].equals("-")
                    && !tokens[i].equals("*") && !tokens[i].equals("/")){
                //System.out.print(tokens[i]);
                st.push(Integer.parseInt(tokens[i]));
            }else{
                int op2 = st.pop();
                int op1 = st.pop();
                int val = 0;
                switch(tokens[i]){
                    case "+":  val = op1+op2;
                        break;
                    case "-": val=op1-op2;
                        break;
                    case "*": val = op1 * op2;
                        break;
                    case "/": val = op1/op2;
                        break;
                }
                st.push(val);
            }
        }
        return st.pop();
    }
    public static void main(String[] args) {
        String[] tokens = new String[]{"4","13","5","/","+"};
        System.out.println(evalRPN(tokens));
    }
}
