import java.awt.Color;

public class Point implements Drawable {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Displayable displayable) {
        displayable.display(x, y, this.getColor());
    }

    @Override
    public Color getColor() {
        int r = (int)(Math.random() * 256);
        int g = (int)(Math.random() * 256);
        int b = (int)(Math.random() * 256);
        return new Color(r,g,b);
    }
}
