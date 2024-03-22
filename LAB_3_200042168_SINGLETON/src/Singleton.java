import java.util.Date;
public class Singleton {
    public static void main(String[] args) {
        StudentAttendanceSystem attendanceSystem = StudentAttendanceSystem.getInstance();

        Student student1 = new Student("Abrar");
        Student student2 = new Student("Mahmud");
        Student student3 = new Student("Mushfiq");



        attendanceSystem.recordAttendance(student1, "Math4101", new Date());
        attendanceSystem.recordAttendance(student2, "History5101", new Date());

        StudentAttendanceSystem attendancesys=StudentAttendanceSystem.getInstance();
        attendancesys.recordAttendance(student3,"Math4201",new Date());
        System.out.println(attendanceSystem == attendancesys);

    }
}
