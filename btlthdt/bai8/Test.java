package btlthdt.bai8;

import myexceptions.myExceptions;

public class Test {
    public static void main(String[] args) throws myExceptions {

        //khoi tao
        CDList list = new CDList(5);

        //them
        list.add(new CD(1111, "CD1", 6, 12));
        list.add(new CD(5555, "CD2", 3, 9));
        list.add(new CD(3333, "CD3", 5, 19));
        list.add(new CD(4444, "CD4", 6, 3));

        //tinh so luong CD
        System.out.println("So luong CD trong danh sach la: "+ list.countCD());

        //tinh tong tien
        System.out.println("Tong so tien cua danh sach CD la: "+ list.priceOfLlist());

        //thong tin danh sach
        System.out.println("\nDanh sach truoc khi xep");
        list.display();

        //xep theo gia thanh giam dan
        list.sortDecWithPrice();
        System.out.println("\nDanh sach sau khi xep the thu tu giam dan gia tien:");
        list.display();

        //xep theo tua CD tang dan
        list.sortIncWithName();
        System.out.println("\nDanh sach sau khi xep the thu tu tang dan theo tua CD:");
        list.display();

    }
}
