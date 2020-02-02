package btlthdt.module0.bai8;
import myexceptions.*;

public class CDList {
    private CD[] list;

    //khoi tao so phan tu cua mang
    public CDList(int lenght) throws myExceptions{
        if (lenght < 0)
            throw new myExceptions("kich thuoc mang khong am");

        list = new CD[lenght];
    }

    //them vao mang
    public boolean add(CD newCD){
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                list[i] = newCD;
                return true;
            }

            if (list[i].getMaCD() == newCD.getMaCD())
                return false;
        }

        return false;
    }

    //dem so CD trong mang
    public int countCD(){
        int count = 0;

        for (int i = 0; i < list.length; i++) {
            if (list[i] != null)
                count++;
        }
        return count;
    }

    //tinh tong gia
    public float priceOfLlist(){
        float price = 0;
        for (int i = 0; i < list.length && list[i] != null; i++) {
            price += list[i].getGiaThanh();
        }
        return price;
    }

    //tra thong tin cua toan bo CD trong danh sach
    public void display(){
        for (int i = 0; i < list.length && list[i] != null; i++) {
            System.out.println("***STT"+ (i+1) +"\t"+ list[i].toString() );
        }
    }

    //sap xep giam theo gia thanh
    public void sortDecWithPrice(){
        CD temp;
        for (int i = 1; i < list.length && list[i] != null; i++) {
            for (int j = i; j > 0; j--) {
                if (list[j].getGiaThanh() > list[j-1].getGiaThanh()){
                    temp = list[j];
                    list[j] = list[j-1];
                    list[j-1] = temp;
                }
            }
        }
    }

    //sap xep tang theo tua
    public void sortIncWithName(){
        CD temp;
        for (int i = 1; i < list.length && list[i] != null; i++) {
            for (int j = i; j > 0; j--) {
                if (list[j].getTuaCD().compareTo(list[j-1].getTuaCD()) < 0){
                    temp = list[j];
                    list[j] = list[j-1];
                    list[j-1] = temp;
                }
            }
        }
    }


}
