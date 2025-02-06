package LinkedList;
public class Question_1 {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    // Add method
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Print method
    public void print() {
        if (head == null) {
            System.out.println("LL is empty!!");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Question_1 list_1 = new Question_1();
        list_1.add(7);
        list_1.add(6);
        list_1.add(5);
        list_1.add(4);
        list_1.add(3);
        list_1.add(2);
        list_1.add(1);

        Question_1 list_2 = new Question_1();
        list_2.add(7);
        list_2.add(6);
        list_2.add(5);
        list_2.add(4);

       


        // Print both linked lists
        System.out.println("List 1: ");
        list_1.print();
        System.out.println("List 2: ");
        list_2.print();
    }
}
