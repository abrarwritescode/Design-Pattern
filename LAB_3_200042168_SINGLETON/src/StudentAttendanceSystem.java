import java.util.Date;
public class StudentAttendanceSystem {
    private static StudentAttendanceSystem uniqueInstance;
    Student student;

    private StudentAttendanceSystem() {
        // Private constructor to prevent instantiation
    }

    public static StudentAttendanceSystem getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new StudentAttendanceSystem();
        }
        return uniqueInstance;
    }

    public void recordAttendance(Student student, String className, Date date) {
        System.out.println("Attendance recorded for student " + student.getName() +
                " in class " + className + " on " + date);
        this.student=student;
    }

}
