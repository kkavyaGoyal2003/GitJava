package StackAndQueues;

import java.util.*;
public class QueueUsingArrays {
    static class Queue {
        int n = 10;
        int top = -1;
        int [] arr = new int [n];

        void add(int val) {
            if(top == -1) {
                arr[0] = val;
                top++;
            }
            if(top == n){
                System.out.println("Queue is full");
            } else {
                arr[top] = val;
                top++;
            }
        }
        int delete(){
            int val = -1;
            if(top == 0 || top == -1) {
                System.out.println("No element to remove");
            } else {
                val = arr[0];
                for(int i = 0; i < top; i++) {
                    arr[i] = arr[i+1];
                }
                top--;
            }
            return val;
        }
        void display() {
            System.out.println(Arrays.toString(arr));
        }

    }
    public static void main(String[] args) {
        Queue q1 = new Queue();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.display();
        System.out.println(q1.delete());
        System.out.println(q1.delete());
        q1.display();
        System.out.println(q1.delete());
        System.out.println(q1.delete());
        q1.display();
        System.out.println(q1.delete());

    }
}
