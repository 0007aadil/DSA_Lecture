import java.util.ArrayList;
import java.util.Collections;

public class Question_2 {

    public static ArrayList<Integer> lonelyNum(ArrayList<Integer> list) {
        if (list.size() == 1) {
            return new ArrayList<>(list); // If there's only one number, return it
        }

        Collections.sort(list); // Sort the list first

        ArrayList<Integer> newList = new ArrayList<>();

        // Check first element
        if (list.get(0) + 1 < list.get(1)) {
            newList.add(list.get(0));
        }

        // Check middle elements
        for (int i = 1; i < list.size() - 1; i++) {
            if (list.get(i - 1) + 1 < list.get(i) && list.get(i) + 1 < list.get(i + 1)) {
                newList.add(list.get(i));
            }
        }

        // Check last element
        if (list.get(list.size() - 2) + 1 < list.get(list.size() - 1)) {
            newList.add(list.get(list.size() - 1));
        }

        return newList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(5);
        list.add(8);
        list.add(9);
        list.add(13);
        list.add(7);
        list.add(1);
        list.add(14);

        System.out.println("Input List: " + list);
        System.out.println("Lonely Numbers: " + lonelyNum(list));
    }
}
