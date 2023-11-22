public class ElectiveEnrollment implements EnrollmentStrategy  {
    @Override
    public void enroll(Student student, Course course) {
        System.out.println("Enrolled " + student.getName() + " in elective course " + course.getName());
    }
}
