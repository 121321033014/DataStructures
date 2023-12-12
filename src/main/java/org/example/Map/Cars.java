package org.example.Map;

import java.util.HashMap;
import java.util.Map;

public class Cars {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("Bike","Activa");
        map.put("Car","BMW");
        map.put("Truck","Mahindra");
        map.put("Bus","TATA motors");
        map.put("Cycle","Hero Mig");
        map.put("Tractor","Swaraj");
        System.out.println("Iterate the hashmap");
        for(Map.Entry v:map.entrySet()){
            System.out.println(v.getKey()+"-------> "+v.getValue());
        }
    }
}
