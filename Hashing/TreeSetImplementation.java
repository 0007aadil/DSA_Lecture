package Hashing;

import java.util.TreeSet;

public class TreeSetImplementation {
    

    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();  // sorted order -- ascending ordr 
        ts.add("Delhi");
        ts.add("Mubai");
        ts.add("Banglore");
        ts.add("Pune");
        ts.add("Haryana");
        ts.add("AnandNagaar");

        System.out.println(ts);
    }
}
