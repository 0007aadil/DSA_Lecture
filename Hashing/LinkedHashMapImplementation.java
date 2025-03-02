package Hashing;

import java.util.LinkedHashMap;

public class LinkedHashMapImplementation {
    

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("Us", 122);
        lhm.put("Bhutan", 21);

        System.out.println(lhm);
        
    }
}
