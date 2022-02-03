package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class listwithcount {
    public static  void main(String args[]){
        ArrayList<City>list1=new ArrayList<City>();
        City city1=new City();
        city1.setName("chennai");//setter method
        city1.setPeoplecount(10000);

        City city2 = new City();
        city2.setName("madurai");
        city2.setPeoplecount(15000);

        City city3 = new City();
        city3.setName("banglore");
        city3.setPeoplecount(2500);

        list1.add(city1);
        list1.add(city2);
        list1.add(city3);

        System.out.println("After sorting people count:");
        Collections.sort(list1,new Sort_people());
        for(City tp:list1){
            System.out.println(tp.getPeoplecount());
        }
    }
}
