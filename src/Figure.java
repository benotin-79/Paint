import java.awt.*;

public abstract class Figure{
    private Point origin;
    protected Color color;

    protected Figure() {}

    public Color getColor() {return color;}
    public Point getOrigin() {return origin;}

    public abstract void setBoundingBox(int heightBB, int widthBB);
    public abstract void draw (Graphics g);

    public Figure(Color c, Point p){
        this.color=c;
        this.origin = p;
    }

    @Override
    public String toString(){
        return "Figure: " + origin + "\nCouleur: " + color;
    }

}
