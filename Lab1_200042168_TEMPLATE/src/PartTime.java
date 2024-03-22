public class PartTime extends Staff{
    private double hourlyRate;
    private double hoursWorked;

    public PartTime(String name, String address, String phoneNumber, String emailAddress,
                    String office, double hourlyRate, MyDate dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, 0, dateHired, title);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = 0;
    }

    public void recordHoursWorked(double hours) {
        hoursWorked += hours;
    }

    @Override
    public double getSalary() {
        return hourlyRate * hoursWorked;
    }

}


