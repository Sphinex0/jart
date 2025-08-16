
import java.io.File;
import java.awt.Color;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Image implements Displayable {
    BufferedImage image;
    private int width;
    private int height;

    public Image(int width, int height) {
        image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        this.height = height;
        this.width = width;


    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void save(String string) {
        try {
            ImageIO.write(image, "PNG", new File(string));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void display(int x, int y, Color color) {
        if (x >= 0 & x < width && y >= 0 && y < height) {
            image.setRGB(x, y, color.getRGB());
        }
    }

}
