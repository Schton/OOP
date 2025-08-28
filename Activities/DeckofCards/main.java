import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Cards cards = new Cards();
        int choice;

    do {
            System.out.println("\nSelect action:");
            System.out.println("1 - Shuffle cards");
            System.out.println("2 - Deal a card");
            System.out.println("3 - Display cards");
            System.out.println("0 - Exit");
            System.out.print("Enter your choice: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                scanner.next();
            }

            choice = scanner.nextInt();

            if (choice != 0) {
                cards.menu(choice);
            } else {
                System.out.println("Exiting program. Goodbye!");
            }
        } while (choice != 0);

        scanner.close();
    }
}
