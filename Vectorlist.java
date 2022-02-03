package Collections;
import java.util.*;
public class Vectorlist {

    public static void main(String args[]) {
        /* Vector of initial capacity(size) of 2 */
        Vector<String> vec = new Vector<String>(2);

        /* Adding elements to a vector*/
        vec.addElement("Tv");
        vec.addElement("Stove");
        vec.addElement("Refrigerator");
        vec.addElement("Sofa");

        /* check size and capacityIncrement*/
        System.out.println("Size is: "+vec.size());
        System.out.println("Default capacity increment is: "+vec.capacity());

        vec.addElement("Fan");
        vec.addElement("AC");
        vec.addElement("Juicer");

        /*size and capacityIncrement after two insertions*/
        System.out.println("Size after addition: "+vec.size());
        System.out.println("Capacity after increment is: "+vec.capacity());

        /*Display Vector elements*/
        Enumeration en = vec.elements();
        System.out.println("\nElements are:");
        while(en.hasMoreElements())
            System.out.print(en.nextElement() + ", ");
    }
}
