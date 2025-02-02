public class findAndDelete {


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

        // Method to add in middle 


        public void add(int idx, int data ){

            if (idx ==0) {
                addFirst(data);
                return;
            }
    
    
            Node newNode = new Node(data);
            size++;
    
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


        //  ---- Methods to find and delete Nth from the End ----

        public void deleteNthFromEnd(int n ){
            // calculate size of LL

            int sz = 0;
            Node temp = head;
            while (temp != null) {
                temp = temp.next;
                sz++;
            }

            if (n == sz) {
                head = head.next; // removeFirst 
                return;
            }

            // sz-n
            int i =1 ;
            int iToFind = sz-n;
            Node prev = head;
            while (i < iToFind) {
                prev = prev.next;
                i++;
            }

            prev.next = prev.next.next;
            return;

        }
    

    public static void main(String[] args) {
        findAndDelete ll = new findAndDelete();

        ll.addFirst(2);
        
        ll.addFirst(1);
        
        ll.addLast(4);
        
        ll.addLast(5);
        
        ll.add(2, 3);
        
        ll.print();

        System.out.println(ll.size);    

        ll.deleteNthFromEnd(3);
        ll.print();
    }
}
