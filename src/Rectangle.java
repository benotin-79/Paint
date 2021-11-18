import java.awt.*;

public class Rectangle extends Figure{
    private int length;
    private int width;

    /** methode ci-dessous a besoin d'un contructeur disponible dans Figure i.e protected Figure  **/
    public Rectangle (int px, int py, Color c){
        // super keyword is a reference variable which is used to refer immediate parent class object
        // Therefore without "super" we don't have constructor available in Figure class.
        super(new Point(px, py), c);
        width = 0;
        length = 0;
        /** Point p = new Point(px,py);
        this. color=c; */ // Typically, this wouldn't have worked.
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
