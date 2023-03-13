public class Administrator extends Employee {
    public String certificate;


    Administrator(String name, String surname, String certificate) {
        this.name = name;
        this.surname = surname;
        this.certificate = certificate;
    }

    public void printInfo() {
        System.out.println("name: " + this.name + ", surname: " + this.surname + ", certificate: " + this.certificate);
    }
}
