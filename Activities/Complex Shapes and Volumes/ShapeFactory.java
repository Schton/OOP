
import java.util.Scanner;

class ShapeFactory {
    public Shape createShape() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape (1 for Cylinder, 2 for Sphere, 3 for Cone): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the Cylinder: ");
                double cRadius = scanner.nextDouble();
                System.out.print("Enter the height of the Cylinder: ");
                double cHeight = scanner.nextDouble();
                return new Cylinder(cRadius, cHeight);

            case 2:
                System.out.print("Enter the radius of the Sphere: ");
                double sRadius = scanner.nextDouble();
                return new Sphere(sRadius);

            case 3:
                System.out.print("Enter the radius of the Cone: ");
                double coneRadius = scanner.nextDouble();
                System.out.print("Enter the height of the Cone: ");
                double coneHeight = scanner.nextDouble();
                return new Cone(coneRadius, coneHeight);

            default:
                System.out.println("Invalid choice.");
                return null;
        }
    }
}