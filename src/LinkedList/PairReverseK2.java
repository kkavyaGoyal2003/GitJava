package LinkedList;
/*
1-> 2-> 3-> 4-> 5-> 6-> 7-> 8-> END
3-> 2-> 1-> 6-> 5-> 4-> 7-> 8-> END
 */

class Node5 {
    int data;
    Node5 next;

    Node5(int value) {
        data = value;
        next = null;
    }
}

class LL5 {
    Node5 head;
    Node5 tail;
    int size = 0;

    void end(int value) {
        Node5 node = new Node5(value);
        if(head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }
    Node5 reverse(int k) {
        if(head == null || head.next == null) {
            return head;
        }
        if(k == 1) {
            return head;
        }
        Node5 newHead = null;
        Node5 temp = head;
        Node5 nextnode = null;
        Node5 checkNode = temp;

        while(temp != null ) {
            Node5 tempHead = temp;
            Node5 first = null;
            Node5 second = null;
            int count = 0;

            Node5 extraNode = temp;
            int pairs = 0;
            while (extraNode != null && pairs < k) {
                extraNode = extraNode.next;
                pairs++;
            }

            if (pairs < k) {
                if (nextnode != null) {
                    nextnode.next = tempHead;
                }
                break;
            }


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
        Node5 temp = head;
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
public class PairReverseK2 {
    public static void main(String[] args) {
        LL5 list = new LL5();
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
