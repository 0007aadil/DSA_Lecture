package LinkedList;
public class iterativeSearch {



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


    // Methods to remove first 

    public int removeFirst() {
        if (size==0) {
            System.out.println(" LL is empty");
            return Integer.MIN_VALUE;

        }else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }


        int val = head.data;
        head = head.next;
        size--;
        return val ;
    }


    // Method to remove from last 

    public int removeLast() {
        if (size== 0) {
            System.out.println(" LL is empty");
            return Integer.MIN_VALUE;
        }else if (size ==1 ) {
            int val = head.data;
            head = tail= null;
            size = 0;
            return val;
        }

        // prev: i = size-2
        Node prev = head;
        for(int i =0 ; i < size-2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }


    // Method for iterative search 

    public int iterativeSrch(int key){   // time complexity is O(n) 
        Node temp = head;
        int i =0;

         while (temp != null) {
            if (temp.data == key ) { // key found 
                return i;
                
            }
            temp = temp.next;
            i++;
         }

         // key not found 
         return -1;
    }






    public static void main(String[] args) {

        iterativeSearch ll = new iterativeSearch();

        ll.addFirst(2);
        
        ll.addFirst(1);
        
        ll.addLast(4);
        
        ll.addLast(5);
        
        ll.add(2, 3);
        
        ll.print();

        System.out.println(ll.size);

        System.out.println(ll.iterativeSrch(3));
        System.out.println(ll.iterativeSrch(10));


        
    }
}
