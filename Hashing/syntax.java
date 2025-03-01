package Hashing;

import java.util.HashMap;

public class syntax {
    




    public static void main(String[] args) {
        //create 
        HashMap<String,Integer> hm = new HashMap<>();

        //Insert
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("SriLanka", 112);
       
        // Get 
        int Population = hm.get("India");

        //ConstainsKey
        System.out.println(hm.containsKey("India"));     // true 
        System.out.println( hm.containsKey("Japan")); // False

        //Remove 
        System.out.println(hm.remove("China"));
        System.out.println(hm.remove("Hola"));
        System.out.println(hm);

        //Size 

        System.out.println(hm.size());

        //Is Empty 
        System.out.println(hm.isEmpty());

        //clear
        hm.clear();
        System.out.println(hm.isEmpty());


    }
}
