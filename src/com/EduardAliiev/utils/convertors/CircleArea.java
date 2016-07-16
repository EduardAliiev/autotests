import java.util.Scanner;

public class CircleArea {

        public static void calculateArea() {
            final double PI = 3.14d;
            Scanner scanner = new
                    Scanner(System.in);
            System.out.println("Enter the radius (r) r = ");
            double radius = scanner.nextDouble();

            double circleArea = PI * radius * radius;
            System.out.println("Larger Area of a circle is equal to " + circleArea);
        }
}
