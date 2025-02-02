public class CheckCycleInLinkidListOrNot {

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
    


    public static void main(String[] args) {
        
        

        head = new Node(1);
        head.next= new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head;

        System.out.println(isCycle());







    }
}
