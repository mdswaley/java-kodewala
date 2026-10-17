package LibraryManagementSystem;

class FacultyMember extends LibraryMember{
    private String department;

    static {
        System.out.println("Initialize Faculty Member");
    }

    @Override
    public String displayDetails(){
        return "Faculty member name : "+getMemberName()+" with ID : "+getMemberID()+" has Department : "+getDepartment();
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getDepartment(){
        return department;
    }
}
