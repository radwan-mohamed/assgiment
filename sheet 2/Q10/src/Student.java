class Student extends Person{
    final String status1 = "freshman" ;
    final String status2 = "sophomore" ;
    final String status3 = "junior" ;
    final String status4 = "senior" ;

    public Student(String Name,String address,int PhoneNumber,String Email){ super(Name, address, PhoneNumber,Email);
    }
    @Override
    public String toString() {
        return getName() +" Student";
    }
}
