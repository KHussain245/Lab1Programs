package labprograms;

enum Gender {
    M, F
}

public class Person4 {
    private String firstName;
    private String lastName;
    private Gender gender;

    public Person4(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public void displayDetails() {
        System.out.println("Full Name: " + firstName + " " + lastName);
        System.out.println("Gender: " + gender);
    }

    public static void main(String[] args) {
        Person4 p = new Person4("Khaja", "Hussain", Gender.M);
        p.displayDetails();
    }
}
