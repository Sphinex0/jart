package geometrical_shapes;

import java.awt.Color;

public class Circle implements Drawable {

    Point center;
    int raduis;

    public Circle(Point center, int raduis) {
        this.center = center;
        this.raduis = raduis;

    }

    public static Circle random(int width, int height) {
        int raduis = (int) (Math.random() * Math.min(width, height));
        return new Circle(Point.random(width, height), raduis);
    }

    @Override
    public void draw(Displayable displayable) {
        if (this.raduis == 0) {
            center.draw(displayable);
            return;
        }
        Color color = this.getColor();

        int cx = center.x, cy = center.y;
        int x = 0;
        int y = -this.raduis;
        int p = -this.raduis;

        while (x < -y) {
            if (p > 0) {
                y += 1;
                p += 2 * (x + y) + 1;
            } else {
                p += 2 * x + 1;
            }
            displayable.display(cx + x, cy + y, color);
            displayable.display(cx - x, cy + y, color);
            displayable.display(cx + x, cy - y, color);
            displayable.display(cx - x, cy - y, color);

            displayable.display(cx + y, cy + x, color);
            displayable.display(cx - y, cy + x, color);
            displayable.display(cx + y, cy - x, color);
            displayable.display(cx - y, cy - x, color);
            x += 1;
        }

    }
}
