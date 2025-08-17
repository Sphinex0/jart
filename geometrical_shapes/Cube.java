package geometrical_shapes;
import java.awt.*;

public class Cube implements Drawable {
    Point pointA;
    Point pointB;

    public Cube(Point a, Point b) {
        this.pointA = a;
        this.pointB = b;
    }

    @Override
    public void draw(Displayable displayable) {
        Color color = this.getColor();

        Point a = pointA;
        Point b = pointB;

        int dx = (a.x - b.x) / 2;
        int dy = -((a.y - b.y) / 2);

        Rectangle rec1 = new Rectangle(a, b, color);
        Rectangle rec2 = new Rectangle(
            new Point(a.x + dx, a.y + dy),
            new Point(b.x + dx, b.y + dy), color
        );

        rec1.draw(displayable);
        rec2.draw(displayable);

        new Line(rec1.p1, rec2.p1, color).draw(displayable);
        new Line(rec1.p2, rec2.p2, color).draw(displayable);
        new Line(rec1.p3, rec2.p3, color).draw(displayable);
        new Line(rec1.p4, rec2.p4, color).draw(displayable);
    }

    @Override
    public Color getColor() {
        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);
        return new Color(r, g, b);
    }
}
