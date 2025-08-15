package geometrical_shapes;

import java.io.File;
import java.awt.Color;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;


public class Image{
    BufferedImage image;

    public Image(int width, int higth) {
        image = new BufferedImage(width, higth, BufferedImage.TYPE_INT_RGB);
        // image.setRGB(1,1,Color.CYAN.getRGB());
    }

    public void save(String path) {
        try {
            ImageIO.write(image, "PNG", new File(path));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    
}
