package problem5.student;
// to store student information and properties
public class Student {
    private int backlogCount;
    private String studentName;

    public Student(String studentName, int back) {
        this.studentName = studentName;
        backlogCount = back;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getBacklogCount() {
        return backlogCount;
    }

    public void setBacklogCount(int backlogCount) {
        this.backlogCount = backlogCount;
    }
}