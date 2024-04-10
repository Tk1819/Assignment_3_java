import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the parallelogram: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the parallelogram: ");
        double height = scanner.nextDouble();
        double area = base * height;
        System.out.println("Area of the parallelogram is: " + area);
    }
}
