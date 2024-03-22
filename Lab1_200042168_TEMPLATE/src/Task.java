public class Task {
    public static void main(String[] args) {
        MyDate hireDate = new MyDate(2022, 5, 10);

        Faculty faculty = new Faculty("Abrar", "Malibagh", "01798381932", "abrar@gamil.com",
                "CSE DEPT", 60000, hireDate, "8AM-6PM", "Lecturer");

        Staff fullTimeStaff = new FullTime("Mahmud", "Dhanmondi", "01387481933", "mahmud@gmail.com",
                "Accounts", 45000, hireDate, "Sr. Officer");

        PartTime partTimeStaff2 = new PartTime("Mushfiq", "Barishal", "012837838", "md121@yahoo.com",
                "VC Office", 192, hireDate, "Clerk");

        partTimeStaff2.recordHoursWorked(20);

        System.out.println(faculty.toString());
        System.out.println(fullTimeStaff.toString());
        System.out.println(partTimeStaff2);
        System.out.println(partTimeStaff2.getSalary());
        System.out.println(fullTimeStaff.getSalary());

    }
}
