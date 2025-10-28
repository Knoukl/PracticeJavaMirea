import practice7.MovableRectangle;

public class Main1 {
    public static void main(String[] args) {
        MovableRectangle rect = new MovableRectangle(0, 0, 5);
        System.out.println("Начальное положение прямоугольника: " + rect);
        rect.moveUp();
        rect.moveRight();
        rect.moveUp();
        rect.moveUp();
        rect.moveLeft();
        rect.moveLeft();
        System.out.println("Конечное положение прямоугольника: " + rect);
    }
}