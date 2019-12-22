package myexceptions;

public class LimitOfCourse extends ArrayIndexOutOfBoundsException {
    @Override
    public String getMessage() {
        return "Error: maximum is 20 students\n" + super.getMessage();
    }
}
