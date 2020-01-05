package lab1.bai_6;

import java.util.*;

public class QLHocVien {
    private List<HocVien> list = new ArrayList<>();

    public void themHocVien(HocVien hocVien){
        list.add(hocVien);
    }

    public void xoaHocVien(HocVien hocVien){
        list.remove(hocVien);
    }

    public QLHocVien timKiem(String kw){
        QLHocVien toReturn = new QLHocVien();
        System.out.println("1. Theo ma so\n2. Theo ten");

        switch (new Scanner(System.in).nextInt()){
            case 2:
                for (HocVien hv: list){
                    if (hv.getHoTen().contains(kw.trim()))
                        toReturn.themHocVien(hv);
                }
                break;

            case 1:
                for (HocVien hv: list){
                    if (Integer.parseInt(kw) == hv.getMaHV())
                        toReturn.themHocVien(hv);
                }
                break;
        }


        return toReturn;
    }

    public void sapXep(){
        Collections.sort(list, new Comparator<HocVien>() {
            @Override
            public int compare(HocVien o1, HocVien o2) {
                if((o1.getDiem()[0] + o1.getDiem()[1] + o1.getDiem()[2]) > (o2.getDiem()[0] + o2.getDiem()[1] + o2.getDiem()[2]))
                    return 1;
                else if ((o1.getDiem()[0] + o1.getDiem()[1] + o1.getDiem()[2]) < (o2.getDiem()[0] + o2.getDiem()[1] + o2.getDiem()[2]))
                    return -1;
                return 0;
            }
        });
    }

    public void nhapDiem() throws NgoaiLeDiem {
        Scanner sc = new Scanner(System.in);

        for (HocVien hv: list){
            hv.nhapDiem(sc);
        }
    }

    public QLHocVien layDSHocBong(){
        QLHocVien coHocBong = new QLHocVien();

        for (HocVien hv: list){
            if (hv.getDiem()[0] > 5 && hv.getDiem()[1] > 5 && hv.getDiem()[2] > 5 &&
                    (hv.getDiem()[0] + hv.getDiem()[1] + hv.getDiem()[2]) / 3 >= 8)
                coHocBong.themHocVien(hv);
        }
        return coHocBong;
    }

    public void hienThi(){
        for (HocVien hv: list){
            hv.hienThi();
        }
    }

}
