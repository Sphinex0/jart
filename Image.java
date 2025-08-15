

import java.io.File;
import java.awt.Color;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;


public class Image implements Displayable{
    BufferedImage image;

    public Image(int width, int higth) {
        image = new BufferedImage(width, higth, BufferedImage.TYPE_INT_RGB);
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
        image.setRGB(x,y,color.getRGB());
    }

    
}
