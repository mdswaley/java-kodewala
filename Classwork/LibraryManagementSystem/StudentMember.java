package LibraryManagementSystem;

class StudentMember extends LibraryMember{
    private String courseName;

    static {
        System.out.println("Initialize Student Member");
    }

    @Override
    public String displayDetails(){
        return "Student name : "+getMemberName()+" with ID : "+getMemberID()+" having course : "+getCourseName();
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public String getCourseName(){
        return courseName;
    }

}
