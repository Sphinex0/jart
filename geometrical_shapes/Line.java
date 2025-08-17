package geometrical_shapes;

import java.awt.Color;

public class Line implements Drawable {

    Point p1;
    Point p2;
    Color color;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Line(Point p1, Point p2, Color color) {
        this.p1 = p1;
        this.p2 = p2;
        this.color = color;

    }

    public static Line random(int width, int height) {
        return new Line(Point.random(width, height), Point.random(width, height));
    }

    @Override
    public void draw(Displayable displayable) {
        if (color == null) {
            color = this.getColor();
        }

        int x0 = p1.x, y0 = p1.y, x1 = p2.x, y1 = p2.y;
        int dx = x1 - x0, dy = y1 - y0;
        double steps = Math.max(Math.abs(dx), Math.abs(dy));
        double x_inc = dx / steps, y_inc = dy / steps;
        double x = x0, y = y0;
        for (int i = 0; i <= steps; i++) {
            displayable.display(((int) Math.round(x)), ((int) Math.round(y)),
                    color);
            x += x_inc;
            y += y_inc;
        }
    }
}
