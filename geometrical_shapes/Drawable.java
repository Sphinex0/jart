package geometrical_shapes;

import java.awt.Color;

public interface Drawable {
    void draw(Displayable displayable);
    default public  Color getColor() {
        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);
        return new Color(r, g, b);
    }

}

