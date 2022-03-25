package Stacks;

import java.util.Scanner;

public class stackImpl {

    static class Stack{
        public int stack_size = 1;
        int[] arr;
        int top = -1;
        Stack(int size){
            this.stack_size = size;
            this.arr = new int[this.stack_size];
        }
        //push
        public void push(int value){
            if(this.top < this.stack_size ) {
                this.arr[++this.top] = value;
            }else {
                System.out.println("Stack overflow");
            }

        }
        //pop
        public int pop(){
           if(this.isEmpty()){
               System.out.println("Stack is empty");
               return -1;
           }else {
               int value = this.arr[this.top];
               this.top--;
               return value;
           }

        }

        //isEmpty
        public boolean isEmpty(){
           if(this.top == -1) {

               return true;
           } else {
               return false;
           }


        }
        public void print(){
           if(this.top == -1){
               System.out.println("Stack is empty");
           } else {
               for (int i = this.top;i>=0;i-- ) {
                    System.out.println(this.arr[i]+" ");
               }
           }
        }


    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the stack size: ");
        int stack_size = sc.nextInt();
        Stack myStack = new Stack(stack_size);

        System.out.println("Operate the stack:");
        String input = sc.next();
        while(input.charAt(0) != 'e'){

                String ipValues = input;
                switch(ipValues){
                    case "push": myStack.push(Integer.parseInt(sc.next()));
                            break;
                    case "pop": {
                        int value = myStack.pop();
                        if(value > -1) System.out.println("Popped the value from the stack : "+ value );;
                    }
                    case "print":{
                        myStack.print();
                    }
                }
//                if(ipValues.equals("push")){
//
//                } else if(ipValues.equals("pop")){
//
//                } else if(ipValues.equals("print")){
//
//                }
                input = sc.next();


        }

       // push 10
         //   pop
           //         push 20

    }

}
