import java.awt.Color;

interface Displayable {
    void display(int x, int y, Color color);

    void save(String string);
}

interface Drawable {
    void draw(Displayable displayable);

    Color getColor();
}

public class Main {
    public static void main(String[] args) {
        Image image = new Image(1000, 1000);
        Point point = new Point(0, 10);
        // point.draw(image);
        // Line line = new Line(point, new Point(500, 0));
        // line.draw(image);
        Line line1 = new Line(new Point(500, 0),point);
        line1.draw(image);
        // Rectangle rectangle = new Rectangle(new Point(50, 50), new Point(300, 200));
        // rectangle.draw(image);
        // Triangle triangle = new Triangle(new Point(100, 100), new Point(900, 900),
        // new Point(100, 900));
        // triangle.draw(image);

        // for (int i = 0; i < 50; i++) {
        // Circle circle = Circle.random(image.getWidth(), image.getHeight());
        // circle.draw(image);
        // }
        image.save("image.png");
    }
}