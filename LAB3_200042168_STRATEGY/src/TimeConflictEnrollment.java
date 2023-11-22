class TimeConflictEnrollment implements EnrollmentStrategy {
    @Override
    public void enroll(Student student, Course course) {
        System.out.println("Enrolled " + student.getName() + " in " + course.getName() +
                " to avoid time conflicts.");
    }
}