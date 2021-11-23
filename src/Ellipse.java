import java.awt.*;

public class Ellipse extends Figure{
    // protected allow the variables to be accessible in Circle subclass
    protected int semiAxisX;
    protected int semiAxisY;

    /** methode ci-dessous a besoin d'un contructeur disponible dans Figure i.e protected Figure  **/
    public Ellipse (int px, int py, Color c){
        // Without "super" we don't have any constructor available in Figure class.
        super(new Point(px, py), c);
        semiAxisX=0;
        semiAxisY=0;
    };

    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        this.semiAxisY=heightBB/2;
        this.semiAxisX =widthBB/2;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        // The g objects fills the specified ellipse with the color chose just above
        g.fillOval(origin.getX(), origin.getY(), 2*semiAxisX, 2*semiAxisY );
    }

    /** public void setSemiAxisX(int semiAxisX){this.semiAxisX = semiAxisX;}
    public void setSemiAxisY(int semiAxisY){this.semiAxisY = semiAxisY;} */
}
