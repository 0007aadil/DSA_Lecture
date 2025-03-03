package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class IterationOnHashSet {
    

    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mubai");
        cities.add("Banglore");
        cities.add("Pune");
        cities.add("Haryana");



        // ---> First type 

        // Iterator it = cities.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        // ---> Second type

        for(String city:cities){
            System.out.println(city);
        }
    }
}
