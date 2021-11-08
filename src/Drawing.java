import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import static java.awt.Color.black;


public class Drawing extends JPanel implements MouseMotionListener, MouseListener {

    private Color c;
    private String nameFigure;
    ArrayList<Figure> list= new ArrayList<Figure>();
    private int x;
    private int y;


    public void setColor(Color c) {this.c = c;}

    /** constructor : fixes it's own background color to white,
     the current color is set to black and the current figure to Rectangle. **/
    public Drawing(){
        this.setBackground(Color.white);
        setColor(black);
    }


    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
