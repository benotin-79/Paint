import java.awt.*;

public class Square extends Rectangle{

    public Square(int px, int py, Color c) {
        super(px,py,c);
    }

    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        // length takes the largest value between heightBB and widthBB
        length = Math.max(heightBB, widthBB);
        // property of a square!
        width = length;
    }
}
