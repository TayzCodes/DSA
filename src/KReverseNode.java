public class KReverseNode {

    public static ListNode reverseNode(ListNode nd, int k){
        ListNode prev = nd;
        ListNode prevnext = nd.next;
        int x = k;
        x--;
        while(x!=0 && prevnext != null){
            ListNode t = prevnext.next; //3
            prevnext.next = prev;
            prev = prevnext;
            prevnext = t;
            --x;

        }
        x= k;
        ListNode resNode = prev;
        x--;
        while(x>0){
            resNode = resNode.next;
            x--;
        }
        resNode.next = null;

        return prev;
    }
    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode nod = head;
        int n = 1;
        while(nod.next != null){
            n++;
            nod = nod.next;

        }
        int numrev = Math.floorDiv(n,k);
        int i =0;
        ListNode trav = head;
        ListNode nextk = trav;
        while(numrev != 0){
            int next = k;
            while(next != 0){
                nextk = nextk.next;
                next--;
            }
            ListNode node = reverseNode(trav,k);

            ListNode nodeNext = head;
            next = k-1;
            while(next !=0){
                --next;
                nodeNext = nodeNext.next;

            }
            nodeNext.next = nextk;
            trav = nextk;
            numrev--;
        }




        return head;

    }

    public static void main(String[] args){

        ListNode nd = new ListNode(1);
        ListNode nr = nd;
        for(int i=2;i< 6; i++){
            ListNode n = new ListNode(i);
            nr.next = n;
            nr = nr.next;
        }
        nd = reverseKGroup(nd,2);
        for(int i=1;i< 6; i++){
            System.out.print(nd.val+ " ");
            nd = nd.next;
        }


    }
}
