package labprograms;

public class Person3 {
    private String firstName;
    private String lastName;
    private char gender;
    private String phone;

    public Person3(String firstName, String lastName, char gender, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phone = phone;
    }

    public void displayDetails() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: " + phone);
    }

    public static void main(String[] args) {
        Person3 p = new Person3("Khaja", "Hussain", 'M', "9876543210");
        p.displayDetails();
    }
}
