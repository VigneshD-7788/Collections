package Collections;

import java.util.ArrayList;
import java.util.HashMap;

public class Apps2{
    public static void main(String[] args){
        Apps1 obj=new Apps1();
        System.out.println("The arraylist values are:");
        ArrayList<String>arrayList=obj.AppsArrayList();
        for(String tmp:arrayList){
            System.out.println(tmp);
        }
        System.out.println("Iteration for key and values are:");
        HashMap<Integer,String> hashMap=obj.AppsHashmap();
        for(Integer itr: hashMap.keySet()){
            System.out.println("key"+itr+" "+"value"+" "+hashMap.get(itr));
        }
        System.out.println("Iteration for only values");
        for(String values: hashMap.values()){
            System.out.println("values"+" "+values);
        }
        System.out.println("Iteration for key only");
        for(Integer key: hashMap.keySet()){
            System.out.println("key"+key);
        }
    }
}
