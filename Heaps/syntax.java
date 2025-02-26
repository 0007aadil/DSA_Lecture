package Heaps;


import java.util.PriorityQueue;

public class syntax {
    

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // this gives ---> 1-->3-->4-->7
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // this gives ---> 7 --> 4 --> 3 --> 1


        pq.add(3); // O(longn)
        pq.add(4);
        pq.add(1);
        pq.add(7);

        


        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + "-->");   // O(1)
            pq.remove();   //O(logn)
        }
    }
}
