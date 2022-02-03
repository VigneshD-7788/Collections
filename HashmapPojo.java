package Collections;

import java.util.HashMap;

public class HashmapPojo {
    public static void main(String []args){
        HashMap<String,Personinfo>obj =new HashMap<String, Personinfo>();

        Personinfo Vignesh =new Personinfo();
        Vignesh.setName("Vignesh");
        Vignesh.setNumber(10583);

        Personinfo Rajesh =new Personinfo();
        Rajesh.setName("Rajesh");
        Rajesh.setNumber(10556);

        obj.put("Vignesh",Vignesh);
        obj.put("Rajesh",Rajesh);

        System.out.println("To get using key");
        Personinfo personinfo=obj.get("Vignesh");
        System.out.println(personinfo.getNumber()+","+personinfo.getName());

        System.out.println("----for loop iteration----");
        for(Personinfo p: obj.values()){
            System.out.println(p.getNumber()+","+p.getName());
        }

        }

         }


