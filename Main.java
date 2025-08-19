import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Models{
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.print("Hello and welcome!\n-------------------------\n");
//
//        Scanner myName = new Scanner(System.in);
//        System.out.println("Enter your name: ");
//
//        String name = myName.nextLine();
//        System.out.println("My name is " + name);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select shape to draw: Circle, Rectangle or Triangle.");
        String shape = scanner.nextLine();

        switch (shape){
            case "Circle":

                System.out.print("Draw a Circle!\n-------------------------\n");

                System.out.println("Enter radius of the Circle: ");
                int radius = scanner.nextInt();

                double areaCircle = Math.pow(radius, 2) * Math.PI;

                System.out.println("The area the Circle is: " + areaCircle);

                break;
            case "Rectangle":

                System.out.print("Draw a rectangle!\n-------------------------\n");

                System.out.println("Enter length of the Rectangle: ");
                int length = scanner.nextInt();
                System.out.println("Enter width of the Rectangle: ");
                int width = scanner.nextInt();

                int areaRectangle = length * width;

                System.out.println("The area the Rectangle is: " + areaRectangle);
                break;
            case "Triangle":

                System.out.print("Draw a Triangle!\n-------------------------\n");

                System.out.println("Enter base of the Triangle: ");
                int base = scanner.nextInt();
                System.out.println("Enter height of the Triangle: ");
                int height = scanner.nextInt();

                int areaTriangle = (base * height) / 2;

                System.out.println("The area the Triangle is: " + areaTriangle);

                break;
        }


    }
}