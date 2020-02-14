package btlthdt.module2.bai3;

import java.util.Objects;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> A = new TreeSet<>();
        TreeSet<Integer> B = new TreeSet<>();

        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        B.add(3);
        B.add(4);
        B.add(5);
        B.add(6);

        TreeSet<Integer> ketQua = new TreeSet<>();
        System.out.println("A: "+ A);
        System.out.println("B: "+ B);

        ketQua.addAll(A);
        ketQua.addAll(B);
        System.out.println("A hội B: "+ ketQua);

        ketQua.removeIf(Objects::nonNull);
        ketQua.addAll(A);
        ketQua.retainAll(B);
        System.out.println("A giao B: "+ ketQua);

        ketQua.removeIf(Objects::nonNull);
        ketQua.addAll(A);
        ketQua.removeAll(B);
        System.out.println("A tru B: "+ ketQua);
    }
}
