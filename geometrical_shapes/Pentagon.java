package geometrical_shapes;
import java.awt.*;

public class Pentagon implements Drawable {
    Point[] points;

    public Pentagon(Point start, int sideLength) {
        this.points = new Point[5];
        double angle = 0.0;
        Point current = start;

        for (int i = 0; i < 5; i++) {
            int xOffset = (int) (sideLength * Math.cos(Math.toRadians(angle)));
            int yOffset = (int) (sideLength * Math.sin(Math.toRadians(angle)));

            Point next = new Point(current.x + xOffset, current.y + yOffset);
            points[i] = next;
            current = next;

            angle += 72.0;
        }
    }

    @Override
    public void draw(Displayable displayable) {
        Color color = this.getColor();

        for (int i = 0; i < 5; i++) {
            Point p1 = points[i];
            Point p2 = points[(i + 1) % 5];
            new Line(p1, p2, color).draw(displayable);
        }
    }

    @Override
    public Color getColor() {
        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);
        return new Color(r, g, b);
    }
}