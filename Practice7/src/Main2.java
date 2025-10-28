import practice7.MovableRectangle2;

public class Main2 {
    public static void main(String[] args){
        MovableRectangle2 rect = new MovableRectangle2(0, 5, 5, 0, 5);
        System.out.println("Прямоугольник в начальном положении: " + rect);

        rect.moveDown();
        rect.moveDown();
        rect.moveDown();
        rect.moveDown();
        rect.moveRight();

        System.out.println("Прямоугольник после перемещения: " + rect);
    }
}
