public class Programmer extends Employee {
    String languages;

    Programmer (String name, String surname, String langiages){
        this.name = name;
        this.surname = surname;
        this.languages = langiages;
    }

    public void printInfo(){
        System.out.println("name: " + this.name+ ", surname: " + this.surname + ", languages: " + this.languages);
    }

}
