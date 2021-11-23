import java.awt.*;

public class Rectangle extends Figure{
    // protected allow the variables to be accessible in Square subclass
    protected int length;
    protected int width;

    public Rectangle (int px, int py, Color c){
        // super keyword is a reference variable which is used to refer immediate parent class object
        // Therefore without "super" we don't have any constructor available in Figure class.
        super(new Point(px, py), c);
        // Typically, this wouldn't have worked.
        /* Point p = new Point(px,py); */
        /* this. color=c; */
    }

    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        this.length=heightBB;
        this.width=widthBB;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        // The g objects fills the specified rectangle with the color chose just above
        // The left and right edges of the rectangle are at x and x + width - 1. The top and bottom edges are at y and y + height - 1.
        g.fillRect(origin.getX(), origin.getY(), width, length);
    }

    /**public int getWidth(){return width;}
    public int getLength(){return length;}
    public void setWidth(int width){this.width = width;}
    public void setLength(int length){this.length = length;}*/

    @Override
    public String toString(){
        return "Width: " + width+ "\nLength "+ length;
    }

}
