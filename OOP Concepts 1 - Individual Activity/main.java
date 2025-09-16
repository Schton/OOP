import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        School school = new School();
        boolean running = true;

        while (running) {
            System.out.println("1. Add Student");
            System.out.println("2. Add Staff");
            System.out.println("3. Display All Students");
            System.out.println("4. Display All Staff");
            System.out.println("5. Update Student Record");
            System.out.println("6. Update Staff Record");
            System.out.println("7. Delete Student Record");
            System.out.println("8. Delete Staff Record");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    school.addStudent(scanner);
                    break;
                case 2:
                    addStaff(scanner);
                    break;
                case 3:
                    displayAllStudents();
                    break;
                case 4:
                    displayAllStaff();
                    break;
                case 5:
                    updateStudent(scanner);
                    break;
                case 6:
                    updateStaff(scanner);
                    break;
                case 7:
                    deleteStudent(scanner);
                    break;
                case 8:
                    deleteStaff(scanner);
                    break;
                case 9:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
        scanner.close();
    }
}
