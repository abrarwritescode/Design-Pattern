public class Staff extends Employee{
    protected String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress,
                 String office, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }
    public double getSalary(){
     return salary;
    }
    @Override
    public String toString() {
        return getClass().toString() + ": " + name;
    }
}
