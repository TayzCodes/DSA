package Mocks;

/**
 * 1. Sort stack using recursion
 * 2. Reverse a stack using recursion
 *
 int depth = 0;
  Queue<TreeNode> q = new LinkedList<>();
 if(root != null) q.add(root);
 while(!q.isEmpty()) {
         depth++; int size = q.size();
          while(size-- > 0) {
         TreeNode curr = q.poll();
         if(curr.left != null) q.add(curr.left);
         if(curr.right != null) q.add(curr.right);
  }
  } return depth;
 */
public class SortStack {
}
