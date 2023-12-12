package org.example.Map;

import java.util.HashMap;
import java.util.Map;

public class Students {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Namjoon");
        map.put(2,"Jin");
        map.put(3,"Jimin");
        map.put(4,"V");
        map.put(5,"Jungkook");
        map.put(6,"J-Hope");
        map.put(7,"Suga");
        map.put(4,"PD");
        System.out.println("Iterate the hashmap");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+"-------> "+m.getValue());
        }
    }
}
