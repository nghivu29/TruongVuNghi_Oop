package btlthdt.module1.bai_8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Management {
    private List<Person> list = new ArrayList<>();

    public boolean add(Person person){
        return list.add(person);
    }

    public boolean deleted(String name){
        return list.removeIf(person -> person.getFulName().equals(name));
    }

    public void sort(){
        list.sort(Comparator.comparing(Person::getFulName));
    }

    public void display(){
        list.forEach(System.out::println);
    }


}
