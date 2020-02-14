package btlthdt.module2.bai2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào 1 chuỗi: ");
        System.out.println("Số ký tự của chuỗi là: "+ sc.nextLine().length());

        System.out.println("Nhập vào danh sách các chuỗi chuỗi");
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        int soLuong;
        System.out.println("Nhập số lượng: ");
        soLuong = sc.nextInt();sc.nextLine();
        for (int i = 1; i <= soLuong; i++) {
            System.out.println("Nhập chuỗi thứ "+ i);
            list.add(sc.nextLine());
        }

        for (int i = 0; i < soLuong; i++) {
            map.putIfAbsent(list.get(i), list.get(i).length());
        }

        for (int i = 1; i <= soLuong; i++){
            System.out.println("Số ký tự của chuỗi thứ "+ i +" là: "+ list.get(i-1).length());
        }

    }


}
