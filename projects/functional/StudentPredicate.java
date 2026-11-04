package projects.functional;

import projects.studentRecordBackup.Student;

@FunctionalInterface
public interface StudentPredicate {
    boolean test(Student student);
}
