import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj imię:");
        String firstName = scan.nextLine();
        System.out.println("Podaj nazwisko:");
        String lastName = scan.nextLine();
        if(firstName == null || lastName == null || firstName.length() < 2 || lastName.length() < 2)
            try {
                throw new NameUndefinedException("Imie i nazwisko nie może być nullem i mieć mniej niż 2 znaki");
            } catch (NameUndefinedException e) {
                e.printStackTrace();
            }
        System.out.println("Podaj wiek:");
        int age = scan.nextInt();
        if( age < 1)
            try {
                throw new IncorrectAgeException("Wiek nie moze byc mniejszy niz 1");
            } catch (IncorrectAgeException e) {
                e.printStackTrace();
            }
        scan.nextLine();
        System.out.println("Podaj PESEL:");
        String pesel = scan.nextLine();

        Person person = new Person(firstName, lastName, age, pesel);


        System.out.println(person.toString());
    }

}
