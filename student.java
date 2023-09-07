package Student;

public class student {
    private int studentRollNo;
    private String studentName;
    private String studentSubject;

    public student(int studentRollNo, String studentName, String studentSubject) {
        this.studentRollNo = studentRollNo;
        this.studentName = studentName;
        this.studentSubject = studentSubject;
    }

    public int getStudentRollNo() {
        return studentRollNo;
    }

    public void setStudentRollNo(int studentRollNo) {
        this.studentRollNo = studentRollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSubject() {
        return studentSubject;
    }

    public void setStudentSubject(String studentSubject) {
        this.studentSubject = studentSubject;
    }
    public String toString(){
        return studentRollNo +" "+studentName+" "+studentSubject;
    }
}
