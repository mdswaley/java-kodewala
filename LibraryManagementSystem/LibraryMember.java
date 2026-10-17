package LibraryManagementSystem;

class LibraryMember {
    private String memberID;
    private String memberName;
    static int totalMember;

    static {
        System.out.println("Initialize Library Member");
    }

    {
        totalMember++;
    }

    public void setMemberID(String memberID){
        this.memberID = memberID;
    }

    public void setMemberName(String memberName){
        this.memberName = memberName;
    }

    public String getMemberID(){
        return memberID;
    }

    public String getMemberName(){
        return memberName;
    }
}
