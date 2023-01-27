import java.awt.*;
import java.util.Scanner;

public class SecretStudent {

    private String name = "secret name";
    private String lastName = "secret last name";
    private int number = 54321;

    public String getName(){
        return name;
    }

    public String getLastName(){
        return lastName;
    }

    public int getNumber() {
        return number;
    }

    public void setName (String name){
        if (name == ""){
            System.out.println("Błąd");
            System.exit(-1);
        }
        else {
            this.name = name;
        }

    }

    public void setlastName (String lastName){

        if (lastName == ""){
            System.out.println("Błąd");
            System.exit(-1);
        }
        else {
            this.lastName = lastName;
        }

    }

    public void setNumber (int number){
        this.number = number;
    }


    public void readFromScanner(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imię");
        setName(scanner.next());
        System.out.println("Podaj nazwisko");
        setlastName(scanner.next());
        System.out.println("Podaj numer indeksu");
        setNumber(scanner.nextInt());
    }

    public void print(SecretStudent secretStudent){
        System.out.println(secretStudent.getName() + " " + secretStudent.getLastName() + " " + secretStudent.getNumber());
    }
}
