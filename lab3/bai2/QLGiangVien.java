package lab3.bai2;

import java.util.*;

public class QLGiangVien {
    private List<GiangVien> gvs;
    {
        gvs = new ArrayList<>();
    }

    public void them(GiangVien gv){
        gvs.add(gv);
    }

    public void xoa(GiangVien gv){
        gvs.remove(gv);
    }

    public List<GiangVien> traCuu(String tuKhoa){
        List<GiangVien> result = new ArrayList<>();

        for (GiangVien gv: gvs){
            if (gv.getHoTen().toLowerCase().contains(tuKhoa.trim().toLowerCase())
                || gv.getHocHam().toLowerCase().contains(tuKhoa.trim().toLowerCase())
                || gv.getHocVi().toLowerCase().contains(tuKhoa.trim().toLowerCase()))
            {
                result.add(gv);
            }
        }

        return result;
    }


    public void tinhTienLuong(){
        Map<Double, GiangVien> dsGvVaLuong = new HashMap<>();

        System.out.println("\n###Nhap so gio lam viec cho tung giang vien");
        double soGio;

        //nhap
        for (GiangVien gv: gvs){
            System.out.print("Giang vien: "+ gv.getHoTen() +"\n\tSo gio lam viec: ");
            soGio = new Scanner(System.in).nextDouble();
            dsGvVaLuong.put(gv.tinhTienLuong(soGio), gv);
        }

        //sort with key
        List<Double> sortKey = new ArrayList<>(dsGvVaLuong.keySet());
        Collections.sort(sortKey, new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return o2.compareTo(o1);
            }
        });

        //show
        for (Double luong: sortKey){
            System.out.println(dsGvVaLuong.get(luong).toString() + "\nLuong: "+ luong +'\n');
        }
    }


    public void hienThi(){

    }
}
