package LinkedList;
class Node1 {
    int data;
    Node1 next;

    Node1(int value) {
        data = value;
        next = null;
    }
}

class LL1 {
    Node1 head;
    int size = 0;

    void push(int value) {
        Node1 node = new Node1(value);
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
        Node1 temp = head;
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
    // Node reverseNode() {

    // }
    void display() {
        Node1 temp = head;
        if(temp == null) {
            System.out.println("Stack Empty!!");
        } else {
            while(temp != null) {
                System.out.print(temp.data + "-> ");
                temp = temp.next;
            }
            System.out.println("END");
        }
    }
}
public class PairReverseLinkedList1 {
    public static void main(String[] args) {
        LL1 list = new LL1();
        list.push(6);
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
        list.display();
        int size = list.size();
        LL1 stk1 = new LL1();
        LL1 stk2 = new LL1();
        int num = 0;
        while(num < size) {
            if(num % 2 == 0) {
                stk2.push(list.pop());
            } else {
                stk1.push(list.pop());
            }
            num++;
        }
        while(num > 0) {
            if(num % 2 != 0){
                int value = stk1.pop();
                list.push(value);
            } else {
                int value = stk2.pop();
                list.push(value);
            }
            num--;
        }
        list.display();
    }
}
