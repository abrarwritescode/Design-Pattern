public class UniversityEnrollmentApp {
    public static void main(String[] args) {
        CourseEnrollment enrollment = new CourseEnrollment();

        Student student1 = new Student("Mushfiq");
        Student student2 = new Student("Abrar");


        enrollment.setEnrollmentStrategy(new MajorRequirementEnrollment());
        enrollment.enrollStudent(student1, new Course("Math 4101"));

        enrollment.setEnrollmentStrategy(new ElectiveEnrollment());
        enrollment.enrollStudent(student2, new Course("CSE4301"));


        enrollment.setEnrollmentStrategy(new TimeConflictEnrollment());
        enrollment.enrollStudent(student1, new Course("EEE4101"));
    }

}
