class Main{
    public static void main(String[] args) {
        Person A=new Person("Ahmed","Roushdy",10203040,"Ahmed@gmail.com");
        Student B=new Student("Mohamed","Lauran",10203040,"Mohamed@gmail.com");
        Employee C=new Employee("Zeyad","Mandara",10203040,"Zeyad@gmail.com","Room004",25000);
        Faculty D=new Faculty("Ali","Victoria",10203040,"Ali@gmail.com","Room345",10000,5,"A1");
        Staff E=new Staff("Sama","Bolkly",10203040,"Sama@gmail.com","Room326",12500,"Lab Assistant");
        System.out.println( A.toString());
        System.out.println( B.toString());
        System.out.println( C.toString());
        System.out.println( D.toString());
        System.out.println( E.toString());
    }

}
