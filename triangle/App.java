import src.Triangle;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập 3 cạnh
        System.out.print("Nhap canh 1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Nhap canh 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Nhap canh 3: ");
        double side3 = scanner.nextDouble();

        scanner.nextLine();

        // Fill Color
        System.out.print("Nhap mau sac cua tam giac: ");
        String color = scanner.nextLine();

        // Want to fill color?
        System.out.print("Tam giac co to mau khong? (true/false): ");
        boolean filled = scanner.nextBoolean();

        // Create Object
        Triangle triangle = new Triangle(side1, side2, side3, color, filled);

        // Display
        System.out.println("\nThong tin tam giac:");
        System.out.println("Mau sac: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());
        System.out.println("Chu vi: " + triangle.getPerimeter());
        System.out.println("Dien tich: " + triangle.getArea());
        System.out.println("toString(): " + triangle.toString());

    }
}
