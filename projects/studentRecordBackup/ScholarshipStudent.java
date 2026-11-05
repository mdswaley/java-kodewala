package projects.studentRecordBackup;

public class ScholarshipStudent extends Student implements SpecialBenefits{

    public ScholarshipStudent(String id, String userName, String courseName, String gender, Long fees, Address address) {
        super(id, userName, courseName, gender, fees, address);
    }

}
