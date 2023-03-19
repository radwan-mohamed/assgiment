import java.util.Date;

class Person {
    private String Name;
    private String address;
    private int PhoneNumber;
    private String Email;
    public Person(String Name,String address,int PhoneNumber,String Email){
        this.Name = Name;
        this.address=address;
        this.Email=Email;
        this.PhoneNumber=PhoneNumber;
    }

    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return getName() +" Person";
    }
}

