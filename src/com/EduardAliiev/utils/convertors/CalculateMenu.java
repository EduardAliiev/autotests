import java.util.Scanner;

public class CalculateMenu {

    public static void run () {

        Scanner scanner = new
                Scanner(System.in);
        System.out.println("Welcome! Select one of the four programs is necessary to make next choice is:" +
                "\n" + "1 - Circle Area" + "\n" + "2 - Circle Radius" + "\n" + "3 - Right Angled Triangle" +
                "\n" + "4 - Numbers Is Even Or Odd");
        double numberOfChoice = scanner.nextDouble();

        if (numberOfChoice == 1) {
            CircleArea.calculateArea();
        } else
            if (numberOfChoice == 2) {
                CircleRadius.calculateBigger();
            } else
                if (numberOfChoice == 3) {
                    AngledTriangle.calculateAngledTriangle();
                } else
                    if (numberOfChoice == 4) {
                        EvenOrOdd.calculateEvenOrOdd();
                    } else {
                        System.out.println("You made wrong choice! :( Please try again later!");
                    }
        }
}



