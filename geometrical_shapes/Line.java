package geometrical_shapes;
import java.awt.Color;



public class Line implements Drawable {
    Point p1;
    Point p2;

    public Line(Point p1, Point p2) 
    {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Line(Point p1, Point p2, Color color) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public static Line random(int width, int height) {
        return new Line(Point.random(width, height), Point.random(width, height));
    }

    @Override
    public void draw(Displayable displayable) {
        Color color = this.getColor();

        int x0 = p1.x, y0 = p1.y, x1 = p2.x, y1 = p2.y;
        int dx = x1 - x0, dy = y1 - y0;
        double steps = Math.max(Math.abs(dx), Math.abs(dy));
        double x_inc = dx / steps, y_inc = dy / steps;
        double x = x0, y = y0;
        for (int i = 0; i <= steps; i++) {
            displayable.display(((int) Math.round(x)), ((int) Math.round(y)),
            new Color(color.getRed(), color.getGreen(), color.getBlue()));
            x += x_inc;
            y += y_inc;
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
