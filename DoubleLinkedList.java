public class DoubleLinkedList {

    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Add first method
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;  // Important to prevent further execution
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Remove first method
    public int removeFirst() {
        if (head == null) {
            System.out.println("Doubly Linked List is Empty");
            return Integer.MIN_VALUE;
        }

        int val = head.data;
        if (size == 1) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return val;
    }

    // Print method
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoubleLinkedList ll = new DoubleLinkedList();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        ll.print();  // Expected output: 5 <-> 4 <-> 3 <-> 2 <-> 1 <-> null

        ll.removeFirst();
        ll.print();  // Expected output: 4 <-> 3 <-> 2 <-> 1 <-> null
    }
}
