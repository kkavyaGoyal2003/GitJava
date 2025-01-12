class Node1 {
    int value;
    Node1 next;
    Node1 prev;

    Node1(int value){
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}
class LinkedList{
     int size;
    Node1 head;
    Node1 tail;

    public void insertFirst(int value){
        Node1 node = new Node1(value);
        if(head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
         size++;
    }
    public void insert(int value){
        Node1 node = new Node1(value);
        if(head == null){
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }
    public int deleteFirst() {
        int val = -1;
        if(size == 0) {
            System.out.println("List is empty");
        } else {
            val = head.value;
            Node1 temp = head.next;
            temp.prev = null;
            head = temp;
            size--;
        }
        return val;
    }
    public void display(){
        Node1 temp = head;
        if(temp == null){
            System.out.println("List is Empty");
        } else {
            while(temp != null) {
                System.out.print(temp.value +"<=>");
                temp = temp.next;
            }
            System.out.println("END");
        }
    }
}
public class DoublyLinkedlist {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(20);
        list.insert(18);
        list.insert(16);
        list.insert(14);
        list.insertFirst(12);
        list.insertFirst(10);
        list.display();
        System.out.println("Item deleted:" + list.deleteFirst());
        list.display();
    }
}

