package org.example.Linkedlist;

import java.util.LinkedList;
import java.util.List;

public class Linkedlistexample {
    public static void main(String[] args) {
        List<Integer>list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(50);
        System.out.println(list.size());
        System.out.println("linked list"+list);
        list.remove(2);
        System.out.println("After removing index from the list"+list);

    }
}
