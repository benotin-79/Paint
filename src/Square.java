import java.awt.*;

public class Square extends Rectangle{

    public Square(int px, int py, Color c) {
        Rectangle square= new Rectangle(px, py, c);
    }

    @Override
    public void setBoundingBox(int heightBB, int widthBB) {

    }

    @Override
    public void draw(Graphics g) {};

}