package LinkedList;

public class MergeLists {
    /*
     * Definition for singly-linked list.
     */
     private static class ListNode {

         int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = null;
        ListNode head = res;
        while(list1 != null && list2 != null){
            if(list1.val == list2.val){
                ListNode nd1= new ListNode(list1.val);
                ListNode nd2 = new ListNode(list2.val);
                if(res == null){
                    res = nd1; res.next = nd2;
                    head = res.next;
                }else{
                    head.next = nd1; head.next.next =nd2;
                    head = head.next.next;
                }
                list1 = list1.next;
                list2 = list2.next;

            } else if(list1.val< list2.val){
                ListNode nd = new ListNode(list1.val);
                if(res == null){
                    res = nd;
                    head = res;
                }else{
                    head.next = nd;
                    head = head.next;
                }

                list1 = list1.next;
            }else {
                ListNode nd = new ListNode(list2.val);
                if(res == null){
                    res = nd;
                    head = res;
                }else{
                    head.next = nd;
                    head = head.next;
                }

                list2 = list2.next;
            }

        }

        while(list1 != null){
            ListNode nd = new ListNode(list1.val);
            if(res == null){
                res = nd;
                head= res;
            }else{
                head.next = nd;
                head = head.next;
            }

            list1 = list1.next;
        }

        while(list2 != null){
            ListNode nd = new ListNode(list2.val);
            if(res == null){
                res = nd;
                head = res;
            }else{
                head.next = nd;
                head = head.next;
            }

            list2 = list2.next;
        }


        return res;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);

        ListNode list1 = l1;
        l1.next = l2; l2.next = l3;


        ListNode l4 = new ListNode(1);
        ListNode l5 = new ListNode(3);
        ListNode l6 = new ListNode(4);

        ListNode list2 = l4;
        l4.next = l5; l5.next = l6;

        ListNode res = mergeTwoLists(list1, list2);
        ListNode temp = res;
        while (temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }


    }
}
