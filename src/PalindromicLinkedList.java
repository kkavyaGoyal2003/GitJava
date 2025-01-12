import java.util.*;

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        next = null;
    }
}

class LL  {
    int size = 0;
    Node head;
    Node temp = head;
    Node insertEnd(int value) {

        Node node =  new Node(value);
        if(size == 0) {
            head = node;
            temp = node;
        } else {
            temp.next = node;
            temp = node;
        }
        size++;
        return head;
    }
    Node middleNode() {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    Node reverse(Node slow) {
        Node prev = null;
        Node temp = slow;
        while(temp != null) {
            Node node = temp.next;
            temp.next = prev;
            prev = temp;
            temp = node;
        }
        return prev;
    }
    boolean IsPlaindromic() {
        Node mid = middleNode();
        Node temp = reverse(mid);

        while(temp != null) {
            if(head.value != temp.value) {
                return false;
            }
            head = head.next;
            temp = temp.next;
        }

        return true;
    }
    void display() {
        Node temp  = head;
        while(temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
public class PalindromicLinkedList {
    public static void main(String[] args) {
        LL list = new LL();
        Node head = list.insertEnd(1);
        list.insertEnd(2);
        list.insertEnd(3);
        list.insertEnd(3);
        list.insertEnd(2);
        list.insertEnd(1);
        list.display();
        Node slow = list.middleNode();
//        System.out.println(slow.value);
//        list.display();
        System.out.println(list.IsPlaindromic());
    }
}

