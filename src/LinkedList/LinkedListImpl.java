package LinkedList;

public class LinkedListImpl {
    class Node{
        int data;
        Node next;

        public Node(int d) {
            this.data=d;
            this.next=null;
        }
    }
    Node head;


        public void addlast(int d) {
            Node n = new Node(d);

            if(head==null) {
                head=n;
            }

            else {
                Node temp = head;
                while(temp.next!=null) {
                    temp=temp.next;
                }

                temp.next=n;
            }

        }

        public void printLinkedList() {
            Node temp=head;
            while(temp.next!=null) {
                System.out.print(temp.data+ "-> ");
                temp=temp.next;
            }
            System.out.print(temp.data+ "-> ");
        }

}
