public class Employee extends Person{
   protected String office;
    protected double salary;
    protected MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, String emailAddress,
                    String office, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }
    @Override
    public String toString() {
        return getClass().toString() + ": " + name;
    }
}
