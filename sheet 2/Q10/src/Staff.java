class Staff extends Employee{
    private String title;

    public Staff(String Name,String address,int PhoneNumber,String Email, String office, double salary, String title) {
        super(Name, address, PhoneNumber,Email, office, salary);
        this.title = title;
    }
    @Override
    public String toString() {
        return getName() + " Staff";
    }
}