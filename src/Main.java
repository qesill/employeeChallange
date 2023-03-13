public class Main {
    public static void main(String[] args) {
        /*
        1. Dodaj klasę Employee która będzie podstawą kolejnych klas.
        Ma posiadać pola name i surname, pusty konstruktor oraz
        drugi konstruktor przyjmujący name i surname ustawiający te pola.
        Dodatkowo potrzebna jest metoda printInfo() pokazująca w konsoli dane klasy
        2. Zapisz klasę Administrator która rozszerza Employee i ma pole String
        o nazwie certificates.Dodaj również konstruktor ustawiający name, surname
        i certificates oraz metodę printInfo() pokazujące dane instancji w konsoli.
        3. Dodaj klasę Programmer rozszerzającą Employee i mającą pole String languages.
        Dodatkowo zapisz konstruktor przyjmujący parametry name surname i languages
        4. W klasie Main stwórz po jednej instancji Employee, Adminstrator i Programmer.
        Wywołaj printInfo() na każdej z nich.
        5. Dla testu dodaj final przed Employee aby sprawdzić czy pojawi się błąd
        kompilacji o braku możliwości rozszerzenia klasy.
         */

Employee employee = new Employee("Paweł", "Klufczyński");
employee.printInfo();
Programmer programmer = new Programmer("Krzysztof", "Toma", "Java");
programmer.printInfo();
Administrator administrator = new Administrator("Paweł", "Wójtowicz", "Microsoft");
administrator.printInfo();
}
}
