package week06;

import java.util.Arrays;

public class PhdStudent extends Student {

    private String department;
    private String[] courses;

    public PhdStudent() {
        super();
    }

    public PhdStudent(String firstName, String lastName, String gender, String studentId,
                      String department, String[] courses) {
        super(firstName, lastName, gender, studentId);
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() {
        return department;
    }
    public String[] getCourses() {
        return courses;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", PhdStudent [department=" + department +", courses=" + Arrays.toString(courses) + "]";
    }

    public boolean equals(PhdStudent pStud) {
        if (pStud == null) {
            return false;
        }

        return super.equals(pStud) &&
               this.department.equals(pStud.department) &&
               Arrays.equals(this.courses, pStud.courses);
    }
}