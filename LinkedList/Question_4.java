package LinkedList;

public class Question_4 {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    void segregateEvenOdd() {
        if (head == null || head.next == null) {
            return;  // No need to process if list is empty or has only one element
        }

        Node evenStart = null, evenEnd = null;
        Node oddStart = null, oddEnd = null;
        Node curr = head;

        while (curr != null) {
            int val = curr.data;

            if (val % 2 == 0) {  // If even
                if (evenStart == null) {
                    evenStart = evenEnd = curr;
                } else {
                    evenEnd.next = curr;
                    evenEnd = evenEnd.next;
                }
            } else {  // If odd
                if (oddStart == null) {
                    oddStart = oddEnd = curr;
                } else {
                    oddEnd.next = curr;
                    oddEnd = oddEnd.next;
                }
            }
            curr = curr.next;
        }

        // If no even numbers, return odd list as is
        if (evenStart == null) {
            head = oddStart;
            return;
        }

        // Combine even and odd lists
        evenEnd.next = oddStart;
        if (oddStart != null) {
            oddEnd.next = null;
        }

        // Set head to even start
        head = evenStart;
    }

    void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Question_4 list = new Question_4();

        list.push(11);
        list.push(10);
        list.push(8);
        list.push(6);
        list.push(4);
        list.push(2);
        list.push(0);
        list.push(1);
        list.push(31);

        System.out.println("Original Linked List:");
        list.printList();

        list.segregateEvenOdd();

        System.out.println("Updated Linked List:");
        list.printList();
    }
}
