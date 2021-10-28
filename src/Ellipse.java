import java.awt.*;

public class Ellipse extends Figure{
    private int length;
    private int width;

    public Ellipse (int px, int py, Color c){
        Point p = new Point(px,py);
        this.color=c;
        int length=0;
        int width=0;
    };

    public Ellipse() {
    }

    @Override
    public void setBoundingBox(int heightBB, int widthBB) {

    }

    @Override
    public void draw(Graphics g) {};
}
