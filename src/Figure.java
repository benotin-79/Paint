import java.awt.*;

public abstract class Figure{
    // protected allow the variable to be accessible in others subclasses like Rectangle class
    protected Point origin;
    protected Color color;

    public void setOrigin(int x, int y) {
        origin.setX(x);
        origin.setY(y);
    }

    public abstract void setBoundingBox(int heightBB, int widthBB);
    public abstract void draw (Graphics g);

    public Figure(Point p,Color c){
        this.color=c;
        this.origin = p;
    }

    @Override
    public String toString(){
        return "Figure: " + origin + "\nColor: " + color;
    }
}
