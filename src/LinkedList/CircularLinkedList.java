package LinkedList;

import java.util.Scanner;

public class CircularLinkedList {
    public static class Node{
        int value;
        Node next;
        Node(int val){
           this.value = val;
           this.next = null;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the list: ");
        int n = sc.nextInt();
        System.out.println("Enter the list items : ");
        Node head = new Node(sc.nextInt());
        Node nd = head;
        for(int i=1;i< n;i++){
            nd.next = new Node(sc.nextInt());
            nd = nd.next;

        }
        // circular

        nd.next = head;
            String s = "";

        Node ndprint = head;
        System.out.println("Entered  list items are as follows: ");
        do{
            System.out.print(ndprint.value + " " );
            ndprint = ndprint.next;
        }while(ndprint != head);

//        char[] charArr = new char[10];
//        int[] arr = new int[10];
//        arr[0] = 'a';
//        charArr[0] = 'r';
//
//        System.out.println(arr[0]);
//        System.out.print(charArr[0]);
    }
}
