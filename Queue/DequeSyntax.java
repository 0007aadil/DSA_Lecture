package Queue;

import java.util.LinkedList;
import java.util.Deque;

public class DequeSyntax {
    


   public static void main(String[] args) {
    Deque<Integer> dec = new LinkedList<>();


    dec.addLast(1);
    dec.addLast(2);
    dec.addLast(3);
    dec.addLast(4);

    System.out.println(dec);

    dec.removeFirst();
    System.out.println(dec);
    dec.removeLast();
    System.out.println(dec );
   }
}
