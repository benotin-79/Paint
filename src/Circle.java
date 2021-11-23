import java.awt.*;

public class Circle extends Ellipse{

    public Circle(int px, int py, Color c) {
        super(px,py, c);
    }

    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        // semiAxisX takes the largest value between heightBB/2 and widthBB/2
        semiAxisX = Math.max(heightBB,widthBB)/2;
        // property of a circle!
        semiAxisY = semiAxisX;
    }
}
