package LinkedList;

public class RemoveDuplicates {
    public static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    static Node removeDuplicates(Node head) {
        Node nd = head;

        while (nd != null) {
            Node chkNode = nd.next;
            while (chkNode != null && chkNode.data == nd.data ) {
                chkNode = chkNode.next;
            }
            nd.next = chkNode;
            nd = nd.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(2);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(5);
        System.out.println(head);
        removeDuplicates(head);
        System.out.println(head);

    }
}