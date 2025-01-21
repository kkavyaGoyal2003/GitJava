package LinkedList;
import java.util.*;
class NodeQ {
    int value;
    NodeQ next;

    NodeQ(int value) {
        this.value = value;
        next = null;
    }
}

class Que{
    NodeQ front = null;
    NodeQ rear = null;
    int size = 0;

    void push(int value) {
        NodeQ node = new NodeQ(value);
        if(front == null) {
            front = node;
            rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
        size++;
    }
    int pop() {
        int value = -1;
        if(front == null) {
            rear = null;
            System.out.println("Queue is empty");
        } else {
            value = front.value;
            NodeQ temp = front;
            front = front.next;
            temp = null;
        }
        size--;
        return value;
    }
    int peek() {
        return front.value;
    }
    int size() {
        return size;
    }
    void display() {
        if(front == null) {
            System.out.println("Queue Empty");
        } else {
            NodeQ temp = front;
            while(temp != null) {
                System.out.print(temp.value + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        Que q = new Que();
        q.display();
        q.push(2);
        q.push(3);
        q.push(5);
        q.push(6);
        q.display();
        System.out.println("popped element =>" + q.pop());
        q.display();
        System.out.println("Front Element =>" + q.peek());
        System.out.println("Size of queue =>" + q.size());

    }
}
