package org.example.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ExampleArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Apple");
        System.out.println(cars);
        //set and get
        cars.set(2,"maruthi");
        System.out.println("you want to know who is in the zeroth index"+"---->"+cars.get(3));
        System.out.println("you want to know who is in the car size"+"---->"+cars.size());
        //collection and sort
        Collections.sort(cars);
        Collections.reverse(cars);
        //Iterator the list
        Iterator itr = cars.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        //for each loop
        //for (String i : cars) {
        //    System.out.println(i);
        //
    }

}