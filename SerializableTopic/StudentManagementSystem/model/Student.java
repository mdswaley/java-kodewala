package SerializableTopic.StudentManagementSystem.model;

import java.io.Serializable;

public class Student implements Serializable {

    public static final long serialVersionUID = 1L;

    private long id;
    private String studentName;
    private String course;

    private transient String password;

    public Student(long id, String studentName, String course, String password){
        this.id = id;
        this.studentName = studentName;
        this.course = course;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", course='" + course + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
