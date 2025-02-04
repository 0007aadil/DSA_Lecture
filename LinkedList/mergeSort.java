package LinkedList;



public class mergeSort {



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

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2 - newNode Next = head 

        newNode.next= head; // link 

        // Step 3 - head = newNode
        head = newNode;
         
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







    // mid methods 
    private Node getMid(Node head ){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next ;

        }

        return slow; // mid node 
    }

    // merge method 

    private Node merge(Node head1 , Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null ) {
             if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
             } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
             }
        }


        while (head1 != null) {
            temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            
        }

        while (head2 != null) {
            temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            
        }

        return mergedLL.next;
        

       
    }


    public Node mergeSrt(Node head ){

        if(head == null || head.next == null){
            return head;
        }

        // find mid 
        Node mid = getMid(head);


        // left & right MS

        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSrt(head);
        Node newRight = mergeSrt(rightHead);


        //merge 

        return merge(newLeft, newRight);
    }
    

    public static void main(String[] args) {

        mergeSort ll = new mergeSort();

        ll.addFirst(111);
        ll.addFirst(2);
        ll.addFirst(32);
        ll.addFirst(49);
        ll.addFirst(5);
        ll.addFirst(7);
        

        //5->4->3->2->1

        ll.print();

        ll.head = ll.mergeSrt(ll.head);
        ll.print();

        


        
    }
}
