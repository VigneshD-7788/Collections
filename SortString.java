package Collections;


import java.util.Arrays;

public class SortString{
    String[] strAr=new String[3];

    public void  add(String[] strAr){
        Arrays.sort(strAr);
        for(int i = 0; i< this.strAr.length; i++){
            System.out.println(this.strAr[i]);
        }

    }

}


