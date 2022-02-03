package Collections;

import java.util.ArrayList;
import java.util.HashMap;

public class Listwithmap {
    public static void main(String []args){
        ArrayList<String>obj =new ArrayList<>();
        obj.add("hi");
        obj.add("hello");
        obj.add("how you");
        obj.add("bye");

        HashMap<Integer,String> hmap=new HashMap<>();
        int key=0;
        for(String tmp:obj){
            hmap.put(key,tmp);
            key++;
        }
        System.out.println(hmap);


    }
}
