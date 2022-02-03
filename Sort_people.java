package Collections;

import java.util.Comparator;

public class Sort_people implements Comparator<City> {

    public int compare(City obj1,City obj2) {
        if (obj1.getPeoplecount() > obj2.getPeoplecount()) {
            return 1;
        } else if (obj1.getPeoplecount()<obj2.getPeoplecount()){
            return -1;
        }else
            return 0;
    }
}
