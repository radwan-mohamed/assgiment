import java.util.Date;

class Employee extends Person{
    private String Office;
    private double Salary;
    private Date dateHired;
    public Employee(String Name,String address,int PhoneNumber,String Email, String office, double salary) {
        super(Name, address, PhoneNumber,Email);
        Office = office;
        Salary = salary;
        this.dateHired = new Date();
    }
    @Override
    public String toString() {
        return getName() + " Employee";
    }
}