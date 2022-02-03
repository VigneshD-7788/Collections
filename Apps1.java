package Collections;

import java.util.ArrayList;
import java.util.HashMap;

public class Apps1 {
    public ArrayList<String> AppsArrayList(){
        ArrayList<String>arrayList=new ArrayList<>();
        arrayList.add("Youtube");
        arrayList.add("Gmail");
        arrayList.add("Whatsapp");
        arrayList.add("Instagram");
        return arrayList;
    }
    public HashMap<Integer,String> AppsHashmap(){
        HashMap<Integer,String> hashmap=new HashMap<>();
        hashmap.put(1,"open");
        hashmap.put(2,"start");
        hashmap.put(3,"initialize");
        hashmap.put(4,"download");
        return  hashmap;
    }
}
