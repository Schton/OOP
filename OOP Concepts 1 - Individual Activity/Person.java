public class Person {
    private String schoolID;
    private String firstName;
    private String lastName;
    private String email;

    public Person(String schoolID, String firstName, String lastName, String email) {
        this.schoolID = schoolID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getSchoolID() {
        return schoolID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void display() {
        System.out.println("School ID: " + schoolID);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Email: " + email);
    }
}
