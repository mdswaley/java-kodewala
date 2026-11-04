package projects.studentRecordBackup;

public class Student {
    private String id;
    private String userName;
    private String courseName;
    private String gender;
    private Long fees;
    private Address address;


    public Student(String id, String userName, String courseName, String gender, Long fees, Address address) {
        this.id = id;
        this.userName = userName;
        this.courseName = courseName;
        this.gender = gender;
        this.fees = fees;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getFees() {
        return fees;
    }

    public void setFees(Long fees) {
        this.fees = fees;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
