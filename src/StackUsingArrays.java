package January2025;
import java.util.*;

public class StackUsingArrays {
    static class stack {
        int n = 10;
        int [] arr = new int[n];
        int top = -1;

        void push(int value) {
            if(top == n) {
                System.out.println("Stack if full");
            } else {
                top++;
                arr[top] = value;
            }
        }
        int pop() {
            int val = arr[top];
            if(top == -1) {
                System.out.println("stack is empty");
            } else {
                arr[top] = 0;
                top--;
            }
            return val;
        }
        int top() {
            if(top == -1) {
                System.out.println("No elements present");
            } else if(top == n) {
                return arr[top-1];
            } else {
                return  arr[top];
            }
            return 0;
        }
        int size () {
            if(top == -1) return 0;
            if(top == n) return n;
            return top + 1;
        }
        void display() {
            System.out.println(Arrays.toString(arr));
        }
    }
    public static void main(String[] args) {
        stack stk = new stack();
        stk.push(5);
        stk.push(4);
        stk.push(3);
        stk.push(2);
        stk.push(1);
        stk.display();
        System.out.println(stk.pop());
        stk.display();
        System.out.println(stk.size());
        System.out.println("top element = >" + stk.top());
    }
}
