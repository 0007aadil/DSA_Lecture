import java.util.LinkedList;

public class linkedListInJavaFramework {
    

    public static void main(String[] args) {
        // create 
        LinkedList<Integer> ll = new LinkedList<>();

        // add 

        ll.add(2);
        ll.add(3);
        ll.addLast(4);
        ll.addFirst(1);
        System.out.println(ll);

        // remove

        ll.remove(0);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);

    }
}
