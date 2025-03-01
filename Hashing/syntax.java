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


        int Population = hm.get("India");
        

        System.out.println( Population);


    }
}
