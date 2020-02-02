package lab3.bai4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VietnamTranslator implements NumberTranslator {

    @Override
    public String getString(int number) {


        String sNumber = String.valueOf(number);
        // Tao mot bien tra ve
        String sReturn = "";
        // Tim chieu dai cua chuoi
        int iLen = sNumber.length();
        // Lat nguoc chuoi nay lai
        String sNumber1 = "";
        for (int i = iLen - 1; i >= 0; i--) {
            sNumber1 += sNumber.charAt(i);
        }
        // Tao mot vong lap de doc so
        // Tao mot bien nho vi tri cua sNumber
        int iRe = 0;
        do {
            // Tao mot bien cat tam
            String sCut = "";
            if (iLen > 3) {
                sCut = sNumber1.substring((iRe * 3), (iRe * 3) + 3);
                sReturn = Read(sCut, iRe) + sReturn;
                iRe++;
                iLen -= 3;
            } else {
                sCut = sNumber1.substring((iRe * 3), (iRe * 3) + iLen);
                sReturn = Read(sCut, iRe) + sReturn;
                break;
            }
        } while (true);
        if(sReturn.length() > 1){
            sReturn = sReturn.substring(0,1).toUpperCase() + sReturn.substring(1);
        }

        // xu ly lan cuoi voi 220 000 tỷ 000 000 000 000 000 HUTTV ADDED 3 OCT
        if(sNumber.length()>12)
        {
            // tren gia tri can xu ly, kiem tra xem don vi TY co = 000 khong
            int begin = sNumber.length()-9;
            String donviTy = sNumber.substring(begin-3, (begin-3)+3);
            if(donviTy.equals("000"))
            {
                sReturn = sReturn.replaceFirst("nghìn", "nghìn tỷ");
            }
        }


        return sReturn;

    }


    //vì giới hạn của kiểu int nên phương thức chỉ đọc được số đưới 2 tỉ
    @Override
    public int getNumber(String str) {
        //cắt chuỗi
        List<String> words = new ArrayList<>(Arrays.asList(str.split(" ")));
        List<String> toRemove = new ArrayList<>();
        toRemove.add("");
        words.removeAll(toRemove);

        //tính
        int number = 0;
        List<Integer> cacHang = new ArrayList<>();
        int count = -1;

        for (String word : words) {
            switch (word) {
                case "một":
                case "mốt":
                    cacHang.add(1);
                    count++;
                    break;

                case "hai":
                    cacHang.add(2);
                    count++;
                    break;

                case "ba":
                    cacHang.add(3);
                    count++;
                    break;

                case "bốn":
                case "tư":
                    cacHang.add(4);
                    count++;
                    break;

                case "năm":
                case "lăm":
                    cacHang.add(5);
                    count++;
                    break;

                case "sáu":
                    cacHang.add(6);
                    count++;
                    break;

                case "bảy":
                    cacHang.add(7);
                    count++;
                    break;

                case "tám":
                    cacHang.add(8);
                    count++;
                    break;

                case "chín":
                    cacHang.add(9);
                    count++;
                    break;


                case "tỉ":
                    cacHang.set(count, cacHang.get(count) * 1000000000);
                    break;

                case "triệu":
                    cacHang.set(count, cacHang.get(count) * 1000000);
                    break;

                case "nghìn":
                    cacHang.set(count, cacHang.get(count) * 1000);
                    break;

                case "trăm":
                    cacHang.set(count, cacHang.get(count) * 100);
                    break;

                case "chục":
                case "mươi":
                    cacHang.set(count, cacHang.get(count) * 10);
                    break;

            }
        }

        int result = 0;
        for (Integer i : cacHang) {
            result += i;
        }
        return result;
    }

    // Khoi tao ham Read
    private static String Read(String sNumber, int iPo) {
        // Tao mot bien tra ve
        String sReturn = "";
        // Tao mot bien so
        String sPo[] = { "", "nghìn" + " ",
                "triệu" + " ", "tỷ" + " ",  "nghìn" + " "};
        String sSo[] = { "không" + " ", "một" + " ",
                "hai" + " ", "ba" + " ",
                "bốn" + " ", "năm" + " ",
                "sáu" + " ", "bảy" + " ",
                "tám" + " ", "chín" + " " };
        String sDonvi[] = { "", "mươi" + " ",
                "trăm" + " " };
        // Tim chieu dai cua chuoi
        int iLen = sNumber.length();
        // Tao mot bien nho vi tri doc
        int iRe = 0;
        // Tao mot vong lap de doc so
        for (int i = 0; i < iLen; i++) {
            String sTemp = "" + sNumber.charAt(i);
            int iTemp = Integer.parseInt(sTemp);
            // Tao mot bien ket qua
            String sRead = "";
            // Kiem tra xem so nhan vao co = 0 hay ko
            if (iTemp == 0) {
                switch (iRe) {
                    case 0:
                        break;// Khong lam gi ca
                    case 1: {
                        if (Integer.parseInt("" + sNumber.charAt(0)) != 0) {
                            sRead = "lẻ" + " ";
                        }
                        break;
                    }
                    case 2: {
                        if (Integer.parseInt("" + sNumber.charAt(0)) != 0
                                && Integer.parseInt("" + sNumber.charAt(1)) != 0) {
                            sRead = "không trăm" + " ";
                        }
                        break;
                    }
                }
            } else if (iTemp == 1) {
                switch (iRe) {
                    case 1:
                        sRead = "mười" + " ";
                        break;
                    default:
                        sRead = "một" + " " + sDonvi[iRe];
                        break;
                }
            } else if (iTemp == 5) {
                switch (iRe) {
                    case 0: {
                        if(sNumber.length() <= 1){
                            sRead = "năm" + " ";
                        }
                        else if (Integer.parseInt("" + sNumber.charAt(1)) != 0) {
                            sRead = "lăm" + " ";
                        } else
                            sRead = "năm" + " ";
                        break;
                    }
                    default:
                        sRead = sSo[iTemp] + sDonvi[iRe];
                }
            } else {
                sRead = sSo[iTemp] + sDonvi[iRe];
            }

            sReturn = sRead + sReturn;
            iRe++;
        }
        if (sReturn.length() > 0) {
            sReturn += sPo[iPo];
        }
        // xu ly lan cuoi voi 220 000 tỷ 000 000 000 000 000
        if(sNumber.length()>12)
        {
            // tren gia tri can xu ly, kiem tra xem don vi TY co = 000 khong
            System.out.println(sNumber.substring(11, 8));
        }
        return sReturn;
    }

}
