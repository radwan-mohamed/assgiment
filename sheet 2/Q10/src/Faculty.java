class Faculty extends Employee{
    private int OfficeHours;
    private String Rank;

    public Faculty(String Name,String address,int PhoneNumber,String Email, String office, double salary, int officeHours, String rank) {
        super(Name, address, PhoneNumber,Email, office, salary);
        OfficeHours = officeHours;
        Rank = rank;
    }
    @Override
    public String toString() {
        return getName() + " Faculty";
    }
}
