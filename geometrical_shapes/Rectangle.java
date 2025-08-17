package geometrical_shapes;
import java.awt.*;


public class Rectangle implements Drawable {
    Point p1;
    Point p2;    
    Point p3;
    Point p4;
    Color color;

    public Rectangle(Point c1, Point c2) {
        this.p1 = c1;
        this.p2 = new Point(c1.x, c2.y);
        this.p3 = c2;
        this.p4 = new Point(c2.x, c1.y);
    }
    public Rectangle(Point c1, Point c2, Color color) {
        this.p1 = c1;
        this.p2 = new Point(c1.x, c2.y);
        this.p3 = c2;
        this.p4 = new Point(c2.x, c1.y);
        this.color = color;
    }

    @Override
    public void draw(Displayable displayable) {
        if (color == null) {
            color = this.getColor();
        }
        new Line(p1, p2, color).draw(displayable);
        new Line(p2, p3, color).draw(displayable);
        new Line(p3, p4, color).draw(displayable);
        new Line(p4, p1, color).draw(displayable);
    }
}
