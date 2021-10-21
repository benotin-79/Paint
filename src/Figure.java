import java.awt.*;

public abstract class Figure{
    private Point point;
    protected int length;
    protected int width;
    protected Color color;

    protected Figure() {
    }

    public Color getColor() {return color;}

    public abstract void setBoundingBox(int heightBB, int widthBB);
    public abstract void draw (Graphics g);

    public Figure(Color c, Point p){
        this.color=c;
        this.point = p;
    };





}
