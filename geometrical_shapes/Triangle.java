package geometrical_shapes;
import java.awt.*;

public class Triangle implements Drawable {
    Point p1;
    Point p2;
    Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public void draw(Displayable displayable) {
        Color color = this.getColor();
        new Line(p1, p2, color).draw(displayable);
        new Line(p2, p3, color).draw(displayable);
        new Line(p3, p1, color).draw(displayable);
    }
}
