package LibraryManagementSystem;

class LibraryMember {
    private String memberID;
    private String memberName;
    static int totalMembers = 0;

    static {
        System.out.println("Initialize Library Member");
    }

    {
        totalMembers++;
    }

    public String displayDetails(){
        return "Member ID : "+memberID+" Member Name : "+memberName;
    }

    public void setMemberID(String memberID){
        if (memberID == null || memberID.isBlank()){
            throw new IllegalArgumentException("Member ID cannot be empty");
        }
        this.memberID = memberID;
    }

    public void setMemberName(String memberName){
        if (memberName == null || memberName.isBlank()){
            throw new RuntimeException("Member name cannot be empty");
        }
        this.memberName = memberName;
    }

    public String getMemberID(){
        return memberID;
    }

    public String getMemberName(){
        return memberName;
    }
}
