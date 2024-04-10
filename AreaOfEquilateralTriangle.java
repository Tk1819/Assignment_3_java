import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the equilateral triangle: ");
        double side = scanner.nextDouble();
        double area = (Math.sqrt(3) / 4) * side * side;
        System.out.println("Area of the equilateral triangle is: " + area);
    }
}
