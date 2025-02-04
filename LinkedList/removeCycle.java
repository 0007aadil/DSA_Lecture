package LinkedList;
public class removeCycle {


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



     // Methods for checking Linked List is cycle or not 

     public  static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1 
            fast = fast.next.next; // +2 
            if (slow == fast) {
                return true; // cycle exists 
            }
        }

        return false; // cycle doesn't exist 
    }


    // Methods to remove the cycle 

    public static void removeCyc() {
        //detect cycle 
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                cycle = true;
                break;
                
            }
        }

        if (cycle == false) {
            return; 
        }

        //find meeting point 

        slow = head;
        Node prev = null; // last node 
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
            
        }

        // remove cycle -> last.next = null
        prev.next = null;
    }
    


    public static void main(String[] args) {

        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = temp;

        //1->2->3->4->2

        System.out.println(isCycle());

        removeCyc();
        System.out.println(isCycle());
        
    }
}
