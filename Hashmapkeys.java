package Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmapkeys {

    public static void main(String args[]) {

        /* This is how to declare HashMap */
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        /*Adding elements to HashMap*/
        hmap.put(12, "Antony");
        hmap.put(2, "James");
        hmap.put(7, "Stephen");
        hmap.put(49, "Vignesh");
        hmap.put(3, "Jack");

        /* Display content using Iterator*/
        Set set = hmap.entrySet();
        for (Object o : set) {
            Map.Entry mentry = (Map.Entry) o;
            System.out.print("key is: " + mentry.getKey() + " & Value is: ");
            System.out.println(mentry.getValue());
        }

        /* Get values based on key*/
        String var= hmap.get(2);
        System.out.println("Value at index 2 is: "+var);

        /* Remove values based on key*/
        hmap.remove(3);
        System.out.println("Map key and values after removal:");
        Set set2 = hmap.entrySet();
        for (Object o : set2) {
            Map.Entry mentry2 = (Map.Entry) o;
            System.out.print("Key is: " + mentry2.getKey() + " & Value is: ");
            System.out.println(mentry2.getValue());
        }

    }
}
