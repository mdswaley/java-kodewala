package LibraryManagementSystem;

class Main {
    public static void main(String[] args) {
        StudentMember studentMember = new StudentMember();
        studentMember.setMemberID("STU123");
        studentMember.setMemberName("Raaj");
        studentMember.setCourseName("DBMS");

        System.out.println(studentMember.displayDetails());

        FacultyMember facultyMember = new FacultyMember();
        facultyMember.setMemberID("FAC123");
        facultyMember.setMemberName("Dr. Rohit");
        facultyMember.setDepartment("Chemistry");

        System.out.println(facultyMember.displayDetails());

        System.out.println("Total members in Library is : "+LibraryMember.totalMembers);
    }
}
