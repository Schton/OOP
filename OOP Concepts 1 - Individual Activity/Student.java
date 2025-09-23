public class Student extends Person {
    private String course;
    private int year;

    public Student(String schoolID, String firstName, String lastName, String email, String course, int year) {
        super(schoolID, firstName, lastName, email);
        this.course = course;
        this.year = year;
    }

    public String getCourse() {
        return course;
    }

    public int getYear() {
        return year;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Course: " + course);
        System.out.println("Year: " + year);
    }
}
