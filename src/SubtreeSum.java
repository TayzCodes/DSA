public class SubtreeSum {
    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
        }

    }
    static class INT
    {
        int v;
        INT(int a)
        {
            v = a;
        }
    }
    public static Node getNode(int val){
        return new Node(val);
    }
    public static int countSubtreesWithSum(Node root, INT count, int x)
    {
        // Your code here

        if(root == null)
            return 0;
        int ls = countSubtreesWithSum(root.left,
                count, x);
        int rs = countSubtreesWithSum(root.right,count, x);
        int sum  = ls+rs+root.data;
        if(sum == x){
            count.v++;
        }
        return sum;
    }
    static int countSubtreesWithSumX(Node root, int x)
    {
        // Your code here

        if(root == null)
            return 0;
        INT count = new INT(0);
        int ls = countSubtreesWithSum(root.left, count,x);
        int rs = countSubtreesWithSum(root.left, count,x);
        int sum  = ls+rs+root.data;
        if(sum == x){
            count.v++;
        }
        return count.v;
    }


    public static void main(String[] args){
        Node root = getNode(5);
        root.left = getNode(-10);
        root.right = getNode(3);
        root.left.left = getNode(9);
        root.left.right = getNode(8);
        root.right.left = getNode(-4);
        root.right.right = getNode(7);

        int x = 7;

        System.out.println("Count = " +
                countSubtreesWithSumX(root, x));

    }
}
