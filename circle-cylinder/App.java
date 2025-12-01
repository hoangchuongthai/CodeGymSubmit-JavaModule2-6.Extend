import src.Circle;
import src.Cylinder;

public class App {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle(3.5);
        Circle c3 = new Circle(2.0, "blue");

        System.out.println("=== CIRCLE TEST ===");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        Cylinder cy1 = new Cylinder();
        Cylinder cy2 = new Cylinder(5.0);
        Cylinder cy3 = new Cylinder(2.5, 10.0);
        Cylinder cy4 = new Cylinder(2.5, 10.0, "green");

        System.out.println("\n=== CYLINDER TEST ===");
        System.out.println(cy1);
        System.out.println(cy2);
        System.out.println(cy3);
        System.out.println(cy4);
    }
}

