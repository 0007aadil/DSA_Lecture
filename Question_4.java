import java.util.ArrayList;

public class Question_4 {

    public static ArrayList<Integer> beautifulArray(int n) {
        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();
        
        // Add odd numbers
        for (int i = 1; i <= n; i += 2) {
            oddList.add(i);
        }
        
        // Add even numbers
        for (int i = 2; i <= n; i += 2) {
            evenList.add(i);
        }

        // Combine the odd and even lists to form the beautiful array
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(oddList);
        result.addAll(evenList);
        
        return result;
    }

    public static void main(String[] args) {
        // Test case
        System.out.println(beautifulArray(5)); // Sample output: [1, 3, 5, 7, 9, 2, 4, 6, 8]
    }
}
