import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class Drawing extends JPanel implements MouseMotionListener, MouseListener {

    private Color currentColor;
    private String nameFigure;
    // Implementation of a Figures ArrayList to store our Figures
    ArrayList<Figure> listFigure= new ArrayList<Figure>();
    private int x;
    private int y;

    public void setColor(Color color) {this.currentColor = color;}
    public void setNameFigure(String nameFigure){this.nameFigure=nameFigure;}

    /** constructor : fixes it's own background color to white,
     the current color is set to black and the current figure to Rectangle. **/
    public Drawing(){
        this.setBackground(Color.white);
        // the current color is set to black
        currentColor=Color.black;
        // the current figure is set to Rectangle
        nameFigure="Rectangle";
        //allow mousePressed to work when this constructor is called
        this.addMouseListener(this);
        //allow mouseDragged to work when this constructor is called
        this.addMouseMotionListener(this);

    }


    @Override
    //when a mouse button is pressed on a component and then dragged
    public void mouseDragged(MouseEvent e) {}
    public void mouseMoved(MouseEvent e) {}
    //mouseClicked is when the mouse button has been pressed and released
    public void mouseClicked(MouseEvent e) {
        //Figures in our ArrayList could have stored here
    }
    @Override
    //mousePressed is when the mouse button has been pressed
    public void mousePressed(MouseEvent e) {
        // Nous donne le point x et y lorsqu'on appuie quelque part sur la fenêtre
        x = e.getX();
        y = e.getY();
        System.out.println("("+x+";"+y+")");

        //When we pressed a figure button on the GUI, it will store the figure in our ArrayList
        switch (nameFigure) {
            case "Ellipse":
                listFigure.add(new Ellipse(x, y, this.currentColor));
                break;
            case "Rectangle":
                listFigure.add(new Rectangle(x, y, this.currentColor));
                System.out.println("Rectangle de taille nulle ajouté à la liste !");
                break;
            case "Cercle":
                listFigure.add(new Circle(x, y, this.currentColor));
                break;
            case "Carré":
                listFigure.add(new Square(x, y, this.currentColor));
                break;
        }
    }
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}
