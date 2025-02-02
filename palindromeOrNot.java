import java.lang.classfile.components.ClassPrinter.Node;

public class palindromeOrNot {
    


    public static class Node {

        int data;
        Node next;

        public Node(int data){
            this.data= data;
            this.next= null;
        }
    
        
    }
    
    public static Node head;  // Initialization of Head 
    public static Node tail;  // Initialization of Tail 
    public static int size; // Initilization of Size

    // Methods to add data in front in a  linked list 

    public void addFirst(int data){
        // Step 1 = create new node 
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2 - newNode Next = head 

        newNode.next= head; // link 

        // Step 3 - head = newNode
        head = newNode;
         
    }


    // Methods to add  data in last in a linked list 

    public void addLast ( int data ) {
        Node newNode = new Node(data);
        size++;

        if (head == null ) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Method to print the data of Linked list 

    public void print() {

        if (head == null) {
            System.out.println(" LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }

        System.out.println("null");
    }



    // Methods to find mid (slow_fast approach)
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }

        return slow ; // slow is my midNode 
    }



    //Method to check the palindrome 

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;    
        }

        // step-1 - find mid 
        Node miNode = findMid(head);

        // step-2 - reverse 2nd half 
        Node prev = null;
        Node curr = miNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next= prev;
            prev= curr;
            curr = next;
        }


        Node right = prev; // right half head 
        Node left = head;

        // step-3 - check left half & right half 
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }

            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static void main(String[] args) {

        palindromeOrNot ll = new palindromeOrNot();

        ll.addLast(1);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(1);

        ll.print(); // 1->2->2->1
        System.out.println(ll.checkPalindrome());


    }
}
