package StackAndQueues;

class Queue {
    int size = 6;
    int currSize = 0;
    int start = -1;
    int end = -1;
    int[] queue = new int[size];

    void push(int value) {
        if(start == -1 && end == -1) {
            start++;
            end++;
            queue[end] = value;
        } else if(currSize == size) {
            System.out.println("Queue does not have space");
        } else {
            end++;
            if(end == size){
                end = (end) % size;
            }
            queue[end] = value;
        }
        currSize++;
    }
    int pop() {
        int value = -1;
        if(currSize == 0) {
            System.out.println("Queue is emppty");
        }
        if(currSize == 1) {
            start = end = -1;
        } else if(start == size - 1) {
            value = queue[start];
            start = (start + 1)  % size;
        } else {
            value = queue[start];
            start++;
        }
        currSize--;
        return value;
    }
    int size() {
        return currSize;
    }
    int peek() {
        return queue[start];
    }
    void display() {
        for(int i = start ; i <= end; i++) {
            System.out.print(queue[i] + " ");
        }
    }
}
public class QueueUsingArray {
    public static void main(String[] args) {
        Queue q= new Queue();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.display();
        System.out.println();
        System.out.println("Elemenet at front =>" + q.peek());
        System.out.println("popped element =>"+ q.pop());
        q.display();
        System.out.println("\nQueue Size:" + q.size());
    }
}
