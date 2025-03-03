package Hashing;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetImplementation {
    

    public static void main(String[] args) {
        
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mubai");
        cities.add("Banglore");
        cities.add("Pune");
        cities.add("Haryana");

        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>(); // ordered way (see answer to understand!!!)

        lhs.add("Delhi");
        lhs.add("Mubai");
        lhs.add("Banglore");
        lhs.add("Pune");
        lhs.add("Haryana");

        System.out.println(lhs);

        
    }
}
