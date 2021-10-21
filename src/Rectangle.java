import java.awt.*;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle (int px, int py, Color c){
        Point p = new Point(px,py);
        this.color=c;
        int length=0;
        int width=0;
    };

    public Rectangle() {
    }


    @Override
    public void setBoundingBox(int heightBB, int widthBB) {

    }

    @Override
    public void draw(Graphics g) {};



}
