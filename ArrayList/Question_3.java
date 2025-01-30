package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class Question_3 {

    public static int mostNumTimes(ArrayList<Integer> list, int key) {
        ArrayList<Integer> newList = new ArrayList<>();

        // Step 1: Collect numbers that appear after the key
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == key) {
                newList.add(list.get(i + 1)); // Store the next number after key
            }
        }

        if (newList.isEmpty()) {
            return -1; // If no number follows the key, return -1 (or any default value)
        }

        // Step 2: Sort the new list
        Collections.sort(newList);

        // Step 3: Find the most frequently occurring number in newList
        int maxCount = 1, count = 1;
        int mostFrequent = newList.get(0);

        for (int i = 1; i < newList.size(); i++) {
            if (newList.get(i) == newList.get(i - 1)) {
                count++; // Increase count if the same number repeats
            } else {
                count = 1; // Reset count for a new number
            }

            if (count > maxCount) {
                maxCount = count;
                mostFrequent = newList.get(i);
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 100, 200, 1, 100);

        int key = 1;

        System.out.println("Input List: " + list);
        System.out.println("Most Frequent Number After " + key + ": " + mostNumTimes(list, key));
    }
}
