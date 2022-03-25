public class LinkedListImpl {
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
            // nd
//1 -> 2 -> null
    //    1->3->2-> null?
//    1->2 -> null

 //   3 -> 2 -> null?   3.next = 1.next;
  // 1.next =  3;
  // 1-> 3

  //  findlemgthofLinkedlist(nd)

    public static void main(String[] args) {
        Node nd = new Node(1);
        nd.next = new Node(2);
        nd.next.next = new Node(3);
        int x = 10;
        Node newNd = nd;
    //int count = 0;
        while(nd != null) {
           // count++;
            System.out.println(nd.toString() + "--" );
            nd = nd.next;
        }
        //System.out.println("list length"+count );
    }
}
