package ArrayList;
import java.util.ArrayList;

public class MaxInArrayList {
    
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(122);
        list.add(473);
        list.add(33);
        list.add(47);
        list.add(50);

        int max = Integer.MIN_VALUE;   // this is the (-∞ ) minus Infinity 

        for(int i = 0 ; i < list.size(); i++) {
            if(max < list.get(i)){
                max = list.get(i);

                // max= Math.max(max,list.get(i));
            }

            
        }
        System.out.println("max element = " + max); 

        



    }
}
