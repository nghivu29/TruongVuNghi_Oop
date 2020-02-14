package btlthdt.module2.bai8;

import java.util.HashSet;
import java.util.Set;

public class Section {
    private String semester;
    private String sectionNbr;
    private String room;
    private Faculty facultyMember;
    private Set<Enrolment> listEnrolls = new HashSet<>(){
        @Override
        public String toString() {
            String toReturn = "";
            for (Enrolment e: listEnrolls)
                toReturn += e.toString() + '\n';
            return toReturn;
        }
    };

    public Section(){}

    public Section(String semester, String sectionNbr, String room, Faculty facultyMember, Set<Enrolment> listEnrolls) {
        this.semester = semester;
        this.sectionNbr = sectionNbr;
        this.room = room;
        this.facultyMember = facultyMember;
        this.listEnrolls = listEnrolls;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getSectionNbr() {
        return sectionNbr;
    }

    public void setSectionNbr(String sectionNbr) {
        this.sectionNbr = sectionNbr;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "\t\t====Thông tin học phần===="+
                "\n\t\tMã học phần: "+ sectionNbr +
                "\n\t\tHọc kỳ: "+ semester +
                "\n\t\tPhòng học: "+ room +
                "\n\t\tGiảng viên: "+ facultyMember.firstName +" "+ facultyMember.lastName +
                "\n\t\t====Danh sách sinh viên===="+
                String.format("\n%-15s%-20s%-15s%-15s\n", "Mã sinh viên", "Họ tên", "Khóa năm", "Điểm") +
                listEnrolls.toString();
    }
}
