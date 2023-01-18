package LinkedList;

/**
Problem Description
Given a singly linked list A and an integer B, reverse the nodes of the list B at a time and return the modified linked list.



Problem Constraints
1 <= |A| <= 103

B always divides A



Input Format
The first argument of input contains a pointer to the head of the linked list.

The second arugment of input contains the integer, B.



Output Format
Return a pointer to the head of the modified linked list.



Example Input
Input 1:

 A = [1, 2, 3, 4, 5, 6]
 B = 2
Input 2:

 A = [1, 2, 3, 4, 5, 6]
 B = 3


Example Output
Output 1:

 [2, 1, 4, 3, 6, 5]
Output 2:

 [3, 2, 1, 6, 5, 4]
 */
public class ReverseList {
   private static class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }
    public static ListNode reverseList(ListNode A, int B) {


        ListNode cur = A;
        ListNode next = null;
        ListNode prev = null;
        int cnt = 0;
        while(cnt <B && cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            cnt++;

        }
        if(A != null){
            A.next = reverseList(next, B);
        }
        return prev;
    }

    public static void main(String[] args) {

    }
}
