package projects.studentRecordBackup;

public class Student {
    private Long id;
    private String name;
    private String course;
    private double marks;
    private Address address;

    public Student(Long id, String name, String course, double marks, Address address) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.marks = marks;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", marks=" + marks +
                ", address=" + address +
                '}';
    }
}
