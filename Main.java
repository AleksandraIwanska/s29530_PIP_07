public class Main {
    public static void main(String[] args) {

        // zadanie 1
        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "Ola Iwanska";
        student1.number = 19530;
        System.out.println(student1.name + " " + student1.number);
        System.out.println(student2.name + " " + student2.number);


        // zadanie 2

        SecretStudent secretStudent1 = new SecretStudent();
        System.out.println(secretStudent1.getName() + " " + secretStudent1.getLastName() + " " + secretStudent1.getNumber());

        // zadanie 3


        secretStudent1.setName("Ewa");
        secretStudent1.setlastName("Nowak");
        secretStudent1.setNumber(98765);
        System.out.println(secretStudent1.getName() + " " + secretStudent1.getLastName() + " " + secretStudent1.getNumber());

        // zadanie 4

        SecretStudent secretStudent2 = new SecretStudent();
        secretStudent2.readFromScanner();
        secretStudent2.print(secretStudent2);

        SecretStudent secretStudent3 = new SecretStudent();
        secretStudent3.readFromScanner();
        secretStudent3.print(secretStudent3);

    }
}