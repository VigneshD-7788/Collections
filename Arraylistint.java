package Collections;
import java.util.ArrayList;
import java.util.List;
public class Arraylistint {
    public static void main(String[] args) {

        //Add 5 integers to an ArrayList.
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        // Get sub list from 1 to 3.
        List<Integer> sub = list.subList(1, 3);

        // Display sub list.
        for (int value : sub) {
            System.out.println(value);
        }

        // Set the first element in "sub" to -1.
        // This is reflected in the original ArrayList.
        sub.set(0, -1);
        System.out.println(list.get(1));
    }
}
