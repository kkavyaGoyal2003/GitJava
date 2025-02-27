package LinkedList;

class Node3 {
    int value;
    Node3 next;

    Node3(int value) {
        this.value = value;
        next = null;
    }
}
class SinglyLL {
    Node3 head;
    Node3 temp;
    int size;

    void insetFirst(int value) {
        Node3 node = new Node3(value);
        if(size == 0) {
            head = node;
            temp = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }
    void insertLast(int value) {
        Node3 node = new Node3(value);
        if(size == 0) {
            head = node;
            temp = node;
        }  else {
            temp.next = node;
            temp = node;
        }
        size++;
    }
    void insertAtposition(int value, int index) {
        if(index == 0) {
            insetFirst(value);
        } else {
            Node3 node = new Node3(value);
            Node3 nodepos = head;
            int count = 1;
            while(count < index) {
                nodepos = nodepos.next;
                count++;
            }
            node.next = nodepos.next;
            nodepos.next = node;
        }
        size++;
    }
    int  deleteFirst() {
        int val = -1;
        if(head == null) {
            return val;
        }
        val = head.value;
        head = head.next;
        if(head == null) {
            temp = null;
        }
        size--;
        return val;
    }
    int deleteLast() {
        int val = -1;
        if (head == null) {
            return val;
        }
        if (head.next == null) {
            val = head.value;
            head = null;
            temp = null;
        } else {
            Node3 node = head;
            while (node.next != null && node.next.next != null) {
                node = node.next;
            }
            val = node.next.value;
            node.next = null;
            temp = node;
        }

        size--;  // Decrease the size of the list
        return val;
    }
    int deleteAtPosition(int index) {
        int val = -1;
        if(index == 0) {
            return deleteFirst();
        } else {
            Node3 nodepos = head;
            int count = 1;
            while(count < index) {
                nodepos = nodepos.next;
                count++;
            }
            val = nodepos.next.value;
            nodepos.next = nodepos.next.next;
        }
        size--;
        return val;
    }
    boolean searchValue(int val){
        Node3 nodepos = head;
        while(nodepos != null) {
            if(nodepos.value == val) return true;
            nodepos = nodepos.next;
        }
        return false;
    }
    void display () {
        Node3 node = head;
        while(node != null) {
            System.out.print(node.value + "->");
            node = node.next;
        }
        System.out.println("END");
    }
}
public class SinglyLinkedList {
    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();
        list.insetFirst(10);
        list.insertLast(12);
        list.insertLast(14);
        list.insertLast(16);
        list.display();
        list.insertAtposition(15,2);
        list.insertAtposition(9,0);
        list.insertAtposition(11,1);
        list.display();
        System.out.println(list.deleteFirst());
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.deleteAtPosition(2));
        list.display();
        System.out.println("Is Element present: " + list.searchValue(15));
    }
}
