package src;

public class Point {

    private float x = 0.0f;
    private float y = 0.0f;

    // Constructor không tham số
    public Point() {
    }

    // Constructor có tham số
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getter & Setter
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    // Set cả x và y
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Trả về mảng {x, y}
    public float[] getXY() {
        return new float[]{x, y};
    }

    // toString -> "(x,y)"
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
