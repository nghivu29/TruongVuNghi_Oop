package btlthdt.module0.bai9;
import myexceptions.myExceptions;

public class DanhSachCongNhan {
    private CongNhan[] list;

    //khoi tao so phan tu cua mang
    public DanhSachCongNhan(int lenght) throws myExceptions {
        if (lenght < 0)
            throw new myExceptions("kich thuoc mang khong am");

        list = new CongNhan[lenght];
    }

    //them vao mang
    public boolean add(CongNhan newCongNhan){
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                list[i] = newCongNhan;
                return true;
            }
        }
        return false;
    }

    //dem so cong nhan trong mang
    public int countCongNhan(){
        int count = 0;

        for (int i = 0; i < list.length; i++) {
            if (list[i] != null)
                count++;
        }
        return count;
    }

    //In thong tin cua toan bo cong nhan trong danh sach
    public void display(){
        for (int i = 0; i < list.length && list[i] != null; i++) {
            System.out.println("***STT"+ (i+1) +"\t"+ list[i].toString() );
        }
    }

    //In thong tin cua nhung cong nhan co san pham tren 200
    public void display200(){
        for (int i = 0; i < list.length && list[i] != null; i++) {
            if (list[i].getmSoSanPham() > 200)
                System.out.println("***STT"+ (i+1) +"\t"+ list[i].toString() );
        }
    }

    public void sepGiamDanSoSanPham(){
        CongNhan temp;
        for (int i = 1; i < list.length && list[i] != null; i++) {
            for (int j = i; j > 0; j--) {
                if (list[j].getmSoSanPham() > list[j-1].getmSoSanPham()){
                    temp = list[j];
                    list[j] = list[j-1];
                    list[j-1] = temp;
                }
            }
        }
    }


}
