package lab1.bai_5;

import java.util.ArrayList;
import java.util.List;
import lab1.bai_4.PhanSo;

public class DanhSachPhanSo {
    private List<PhanSo> list = new ArrayList<>();

//    public List<PhanSo> getList() {
//        return list;
//    }

//    public void setList(List<PhanSo> list) {
//        this.list = list;
//    }

    //thêm phân số vào danh sách
    public void add(PhanSo phanSoMoi){
        list.add(phanSoMoi);
    }

    public PhanSo deleted(PhanSo phanSoMoi){
        for (PhanSo i : list) {
            if (i.soSanhVoi(phanSoMoi) == 0){
                list.remove(i);
                break;
            }
        }
        return phanSoMoi;
    }

    //tổng tất cả cac phân số trong danh sách
    public PhanSo sumAll(){
        PhanSo sum = new PhanSo(0, 1);
        for (PhanSo i: list){
            sum = sum.cong(i);
        }
        sum = sum.rutGon();
        return sum;
    }

    //hiển thị danh sách
    public void display(){
        int dem = 0;
        for (PhanSo i: list){
            System.out.print("list["+ dem++ + "] = ");
            i.display();
        }
    }

    public void swap(int index1, int index2){
        PhanSo temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    public void sort(){
        for  ( int  i =  0 ; i < list.size() -  1 ; i ++) {
            for  ( int  j =  0 ; j < list.size() -  1  - i; j ++) {
                if  (list.get(j).soSanhVoi(list.get(j+1)) == 1) {
                    swap(j, j + 1);
                }
            }
        }
    }
}
