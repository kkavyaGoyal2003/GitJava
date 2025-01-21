package LinkedList;
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
import  java.util.Iterator;
class Stack {
    Queue<Integer> queue = new LinkedList<>();
    void push(int value) {
        int size = queue.size();
        queue.add(value);

        for(int i = 0; i < size; i++) {
            queue.add(queue.poll());
        }
    }
    int pop() {
        if(queue.isEmpty()) {
            System.out.println("Stack is empty!!");
        }
        return queue.poll();
    }
    int peek() {
        return queue.peek();
    }
    int size() {
        return queue.size();
    }
    void display() {
        for (int num : queue) {
            System.out.println(num);
        }
    }
}
public class StackUsingQueue {
    public static void main(String[] args) {
        Stack stk = new Stack();
        stk.push(2);
        stk.push(4);
        stk.push(6);
        stk.display();
    }
}
