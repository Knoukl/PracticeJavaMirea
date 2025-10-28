package practice7;

public class MovableRectangle implements Movable {
    private int x;
    private int y;
    private int speed;

    public MovableRectangle(int x, int y, int speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    @Override
    public void moveUp() {
        y += speed;
    }

    @Override
    public void moveDown() {
        y -= speed;
    }

    @Override
    public void moveLeft() {
        x -= speed;
    }

    @Override
    public void moveRight() {
        x += speed;
    }

    @Override
    public String toString() {
        return "MovableRectangle{x=" + x + ", y=" + y + ", speed=" + speed + "}";
    }

}
