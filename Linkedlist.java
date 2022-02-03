package Collections;
import java.util.*;
public class Linkedlist {

    public static void main(String args[]) {

        LinkedList<String> list = new LinkedList<String>();

        //Adding elements to the Linked list
        list.add("Max");
        list.add("Ben");
        list.add("Gwen");

        //Adding an element to the first position
        list.addFirst("Omnitrix");

        //Adding an element to the last position
        list.addLast("Kevin");

        //Adding an element to the 3rd position
        list.add(2, "Heatblast");

        //Iterating LinkedList
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        list.remove(1);
        System.out.print("\nAfter removing second element: ");
        //Iterating LinkedList again
        Iterator<String> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next() + " ");
        }
    }
}
