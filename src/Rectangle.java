import java.awt.*;

public class Rectangle extends Figure{
    private int length;
    private int width;

    /** methode ci-dessous a besoin d'un contructeur disponible dans Figure i.e protected Figure  **/
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
        this.length=heightBB;
        this.width=widthBB;
    }

    @Override
    public void draw(Graphics g) {};

    public int getWidth(){return width;}
    public int getLength(){return length;}
    public void setWidth(int width){this.width = width;}
    public void setLength(int length){this.length = length;}

    @Override
    public String toString(){
        return "Largeur: " + width+ "\nLongueur "+ length;
    }

}
