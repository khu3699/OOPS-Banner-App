import java.util.Scanner;

public class RectangleAreaCalculator {

    public static void main(String[] args) {

        // Create scanner object to take input
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter length of rectangle: ");
        double length = input.nextDouble();

        System.out.print("Enter width of rectangle: ");
        double width = input.nextDouble();

        // Calculating area
        double area = length * width;

        // Display result
        System.out.println("Area of the rectangle is: " + area);

        input.close();
    }
}
