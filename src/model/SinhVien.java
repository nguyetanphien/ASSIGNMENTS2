package model;

public class SinhVien {
    private int studentcode;
    private String studentName;
    private int studentAge;
    private String studentSex;

    public SinhVien() {
    }

    public SinhVien(int studentcode, String studentName, int studentAge, String studentSex) {
        this.studentcode = studentcode;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentSex = studentSex;
    }

    public int getStudentcode() {
        return studentcode;
    }

    public void setStudentcode(int studentcode) {
        this.studentcode = studentcode;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }
}
