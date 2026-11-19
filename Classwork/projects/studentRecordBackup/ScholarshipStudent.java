package projects.studentRecordBackup;

public class ScholarshipStudent extends Student implements SpecialBenefits{
    public ScholarshipStudent(Long id, String name, String course, double marks, Address address) {
        super(id, name, course, marks, address);
    }
}
