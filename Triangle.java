import java.awt.*;

public class Triangle implements Drawable {
    Point p1;
    Point p2;
    Point p3;
    Color color;

    Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.color = this.getColor();

    }

    @Override
    public void draw(Displayable displayable) {
        new Line(p1, p2, color).draw(displayable);
        new Line(p2, p3, color).draw(displayable);
        new Line(p3, p1, color).draw(displayable);
    }

    @Override
    public Color getColor() {
        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);
        return new Color(r, g, b);
    }

}
