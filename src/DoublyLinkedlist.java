class Node1 {
    int value;
    Node1 next;
    Node1 prev;
    Node1(int value) {
        this.value = value;
        next = null;
        prev = null;
    }
}
class DLL {
    int size = 0;
    Node1 head = null;
    Node1 tail = null;

    void insertstart(int val) {
        Node1 node = new Node1(val);
        if(head  == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }
    void insertEnd(int val) {
        Node1 node = new Node1(val);
        if(head  == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }
    void insertAtposition(int value, int index) {
        if(index == 0) {
            insertstart(value);
        } else {
            Node1 node = new Node1(value);
            Node1 temp = head;
            int count = 1;
            while(count < index) {
                temp = temp.next;
                count++;
            }
            node.next = temp.next;
            temp.next.prev = node;
            temp.next = node;
            node.prev = temp;
        }
        size++;
    }
    int deletestart() {
        int val = -1;
        if(head == null) {
            return val;
        } else {
            val = head.value;
            head.next.prev = null;
            head = head.next;
            size--;
        }
        return val;
    }
    int deleteEnd() {
        int val = -1;
        if(head == null) {
            return val;
        } else {
            val = tail.value;
            tail = tail.prev;
            tail.next = null;
            size--;
        }
        return val;
    }
    int deleteAtposition( int index) {
        int val = -1;
        if(index == 0) {
            val = head.value;
            head.next.prev = null;
            head = head.next;
            return  val;
        } else {
            Node1 temp = head;
            int count = 1;
            while(count < index) {
                temp = temp.next;
                count++;
            }
            val = temp.next.value;
            temp.next = temp.next.next;
            Node1 temp1 = temp.next;
            temp1.prev = temp1.prev.prev;
        }
        size--;
        return val;
    }
    boolean searchValue(int val) {
        Node1 temp = head;
        while(temp != null) {
            if(temp.value == val) return true;
            temp = temp.next;
        }
        return false;
    }
    void display() {
        if(head == null) {
            System.out.println("List is empty");
        } else {
            Node1 temp = head;
            while(temp != null) {
                System.out.print(temp.value + " <=> ");
                temp = temp.next;
            }
            System.out.println("END");
        }
    }
}
public class DoublyLinkedlist {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertEnd(1);
        list.insertEnd(2);
        list.insertEnd(3);
        list.insertEnd(4);
        list.insertEnd(5);
        list.insertstart(0);
        list.insertstart(-1);
        list.display();
        System.out.println("Deleted node=>" + list.deletestart());
        list.display();
        System.out.println("Deleted node=>" + list.deleteEnd());
        list.display();
        System.out.println("Is the Element present=>" + list.searchValue(3));
        list.insertAtposition(6,2);
        list.display();
        System.out.println("Item deleted=>" + list.deleteAtposition(2));
        list.display();
    }
}

