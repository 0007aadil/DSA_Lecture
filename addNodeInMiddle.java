public class addNodeInMiddle {

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





    public void add(int idx, int data ){

        if (idx ==0) {
            addFirst(data);
            return;
        }


        Node newNode = new Node(data);

        Node temp = head;
        int i=0;

        while (i < idx-1) {
            temp = temp.next;
            i++;
        }

        // i = idx -1 ; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;

    }



    public static void main(String[] args) {

        addNodeInMiddle ll = new addNodeInMiddle();

        
        
        ll.addFirst(2);
        
        ll.addFirst(1);
        
        ll.addLast(3);
        
        ll.addLast(4);
        
        ll.add(2, 9);
        
        ll.print();
        


        

    }
}
