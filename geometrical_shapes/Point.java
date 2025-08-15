package geometrical_shapes;

public class Point {
    int x;
    int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void draw(Image image){
        image.image.setRGB(x,y, 100);
        
    }
}
