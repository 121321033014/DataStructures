package org.example.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("apple");
        set.add("bts");
        set.add("jimin");
        set.add("banana");
        set.add("namjoon");
        set.add("cherry");
        set.add("apple");
        set.add("jungkook");
       System.out.println("given set is "+set);
    }

}
