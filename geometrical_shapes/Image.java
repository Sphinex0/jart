package geometrical_shapes;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Image implements Displayable {
    BufferedImage image;
    private final int WIDTH;
    private final int HEIGHT;

    public Image(int width, int height) {
        image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        this.HEIGHT = height;
        this.WIDTH = width;

    }

    public int getWidth() {
        return WIDTH;
    }

    public int getHeight() {
        return HEIGHT;
    }

    @Override
    public void save(String string) {
        try {
            ImageIO.write(image, "PNG", new File(string));
        } catch (IOException e) {
            System.out.println(e);
        } 
    }

    @Override
    public void display(int x, int y, Color color) {
        if (x >= 0 & x < WIDTH && y >= 0 && y < HEIGHT) {
            image.setRGB(x, y, color.getRGB());
        }
    }

}
