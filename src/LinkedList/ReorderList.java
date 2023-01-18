package LinkedList;

/**
 * Given a singly linked list A
 *
 *  A: A0 → A1 → … → An-1 → An
 * reorder it to:
 *
 *  A0 → An → A1 → An-1 → A2 → An-2 → …
 * You must do this in-place without altering the nodes' values.
 *
 *
 *
 * Problem Constraints
 * 1 <= |A| <= 106
 *
 *
 *
 * Input Format
 * The first and the only argument of input contains a pointer to the head of the linked list A.
 *
 *
 *
 * Output Format
 * Return a pointer to the head of the modified linked list.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [1, 2, 3, 4, 5]
 * Input 2:
 *
 *  A = [1, 2, 3, 4]
 *
 *
 * Example Output
 * Output 1:
 *
 *  [1, 5, 2, 4, 3]
 * Output 2:
 *
 *  [1, 4, 2, 3]
 */
public class ReorderList {
    static class ListNode {
     public int val;
     public ListNode next;
     ListNode(int x) { val = x; next = null; }
    }

        public ListNode reorderList(ListNode A) {
            // halve the linkedlist
            // reverse the second half
            // now create the original linkedlist with A0 -> An -> A1-> An-1
            //basically temp = first.next; first.next = second; second.next = temp;first = temp;second = second.next; repeat

            ListNode s = A;
            ListNode f = A;
            if(s.next == null){
                return A;
            }
            while(f != null && f.next != null){
                s= s.next;
                f = f.next.next;

            }

            // reverse the linkedlist
            ListNode cur = s;
            ListNode nxt = s.next;
            ListNode prev = null;

            while(cur!= null){
                cur.next = prev;
                prev = cur;
                cur = nxt;
                nxt = (cur != null && cur.next != null ) ? cur.next: null;
            }

            // prev is head of reversed
            ListNode head = A;

            while(prev != null && head != null){
                ListNode fNxt = head.next;
                head.next = prev;
                ListNode sNxt = prev.next;
                prev.next = fNxt;
                prev = sNxt;
                head = fNxt;

            }
            if (head != null){
                head.next = null;

            }
            return A;
        }

    public static void main(String[] args) {

    }


    }


