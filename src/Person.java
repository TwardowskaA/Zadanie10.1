public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Imię:" + " " + firstName + " " + "Nazwisko:" + " " + lastName + " " + "Wiek:" + " " + age + " " + "Pesel:" + " " + pesel;
    }

}
