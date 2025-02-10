package LinkedList;

public class Question_3 {
    
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void swapNodes(int x, int y) {
        if (x == y) return;  // If both values are the same, no need to swap.

        // Find x and its previous node
        Node prevX = null, currX = head;
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        // Find y and its previous node
        Node prevY = null, currY = head;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        // If either x or y is not present, return
        if (currX == null || currY == null) {
            return;
        }

        // Swap previous node pointers
        if (prevX != null) {
            prevX.next = currY;
        } else {
            head = currY;
        }

        if (prevY != null) {
            prevY.next = currX;
        } else {
            head = currX;
        }

        // Swap next pointers
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

    public void push(int new_data) {
        Node new_Node = new Node(new_data);
        new_Node.next = head;
        head = new_Node;
    }

    public void printList() {
        Node tNode = head;
        while (tNode != null) {
            System.out.print(tNode.data + " ");
            tNode = tNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Question_3 list = new Question_3();

        list.push(7);
        list.push(6);
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);

        System.out.println("Linked list before swap:");
        list.printList();

        list.swapNodes(4, 1);

        System.out.println("Linked list after swap:");
        list.printList();
    }
}


// pseudo code 

/*
 FUNCTION swapNodes(head, x, y):
    IF x == y:
        RETURN   // No need to swap if both values are the same

    // Step 1: Find the node with value x and its previous node
    SET prevX = NULL, currX = head
    WHILE currX != NULL AND currX.data != x:
        prevX = currX
        currX = currX.next

    // Step 2: Find the node with value y and its previous node
    SET prevY = NULL, currY = head
    WHILE currY != NULL AND currY.data != y:
        prevY = currY
        currY = currY.next

    // Step 3: If either x or y is not found, return
    IF currX == NULL OR currY == NULL:
        RETURN

    // Step 4: Update previous nodes' next pointers
    IF prevX != NULL:
        prevX.next = currY
    ELSE:
        head = currY   // If x was the head, update head to y

    IF prevY != NULL:
        prevY.next = currX
    ELSE:
        head = currX   // If y was the head, update head to x

    // Step 5: Swap next pointers of currX and currY
    SET temp = currX.next
    currX.next = currY.next
    currY.next = temp

 */