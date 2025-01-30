package ArrayList;
import java.util.ArrayList;



// ArrayList is a part of Java Collection Framework 
public class SyntaxOfArrayList{
    public static void main(String[] args) {
        // ClassName onjectName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();
        

    // operations on ArrayList 
     
    // Add Operation 
    list.add(1); // time complexity is O(1)
    list.add(2);
    list.add(3);
    list.add(4);

    //Another way of adding number 

    list.add(3,233);

    System.out.println(list);

    //Get Operations 

    int element = list.get(2);  // time complexity is O(1)
    System.out.println(element);


    //Delete operations 

    list.remove(2);   // time complexity is O(n) linear 
    System.out.println(list);

    // Set Operations ( It is usee to set element at index )

    list.set(0,110);    // time complexity is O(n) linear 
    System.out.println(list);



   // Contains Operations 

   System.out.println(list.contains(110));
   System.out.println(list.contains(201));


    



    }


    
}

