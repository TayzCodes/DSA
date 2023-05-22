package Tree;
import com.sun.source.tree.Tree;

import java.util.*;

public class ZigzagLevelOrder {
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

    static List<List<Integer>> res = new ArrayList<>();
    public static void zigzagLevel(TreeNode root){
        if(root == null) return;
        Queue<TreeNode> q  = new LinkedList<>();
        q.add(root);
        int level =1;
        while(!q.isEmpty()){
            int qsize = q.size();

            ArrayList<Integer> nodeList = new ArrayList<>();
            for(int i=0;i< qsize;i++){

                TreeNode node = q.poll();
                nodeList.add(node.val);
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }

            }
            if(level%2 == 0 ){
                Collections.reverse(nodeList);
            }
            level+=1;
            res.add(nodeList);
        }




    }
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        if(root != null ){
            zigzagLevel(root);
        }

        return res;
    }

    public static void main(String[] args) {
        TreeNode node =  new TreeNode(1);

        TreeNode nodeLeft = new TreeNode(2);
        node.left = nodeLeft;
        nodeLeft.right = new TreeNode(3);
        nodeLeft.right.right = new TreeNode(4);
        nodeLeft.right.right.right = new TreeNode(5);

        System.out.println(zigzagLevelOrder(node));

    }
}


