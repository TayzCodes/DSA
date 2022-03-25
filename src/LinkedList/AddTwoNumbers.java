package LinkedList;

public class AddTwoNumbers {

    public static class Node{
        int data;
        Node next;
        Node(int val){
            this.data= val;
            this.next = null;
        }

    }
    static Node addNumber(Node first, Node second){
// return the head of the modified linked list

        int carry = 0;
        int ans = 0;
        Node res = new Node(0);
        Node resHead = res;
        while(first != null || second != null){
            int value1 = first != null? first.data: 0;
            int value2 = second != null? second.data :0;

            int value = value1 +value2 + carry;
            if(value> 10){
                carry = value/10;
                value = value%10;
            } else {
                carry = 0;
            }
            if(first != null) first = first.next;
            if(second != null) second = second.next;
            res.data = value;
            if(first != null || second != null || carry > 0) {
                res.next = new Node(carry);
                res = res.next;
            }


        }

        return resHead;
    }

    public static void main(String[] args) {
        Node first = new Node(4);
        first.next = new Node(3);
        first.next.next = new Node(2);
        first.next.next.next = new Node(1);


        Node second = new Node(9);
        second.next = new Node(4);
        second.next.next = new Node(6);
        second.next.next.next = new Node(5);
        second.next.next.next.next = new Node(4);


        Node res = addNumber(first,second);

        while(res != null){
            System.out.print(res.data+"->");
            res = res.next;
        }

    }




}
