package bai6;
import myexceptions.*;

public class Test {
    public static void main(String[] args) throws myExceptions{
        //tao 3 account
        Account acc1 = new Account( 72354, "Ted Murphy", 102.56);

        Account acc2 = null;
        try {
            acc2 = new Account( 69713, "Jane Smith", 40);
        }catch (myExceptions e){
            System.out.println(e.getMassage());
            System.out.println("tao cho acc2 balance = 50");
            acc2 = new Account(69713, "Jane Smith", 50);
        }
        Account acc3 = new Account( 93757, "Edward Demsey",759.32);

        //gui them tien cho acc1 va acc2
        acc1.deposit(25.85);
        acc2.deposit(500);

        //rut khoi acc2 mot khoang tien
        acc2.withdraw(430.75, 1.5);

        //tinh tien lai cho acc3
        acc3.addInterest();

        //xuat thong tin 3 acc
        System.out.println("===Thong tin 3 acc sau khi thuc hien 1 so giao dich");
        System.out.println(acc1.toString() + '\n' + acc2.toString() + '\n' + acc3.toString() + '\n');

        //chuyen tien tu acc2 cho acc1
        acc2.tranfer(acc1, 100);

        //xuat thong tin acc1 va acc2
        System.out.println("===Sau khi acc2 chuyen tien cho acc1 : 100d");
        System.out.println(acc1.toString() + '\n' + acc2.toString());

    }
}
