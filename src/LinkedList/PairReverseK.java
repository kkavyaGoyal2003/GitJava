/*
1-> 2-> 3-> 4-> 5-> 6-> 7-> 8-> END
3-> 2-> 1-> 6-> 5-> 4-> 8-> 7-> END
 */
package LinkedList;

class Node4 {
    int data;
    Node4 next;

    Node4(int value) {
        data = value;
        next = null;
    }
}

class LL4 {
    Node4 head;
    Node4 tail;
    int size = 0;

    void end(int value) {
        Node4 node = new Node4(value);
        if(head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }
    Node4 reverse(int k) {
        if(head == null || head.next == null) {
            return head;
        }
        if(k == 1) {
            return head;
        }
        Node4 newHead = null;
        Node4 temp = head;
        Node4 nextnode = null;

        while(temp != null ) {
            Node4 tempHead = temp;
            Node4 first = null;
            Node4 second = null;
            int count = 0;
            while(count < k && temp != null){
                second = temp.next;
                temp.next = first;
                first = temp;
                temp = second;
                count++;
            }
            if(newHead == null) {
                newHead = first;
            }
            if(nextnode != null) {
                nextnode.next = first;
            }
            nextnode = tempHead;
            tempHead.next = temp;
        }
        head = newHead;
        return head;
    }

    void display() {
        Node4 temp = head;
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
public class PairReverseK {
    public static void main(String[] args) {
        LL4 list = new LL4();
        list.end(1);
        list.end(2);
        list.end(3);
        list.end(4);
        list.end(5);
        list.end(6);
        list.end(7);
        list.end(8);
        list.display();
        list.reverse(3);
        list.display();
    }
}
