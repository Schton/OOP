import java.util.*;

public class School {
    private Map<String, Student> students = new HashMap<>();
    private Map<String, Staff> staff = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        int choice;
        do {
            System.out.println("\n--- School Record System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Add Staff");
            System.out.println("3. View All Students");
            System.out.println("4. View All Staff");
            System.out.println("5. View Single Record");
            System.out.println("6. Update Record");
            System.out.println("7. Delete Record");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = getIntInput("");

            switch (choice) {
                case 1: 
                    addStudent(); 
                    break;
                case 2: 
                    addStaff(); 
                    break;
                case 3: 
                    viewAllStudents(); 
                    break;
                case 4: 
                    viewAllStaff(); 
                    break;
                case 5: 
                    viewSingleRecord(); 
                    break;
                case 6: 
                    updateRecord(); 
                    break;
                case 7: 
                    deleteRecord(); 
                    break;
                case 0: 
                    System.out.println("Exiting..."); 
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (choice != 0);
    }

    private void addStudent() {
        System.out.print("Enter School ID: ");
        String id = scanner.nextLine();

        if (students.containsKey(id) || staff.containsKey(id)) {
            System.out.println("Error: Record with this School ID already exists.");
            return;
        }

        System.out.print("First Name: ");
        String first = scanner.nextLine();
        System.out.print("Last Name: ");
        String last = scanner.nextLine();
        System.out.print("USC Email: ");
        String email = scanner.nextLine();
        System.out.print("Course: ");
        String course = scanner.nextLine();
        int year = getIntInput("Year: ");

        Student s = new Student(id, first, last, email, course, year);
        students.put(id, s);
        System.out.println("Student added.");
    }

    private void addStaff() {
        System.out.print("Enter School ID: ");
        String id = scanner.nextLine();

        if (students.containsKey(id) || staff.containsKey(id)) {
            System.out.println("Error: Record with this School ID already exists.");
            return;
        }

        System.out.print("First Name: ");
        String first = scanner.nextLine();
        System.out.print("Last Name: ");
        String last = scanner.nextLine();
        System.out.print("USC Email: ");
        String email = scanner.nextLine();
        System.out.print("Department: ");
        String dept = scanner.nextLine();

        Staff s = new Staff(id, first, last, email, dept);
        staff.put(id, s);
        System.out.println("Staff added.");
    }

    private void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : students.values()) {
            s.display();
            System.out.println("-------------------");
        }
    }

    private void viewAllStaff() {
        if (staff.isEmpty()) {
            System.out.println("No staff found.");
            return;
        }
        for (Staff s : staff.values()) {
            s.display();
            System.out.println("-------------------");
        }
    }

    private void viewSingleRecord() {
        System.out.print("Enter School ID: ");
        String id = scanner.nextLine();
        if (students.containsKey(id)) {
            students.get(id).display();
        } else if (staff.containsKey(id)) {
            staff.get(id).display();
        } else {
            System.out.println("Record not found.");
        }
    }

    private void updateRecord() {
        System.out.print("Enter School ID to update: ");
        String id = scanner.nextLine();

        if (students.containsKey(id)) {
            Student s = students.get(id);
            System.out.print("New First Name: "); s.setFirstName(scanner.nextLine());
            System.out.print("New Last Name: "); s.setLastName(scanner.nextLine());
            System.out.print("New Email: "); s.setEmail(scanner.nextLine());
            System.out.print("New Course: "); s.setCourse(scanner.nextLine());
            s.setYear(getIntInput("New Year: "));
            System.out.println("Student updated.");
        } else if (staff.containsKey(id)) {
            Staff s = staff.get(id);
            System.out.print("New First Name: "); s.setFirstName(scanner.nextLine());
            System.out.print("New Last Name: "); s.setLastName(scanner.nextLine());
            System.out.print("New Email: "); s.setEmail(scanner.nextLine());
            System.out.print("New Department: "); s.setDepartment(scanner.nextLine());
            System.out.println("Staff updated.");
        } else {
            System.out.println("Record not found.");
        }
    }

    private void deleteRecord() {
        System.out.print("Enter School ID to delete: ");
        String id = scanner.nextLine();
        if (students.remove(id) != null || staff.remove(id) != null) {
            System.out.println("Record deleted.");
        } else {
            System.out.println("Record not found.");
        }
    }

    private int getIntInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please try again.");
            }
        }
    }
}
