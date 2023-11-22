public class CourseEnrollment {
    private EnrollmentStrategy enrollmentStrategy;

    public void setEnrollmentStrategy(EnrollmentStrategy enrollmentStrategy) {
        this.enrollmentStrategy = enrollmentStrategy;
    }

    public void enrollStudent(Student student, Course course) {
        enrollmentStrategy.enroll(student, course);


    }
}
