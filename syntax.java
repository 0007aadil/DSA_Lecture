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

    // Methods to add data in linked list 

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


    public static void main(String[] args) {

        syntax ll = new syntax();  // creating Object of the Syntex 

        ll.addFirst(1);
        ll.addFirst(2);

        

        
    }

}
