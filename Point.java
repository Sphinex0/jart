import java.awt.Color;

public class Point implements Drawable {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Point random(int width, int height) {
        int x = (int) (Math.random() * width);
        int y = (int) (Math.random() * height);
        return new Point(x, y);
    }

    @Override
    public void draw(Displayable displayable) {
        displayable.display(x, y, this.getColor());
    }

    @Override
    public Color getColor() {
        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);
        return new Color(r, g, b);
    }
}
