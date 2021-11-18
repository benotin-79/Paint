import java.awt.*;

public class Ellipse extends Figure{
    protected int semiAxisX;
    private int semiAxisY;

    /** methode ci-dessous a besoin d'un contructeur disponible dans Figure i.e protected Figure  **/
    public Ellipse (int px, int py, Color c){
        // Without "super" we don't have constructor available in Figure class.
        super(new Point(px, py), c);
        int semiAxisX=0;
        int semiAxisY=0;
    };



    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        this.semiAxisY=heightBB;
        this.semiAxisX =widthBB;
    }

    @Override
    public void draw(Graphics g) {}


    public void setSemiAxisX(int semiAxisX){this.semiAxisX = semiAxisX;}
    public void setSemiAxisY(int semiAxisY){this.semiAxisY = semiAxisY;}

}
