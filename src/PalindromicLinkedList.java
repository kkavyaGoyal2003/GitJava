class Node2 {
    int value;
    Node1 next;

    Node2(int value) {
        this.value = value;
        next = null;
    }
}

class LL  {
    int size = 0;
    Node1 head;
    Node1 temp = head;
    Node1 insertEnd(int value) {

        Node1 node =  new Node1(value);
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
    Node1 middleNode() {
        Node1 slow = head;
        Node1 fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    Node1 reverse(Node1 slow) {
        Node1 prev = null;
        Node1 temp = slow;
        while(temp != null) {
            Node1 node = temp.next;
            temp.next = prev;
            prev = temp;
            temp = node;
        }
        return prev;
    }
    boolean IsPlaindromic() {
        Node1 mid = middleNode();
        Node1 temp = reverse(mid);

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
        Node1 temp  = head;
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
        Node1 head = list.insertEnd(1);
        list.insertEnd(2);
        list.insertEnd(3);
        list.insertEnd(3);
        list.insertEnd(2);
        list.insertEnd(1);
        list.display();
        Node1 slow = list.middleNode();
//        System.out.println(slow.value);
//        list.display();
        System.out.println(list.IsPlaindromic());
    }
}

