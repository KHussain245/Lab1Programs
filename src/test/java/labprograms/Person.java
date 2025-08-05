package labprograms;

public class Person {
    String firstName;
    String lastName;
    char gender;
    int age;
    double weight;

    public Person(String firstName, String lastName, char gender, int age, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
    }

    public void displayDetails() {
        System.out.println("Person Details");
        System.out.println("________________________________________");
        System.out.println();
        System.out.println("First Name		: " + firstName);
        System.out.println("Last Name 		: " + lastName);
        System.out.println("Gender			: " + gender);
        System.out.println("Age		   	: " + age);
        System.out.println("Weight			: " + weight);
    }

    public static void main(String[] args) {
        Person person = new Person("Khaja Hussain", "Shaik", 'M', 22, 69.5);
        person.displayDetails();
    }
}

