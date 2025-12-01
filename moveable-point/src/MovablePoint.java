package src;

public class MovablePoint extends Point {

    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    // Constructor không tham số
    public MovablePoint() {
        super();
    }

    // Constructor chỉ có speed
    public MovablePoint(float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Constructor đầy đủ: x, y, xSpeed, ySpeed
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Getter & Setter
    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    // Set cả xSpeed và ySpeed
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Trả về mảng {xSpeed, ySpeed}
    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    // Phương thức di chuyển
    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }

    // toString -> "(x,y), speed=(xs,ys)"
    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "), speed=("
                + xSpeed + "," + ySpeed + ")";
    }
}
