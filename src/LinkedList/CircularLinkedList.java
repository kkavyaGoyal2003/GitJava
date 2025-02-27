package LinkedList;

class Nodes {
    int data;
    Nodes next;

    Nodes(int data) {
        this.data = data;
        next = null;
    }
}
class CircularLL {
    Nodes head = null;
    Nodes tail = null;

    void insertFirst(int value) {
        Nodes node = new Nodes(value);
        if(head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.next = node;
            head = node;
        }
    }
    void inserEnd(int value) {
        Nodes node = new Nodes(value);

        if(head == null){
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.next = head;
            tail = node;
        }
    }
    void insertAtIndex(int index) {
        Nodes temp = head;

    }
    int dleteFirst(){
        int val = -1;

        return val;
    }
    void display() {
        Nodes temp = head;

        while(temp != null) {
            System.out.print(temp.data + " => ");
            temp = temp.next;
            if(temp == head) break;
        }
        System.out.println(head.data);
    }

}

public class CircularLinkedList {
    public static void main(String[] args) {
        CircularLL list = new CircularLL();
        list.insertFirst(2);
        list.inserEnd(3);
        list.inserEnd(4);
        list.inserEnd(5);
        list.display();
    }
}
