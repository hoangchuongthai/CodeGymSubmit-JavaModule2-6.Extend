import src.Point2D;
import src.Point3D;

public class App {
    public static void main(String[] args) {
        //Test with Point 2d
        Point2D p1 = new Point2D();
        System.out.println("p1 = " + p1);

        Point2D p2 = new Point2D(3.5f, 4.5f);
        System.out.println("p2 = " + p2);

        p2.setX(10);
        p2.setY(20);
        System.out.println("p2 after setX, setY = " + p2);

        p2.setXY(7, 9);
        System.out.println("p2 after setXY = " + p2);

        float[] arr = p2.getXY();
        System.out.println("getXY = {" + arr[0] + ", " + arr[1] + "}");

        //Test with Point 3d
        Point3D p3 = new Point3D();
        System.out.println("\np1 = " + p1);

        Point3D p4 = new Point3D(1.5f, 2.5f, 3.5f);
        System.out.println("p2 = " + p2);

        p3.setZ(9);
        System.out.println("p2 after setZ = " + p2);

        p4.setXYZ(4, 5, 6);
        System.out.println("p2 after setXYZ = " + p2);

       float[] arr2 = p4.getXYZ();
       System.out.println("getXYZ = {" + arr2[0] + ", " + arr2[1] + ", " + arr2[2] + "}");
    }
}

