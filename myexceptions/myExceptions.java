package myexceptions;

public class myExceptions extends Exception {
    private String massage;

    public myExceptions(String massage){
        this.massage = massage;
    }


    public String getMassage() {
        return massage;
    }
}
