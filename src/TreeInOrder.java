import java.util.*;
public class TreeInOrder {
    public static class tree {
        int val;
        tree left,right;
        tree(int data)
        {
            val = data;
            left = null;
            right = null;
        }
    }

        public static void main (String[] args) {
            // Your code here
            Scanner scan = new Scanner(System.in);
            tree root = new tree(1);
            tree temp = root;
            int n = scan.nextInt();

            input(temp);

            printTree(root);
        }
        public static void input(tree root) {
            tree test = root;
            Scanner scan = new Scanner(System.in);
            test.left =  new tree(11);
            test.right =  new tree(12);

        }
        public static void printTree(tree root) {
            if(root == null)
                return;

            printTree(root.left);
            System.out.print(root.val + " ");
            printTree(root.right);
        }
    }


