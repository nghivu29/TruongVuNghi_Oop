package myexceptions;

/*
* Ngoai le su dung cho nhung gia tri khong am
*/

public class NotNegativeException extends Exception{
    @Override
    public String getMessage() {
        return "<0";
    }
}
