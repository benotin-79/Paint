import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import static java.awt.Color.black;


public class Drawing extends JPanel {
    private Color c;
    private String nameFigure;
    ArrayList<Figure> list= new ArrayList<Figure>();
    // public static ArrayList<Figure> getList() {return list;}

    public void setColor(Color color) {c = color;}
    //public void setNameFigure(Figure nomFigure) {nameFigure = nomFigure;}


    /** constructor : fixes it's own background color to white,
     the current color is set to black and the current figure to Rectangle. **/
    public Drawing(){
        this.setBackground(Color.white);
        setColor(black);
        //setNameFigure();
    }
    //public static void main(String args[]){System.out.println(Drawing.getList());}

}
