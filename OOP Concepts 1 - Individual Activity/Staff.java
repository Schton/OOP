public class Staff extends Person {
    private String department;

    public Staff(String schoolID, String firstName, String lastName, String email, String department) {
        super(schoolID, firstName, lastName, email);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Department: " + department);
    }
}
