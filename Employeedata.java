package Collections;

import java.util.ArrayList;
import java.util.HashMap;

public class Employeedata {
    public static void main(String args[]) {
        HashMap<String,ArrayList<String>> obj = new HashMap<String,ArrayList<String>>();

        ArrayList<String> employeeList1 = new ArrayList<String>();
        employeeList1.add("ajay");
        employeeList1.add("niuo@gmail.com");
        employeeList1.add("chennai");

        ArrayList<String> employeeList2 = new ArrayList<String>();
        employeeList2.add("karthick");
        employeeList2.add("kargio@outlool.cpm");
        employeeList2.add("madurai");


        ArrayList<String> employeeList3 = new ArrayList<String>();
        employeeList3.add("vinoth");
        employeeList3.add("vihn@gmail.com");
        employeeList3.add("salem");


        ///adding arraylist to map
        obj.put("employee1",employeeList1);
        obj.put("employee2",employeeList2);
        obj.put("employee3",employeeList3);

        System.out.println("for loop iteration");
        for(ArrayList<String> tmp:obj.values()){
            //map iteration
         for(String tmpList:tmp){//map's arraylist iteration.
             System.out.println(tmpList);
          }
            System.out.println("-------------");
        }
    }
}
