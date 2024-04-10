import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the first diagonal: ");
        double d1 = scanner.nextDouble();
        System.out.print("Enter the length of the second diagonal: ");
        double d2 = scanner.nextDouble();
        double area = 0.5 * d1 * d2;
        System.out.println("Area of the rhombus is: " + area);
    }
}
