package btlthdt.module2.bai9;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList1 = new LinkedList<>();
        linkedList1.add("Toi");
        linkedList1.add("ten");
        linkedList1.add("la");
        linkedList1.add("Truong Vu Nghi");

        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList2.addAll(linkedList1.stream().map(String::toUpperCase).collect(Collectors.toList()));

        System.out.println(linkedList1);
        System.out.println(linkedList2);

        linkedList2.clear();


    }
}
