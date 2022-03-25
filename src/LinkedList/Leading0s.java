package LinkedList;

public class Leading0s {
    public static class  Node {
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
    static public Node moveZeroes(Node head)
    {
        int zeroCount = 0;
        Node nd = head;
        //O(n)
        while(nd != null){
            if(nd.data == 0){
                zeroCount++;
            }
            nd = nd.next;
        }
        if(zeroCount != 0){
            Node newNd = new Node(0);// first zero
            Node newHead =  newNd;
            zeroCount--;
            //O(n)
            while(zeroCount > 0){
                newNd.next = new Node(0);
                newNd = newNd.next;
                zeroCount--;
            }
            nd = head;
            //O(n)
            while(nd != null){
                if(nd.data != 0){
                    newNd.next = new Node(nd.data);
                    newNd = newNd.next;
                }
                nd = nd.next;
            }
            newNd.next = null;
            return newHead;
        }
        return head;
//O(n)



    }
    public static void main(String[] args) {
            Node head = new Node(0);
            head.next = new Node(4);
            head.next.next = new Node(0);
            head.next.next.next = new Node(5);
            head.next.next.next.next = new Node(6);
            head.next.next.next.next.next = new Node(0);

            // 0-> 4-> 0 -> 5-> 6 -> 0
            System.out.println(head.toString());

            Node resNode = moveZeroes(head);

            System.out.println(resNode);
    }
}
