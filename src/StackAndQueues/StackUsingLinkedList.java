package StackAndQueues;

import LinkedList.LL1;
import LinkedList.Node3;

class Node {
    int data;
    Node3 next;

    Node(int value) {
        data = value;
        next = null;
    }
}

class LL {
    Node3 head;
    int size = 0;

    void push(int value) {
        Node3 node = new Node3(value);
        if(head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    int pop(){
        int value = -1;
        Node3 temp = head;
        if(head == null) {
            System.out.println("Nothing left to pop!!");
            return value;
        } else {
            value = head.data;
            head = head.next;
            temp = null;
        }
        size--;
        return value;
    }

    int peek() {
        int value = -1;
        if(head == null) {
            System.out.println("Empty Stack!!");
        } else {
            value = head.data;
        }
        return value;
    }
    int size() {
        if(head == null) {
            System.out.println("Stack is Empty!!");
        }
        return size;
    }
    void display() {
        Node3 temp = head;
        if(temp == null) {
            System.out.println("Stack Empty!!");
        } else {
            while(temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}
public class StackUsingLinkedList {
    public static void main(String[] args) {
        LL1 stack = new LL1();
        stack.display();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.display();
        System.out.println("Top Element->" + stack.peek());
        System.out.println("Stack size->" + stack.size());
        System.out.println("Popped Element->" + stack.pop());
        stack.display();

    }
}
