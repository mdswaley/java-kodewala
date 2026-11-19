package Variables;

public class StudentDetails {
    static String schoolName = "SSVM";

    String name;
    int rollNo;
    byte marks;

    StudentDetails(String name, int rollNo, byte marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void display(){
        System.out.println(
            "School Name: " + schoolName +
            ", Student Name: "+name+
            ", Roll No: " + rollNo +
            ", Marks: " + marks
        );
    }

    public static void main(String[] args) {
        StudentDetails s1 = new StudentDetails("MD", 121, (byte)87);
        StudentDetails s2 = new StudentDetails("Swaley", 122, (byte)95);
        StudentDetails s3 = new StudentDetails("Raj", 123, (byte)63);

        StudentDetails[] student = {s1, s2, s3};

        for(StudentDetails s: student){
            s.display();
        }
    }
}
