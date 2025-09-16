import java.util.*;
import

public class School {
    private static Map<String, Student> students = new HashMap<>();
    private static Map<String, Staff> staffMembers = new HashMap<>();

    public static void addStaff(Scanner scanner) {
        System.out.print("Enter Staff ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        Staff staff = new Staff();
        staff.setDetails(id, firstName, lastName, email, department);
        staffMembers.put(id, staff);
        System.out.println("Staff added successfully!");
    }

    // Display all students
    public static void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            for (Student student : students.values()) {
                student.displayDetails();
                System.out.println("-----------");
            }
        }
    }

    // Display all staff
    public static void displayAllStaff() {
        if (staffMembers.isEmpty()) {
            System.out.println("No staff to display.");
        } else {
            for (Staff staff : staffMembers.values()) {
                staff.displayDetails();
                System.out.println("-----------");
            }
        }
    }

    // Update student
    public static void updateStudent(Scanner scanner) {
        System.out.print("Enter Student ID to update: ");
        String id = scanner.nextLine();
        if (students.containsKey(id)) {
            Student student = students.get(id);
            System.out.print("Enter new first name: ");
            student.setDetails(id, scanner.nextLine(), student.getLastName(), student.getEmail(), student.getCourse(), student.getYear());
            System.out.println("Student updated successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }

    // Update staff
    public static void updateStaff(Scanner scanner) {
        System.out.print("Enter Staff ID to update: ");
        String id = scanner.nextLine();
        if (staffMembers.containsKey(id)) {
            Staff staff = staffMembers.get(id);
            System.out.print("Enter new first name: ");
            staff.setDetails(id, scanner.nextLine(), staff.getLastName(), staff.getEmail(), staff.getDepartment());
            System.out.println("Staff updated successfully!");
        } else {
            System.out.println("Staff not found!");
        }
    }

    // Delete student
    public static void deleteStudent(Scanner scanner) {
        System.out.print("Enter Student ID to delete: ");
        String id = scanner.nextLine();
        if (students.containsKey(id)) {
            students.remove(id);
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }

    // Delete staff
    public static void deleteStaff(Scanner scanner) {
        System.out.print("Enter Staff ID to delete: ");
        String id = scanner.nextLine();
        if (staffMembers.containsKey(id)) {
            staffMembers.remove(id);
            System.out.println("Staff deleted successfully!");
        } else {
            System.out.println("Staff not found!");
        }
    }
}
