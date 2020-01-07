package lab3.bai4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class VietnamTranslator implements NumberTranslator {

    private final static String[] donVi = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín", "mười"};
    private final static String[] hang = {"mươi", "trăm", "nghìn", "triệu", "tỉ"};
    private final static String[] dacBiet = {"linh", "lẻ", "mốt", "tư", "lăm", "chục"};

    @Override
    public String getString(int number) {


        return null;
    }

    @Override
    public int getNumber(String str) {
        //cắt chuỗi
        List<String> words = new ArrayList<>(Arrays.asList(str.split(" ")));
        List<String> toRemove = new ArrayList<>();
        toRemove.add("");
        words.removeAll(toRemove);

        //tính
        int number = 0;
        boolean isNext = false;
        List<Integer> cacHang = new ArrayList<>();
        int count = 0;

        final String[] arr = {"a"};
        for (String word: words){
            switch (word){
                case "một":
                case "mốt":
                    cacHang.add(1);
                    isNext = true;
                    break;

                case "hai":
                    cacHang.add(2);
                    isNext = true;
                    break;

                case "ba":
                    cacHang.add(3);
                    isNext = true;
                    break;

                case "bốn":
                case "tư":
                    cacHang.add(4);
                    isNext = true;
                    break;

                case "năm":
                case "lăm":
                    cacHang.add(5);
                    isNext = true;
                    break;

                case "sáu":
                    cacHang.add(6);
                    isNext = true;
                    break;

                case "bảy":
                    cacHang.add(7);
                    isNext = true;
                    break;

                case "tám":
                    cacHang.add(8);
                    isNext = true;
                    break;

                case "chín":
                    cacHang.add(9);
                    isNext = true;
                    break;


                case "tỉ":
                    if (isNext = true) {
                        cacHang.set(count, cacHang.get(count) * 1000000000);
                        count++;
                    }
                    isNext = false;
                    break;

                case "triệu":
                    if (isNext = true) {
                        cacHang.set(count, cacHang.get(count) * 1000000);
                        count++;
                    }
                    isNext = false;
                    break;

                case "nghìn":
                    if (isNext = true) {
                        cacHang.set(count, cacHang.get(count) * 1000);
                        count++;
                    }
                    isNext = false;
                    break;

                case "trăm":
                    if (isNext = true) {
                        cacHang.set(count, cacHang.get(count) * 100);
                        count++;
                    }
                    isNext = false;
                    break;

                case "chục":
                case "mươi":
                    if (isNext = true) {
                        cacHang.set(count, cacHang.get(count) * 10);
                        count++;
                    }
                    isNext = false;
                    break;

            }
        }

        int result = 0;
        for (Integer i: cacHang){
            result += i;
        }
        System.out.println(Integer.MAX_VALUE);
        return result;
    }
}
