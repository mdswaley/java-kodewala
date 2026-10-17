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
        if (memberID == null){
            throw new RuntimeException("memberID cannot be null");
        }
        this.memberID = memberID;
    }

    public void setMemberName(String memberName){
        if (memberName == null){
            throw new RuntimeException("memberName cannot be null");
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
