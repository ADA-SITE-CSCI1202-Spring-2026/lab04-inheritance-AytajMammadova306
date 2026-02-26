package week06;

public class Student extends Person {

    private String studentId;

    public Student() {
        super();
    }

    public Student(String firstName, String lastName, String gender, String studentId) {
        super(firstName, lastName, gender);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String toString() {
        return String.format("%s, studentId=%s", super.toString(), studentId);
    }

    public boolean equals(Student s) {
        if (s == null) {
            return false;
        }

        return this.getFirstName().equals(s.getFirstName()) &&
               this.getLastName().equals(s.getLastName()) &&
               this.getGender().equals(s.getGender()) &&
               this.studentId.equals(s.studentId);
    }
}
