import java.awt.*;

public class Ellipse extends Figure{
    private int semiAxysX;
    private int semiAxysY;

    /** methode ci-dessous a besoin d'un contructeur disponible dans Figure i.e protected Figure  **/
    public Ellipse (int px, int py, Color c){
        Point p = new Point(px,py);
        this.color=c;
        int semiAxysX=0;
        int semiAxysY=0;
    };

    public Ellipse() {
    }

    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        this.semiAxysY=heightBB;
        this.semiAxysX=widthBB;
    }

    @Override
    public void draw(Graphics g) {}


    public void setSemiAxysX(int semiAxysX){this.semiAxysX = semiAxysX;}
    public void setSemiAxysY(int semiAxysY){this.semiAxysY = semiAxysY;}

}
