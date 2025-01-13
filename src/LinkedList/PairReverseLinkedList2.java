package LinkedList;

class Node3 {
    int data;
    Node3 next;

    Node3(int value) {
        data = value;
        next = null;
    }
}

class LL2 {
    Node3 head;
    Node3 tail;
    int size = 0;

    void end(int value) {
        Node3 node = new Node3(value);
        if(head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }
    Node3 reverse() {
        if(head == null || head.next == null) {
            return head;
        }
        Node3 prev = null;
        Node3 temp = head;
        head = temp.next;

        while(temp != null && temp.next != null) {
            Node3 first = temp;
            Node3 second = first.next;

            first.next = second.next;
            second.next = first;
            temp = first.next;
            if(prev != null) {
                prev.next = second;
            }
            prev = first;

        }

        return head;
    }

    void display() {
        Node3 temp = head;
        if(temp == null) {
            System.out.println("Empty list");
        } else {
            while(temp != null) {
                System.out.print(temp.data + "-> ");
                temp = temp.next;
            }
            System.out.println("END");
        }
    }
}
public class PairReverseLinkedList2 {
    public static void main(String[] args) {
        LL2 list = new LL2();
        list.end(1);
        list.end(2);
        list.end(3);
        list.end(4);
        list.end(5);
        list.end(6);
        list.display();
        list.reverse();
        list.display();


    }
}
