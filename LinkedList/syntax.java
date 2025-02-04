package LinkedList;
public class syntax {

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

    // Methods to add data in front in a  linked list 

    public void addFirst(int data){
        // Step 1 = create new node 
        Node newNode = new Node(data);

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


    public static void main(String[] args) {

        syntax ll = new syntax();  // creating Object of the Syntex 

        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();

        

        

        
    }

}
