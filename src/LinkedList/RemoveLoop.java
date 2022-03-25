package LinkedList;

/**
 * https://www.geeksforgeeks.org/detect-and-remove-loop-in-a-linked-list/
 */
public class RemoveLoop {
    static class Node{
        int value;
        Node next;
        Node(int val){
            this.value = val;
            this.next = null;

        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }
    public static void removeLoop(Node head){
        Node fast = head;
        Node slow = head;
        boolean isLoop = false;
        while(fast!= null && fast.next != null && slow != null){

            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                isLoop = true;
                break;
            }
        }

        // remove loop now
        if(isLoop) {
            slow = head;
            if(slow != fast){
                    while (slow.next != fast.next) {

                        slow = slow.next;
                        fast = fast.next;
                    }
                    fast.next = null;
            } else{

                while(fast.next != slow){
                    fast = fast.next;
                }
                fast.next = null;
            }
            }


    }

    public static void main(String[] args) {
        /**
         * 5
         * 7 58 36 34 16
         * 1
         */
        Node head = new Node(7);
        Node X = head;
        head.next = new Node(58);
        head.next.next = new Node(36);
        head.next.next.next = new Node(34);
        head.next.next.next.next = new Node(16);
        Node last = head.next.next.next.next;


        last.next = X;
//        Node head = new Node(1);
//        head.next = new Node(8);
//        Node X = head.next ;
//        X.next = new Node(3);
//        X.next.next = new Node(4);


        removeLoop(head);
        System.out.println(head);
    }
}
