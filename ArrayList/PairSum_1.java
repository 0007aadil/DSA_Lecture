package ArrayList;
// import java.util.ArrayList;
     

    




// public class PairSum_1 {

//      // Brute force 
//      public static boolean PairSum( ArrayList<Integer> list, int target){

//         for(int i =0; i <list.size(); i++){

//             for(int j = 0 ; j< list.size()-1; j++){
//                 if(list.get(i) + list.get(j) == target) {
//                     return true;
//                 }
//             }

//         }

//         return false;



//     }




//      public static void main(String[] args) {
        
//         ArrayList<Integer> list = new ArrayList<>();

//         // 1,2,3,4,5,6

//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         list.add(6);
//         list.add(7);

//         int target = 12;

//         System.out.println(PairSum(list, target));



//     }
// }



// Linear solution 

// Two pointer approach 


import java.util.ArrayList;
     

    




public class PairSum_1 {

     
     public static boolean PairSum( ArrayList<Integer> list, int target){

        int lp = 0 ;
         int rp = list.size() -1 ;


         while (lp != rp) {

            // Case 1 

            if (list.get(lp) + list.get(rp) == target){
                return true;
            }

            if( list.get(lp) + list.get(rp) < target ){
                lp++;
            }else{
                rp--;
            }

            
         }

         return false;

       



    }




     public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        // 1,2,3,4,5,6

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        int target = 120;

        System.out.println(PairSum(list, target));



    }
}