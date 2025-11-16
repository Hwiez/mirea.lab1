package pract_6;

public class Main_circle {
    public static void main(String[] args) {
        Movable circle = new MovableCircle(0, 0, 1, 1, 5);
        circle.moveUp();
        circle.moveRight();
        System.out.println(circle);
    }
}