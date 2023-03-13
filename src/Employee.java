public class Employee {
    public String name;
    public String surname;

    Employee(){
    }

    Employee(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public void printInfo(){
        System.out.println("name: " + this.name+ ", surname: " + this.surname);
    }
}
