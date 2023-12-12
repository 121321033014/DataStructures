package org.example.List;

import java.util.List;
import java.util.ArrayList;
public class Personlist {
    public static void main(String[] args) {

        List<Person> persons=new ArrayList<>();
        persons.add(new Person("Jungkook1","26","jungkook@gmail.com","90917263643","Hyderabad"));
        persons.add(new Person("Jungkook2","26","jungkook@gmail.com","90917263643","Hyderabad"));
        persons.add(new Person("Jungkook3","26","jungkook@gmail.com","90917263643","Hyderabad"));
        persons.add(new Person("Jungkook4","26","jungkook@gmail.com","90917263643","Hyderabad"));
        persons.add(new Person("Jungkook5","26","jungkook@gmail.com","90917263643","Hyderabad"));
        persons.add(new Person("Jungkook6","26","jungkook@gmail.com","90917263643","Hyderabad"));
        persons.add(new Person("Jungkook7","26","jungkook@gmail.com","90917263643","Hyderabad"));
System.out.println(persons);
        System.out.println(persons.get(6));
//for(Person list1:persons){
  //  System.out.println(list1);
//}
    }
}
