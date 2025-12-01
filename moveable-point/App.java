import src.MovablePoint;
import src.Point;

public class App {
    public static void main(String[] args) {
        //Test with Point
        Point p1 = new Point();
        System.out.println("p1 = " + p1);

        Point p2 = new Point(3.5f, 4.5f);
        System.out.println("p2 = " + p2);

        p2.setX(10);
        p2.setY(20);
        System.out.println("p2 after setX, setY = " + p2);

        p2.setXY(7, 9);
        System.out.println("p2 after setXY = " + p2);

        float[] arr = p2.getXY();
        System.out.println("getXY = {" + arr[0] + ", " + arr[1] + "}");

        //Test with MoveablePoint

        MovablePoint mp1 = new MovablePoint();
        System.out.println("\nmp1 = " + mp1);

        MovablePoint mp2 = new MovablePoint(2.0f, 3.0f);
        System.out.println("mp2 = " + mp2);

        MovablePoint mp3 = new MovablePoint(5, 6, 1.5f, 2.5f);
        System.out.println("mp3 = " + mp3);

        mp3.move();
        System.out.println("mp3 after move = " + mp3);

        mp3.move().move();
        System.out.println("mp3 after move twice = " + mp3);

        float[] speed = mp3.getSpeed();
        System.out.println("Speed = {" + speed[0] + ", " + speed[1] + "}");
    }

}
