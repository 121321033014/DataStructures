package org.example.ConcurrentModificationException;


import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class Student {
    public static void main(String[] args) {
        Map<Integer,String> s = new ConcurrentHashMap<>() ;
        s.put(1,"Kim Namjoom");
        s.put(2,"Kim seokjin");
        s.put(3,"Kim taehyung");
        s.put(4,"Jeon jungkook");
        s.put(5,"Park jimin");
        s.put(6,"Min Yoongi");
        s.put(7,"Lee jungkook");
        Iterator<Map.Entry<Integer,String>> iterator=s.entrySet().iterator();
        /*here in the HashMap we are iterating the key and values.and also asking to remove key 2 from the list.
        but in the normal hashMap only one task executes at a time.
        Hence it just iterates that key values.
        */
        while(iterator.hasNext()){
            Map.Entry<Integer,String> entry = iterator.next();
            System.out.println(entry.getKey()+"====>"+entry.getValue());
            if(entry.getKey()==2){
                s.remove(entry.getKey());
            }
        }
        /* here in the ConcurrentHashMap we are able to remove the key 2 from the list.*/
         //System.out.println(s);
         //here we can use both above and below code to get the values after removing the key 2.
        // only the difference is the above code is not clearly displaying.but the below code is clearly displaying.
        for(Map.Entry<Integer,String> entry : s.entrySet()){
            System.out.println("keys"+entry.getKey()+"====="+entry.getValue());
        }
    }

}