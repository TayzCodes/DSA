package Tree;

/**
 * https://leetcode.com/problems/range-sum-of-bst/
 *
 * easy
 */
public class RangeBST {
 public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
     }

    public static int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) return 0;
        int totalSum = 0;
        int a = rangeSumBST(root.left, low, high);
        int b = rangeSumBST(root.right, low, high);
        totalSum = a+b;
        if(root.val>=low && root.val<=high){
            totalSum = root.val + rangeSumBST(root.left, low, high)+ rangeSumBST(root.right, low, high);
            //return sum;
        }
        if(root.val < low){
            totalSum = root.val + rangeSumBST(root.right, low, high);
        }
        if(root.val > high){
            totalSum = root.val + rangeSumBST(root.left, low, high);
        }
        return totalSum;

    }

    public static void main(String[] args) {

    }
}
