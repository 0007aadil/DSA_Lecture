import java.util.ArrayList;
import java.util.Collections;


public class SortingInArraylist {

    public static void main(String[] args) {
        

        ArrayList<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(9);
        list.add(3);
        list.add(11);
        list.add(5);

        System.out.println(" list before sorting : " + list );
        Collections.sort(list);  // This sorting is done in accending order 
        System.out.println(" list after sorting : " + list );

        Collections.sort(list, Collections.reverseOrder()); // This sorting is done in decending order --> this is done with the help of COMPARATORS - fnx logic 
        System.out.println(" list reverse sorting : " + list );
    }
    
}
