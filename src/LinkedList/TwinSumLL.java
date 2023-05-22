package LinkedList;

import java.util.Stack;

public class TwinSumLL {
    private class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public int pairSum(ListNode head) {
        Stack<Integer> s = new Stack<>();
        ListNode nd = head;
        int n =0;
        if(head.next == null){
            return head.val;
        }
        while(nd != null){
            s.push(nd.val);
            n++;
            nd = nd.next;
        }
        int k = 0;
        int maxSum = Integer.MIN_VALUE;
        nd = head;
        while(k <= (n/2)){
            maxSum = Math.max(maxSum, nd.val+s.pop() );
            nd=nd.next;
            k++;
        }

        return maxSum;


    }

    // reversing first half
    public int pairSum2(ListNode head) {
        Stack<Integer> s = new Stack<>();
        ListNode nd = head;
        int n =0;
        if(head.next == null){
            return head.val;
        }
        while(nd != null){
            s.push(nd.val);
            n++;
            nd = nd.next;
        }
        int k = 0;
        int maxSum = Integer.MIN_VALUE;
        nd = head;
        while(k <= (n/2)){
            maxSum = Math.max(maxSum, nd.val+s.pop() );
            nd=nd.next;
            k++;
        }

        return maxSum;


    }





}
