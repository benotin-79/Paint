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
    private int currentX, currentY, oldX, oldY;

    public void setColor(Color color) {this.currentColor = color;}
    public void setNameFigure(String nameFigure){this.nameFigure=nameFigure;}

    // Drawing constructor
    public Drawing(){
        // fixes its own background color to white
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
    // This method is needed to draw something on JPanel other than drawing the background color.
    @Override
    public void paintComponent(Graphics g){
        // The line just below allow the draw function to work well, if we remove this some weird things appear
        super.paintComponent(g);
        // Each name of figure on the ArrayList is converted on his real function here with a color and a size.
        for(Figure f : listFigure){
            // It's a loop! It keeps in memory the last figure pressed to draw
            f.draw(g);
        }
    }

    //Abstract method from mouseMotionListener

    @Override
    //when a mouse button is pressed on a component and then dragged
    public void mouseDragged(MouseEvent e) {
        currentX=e.getX();
        currentY=e.getY();
        // we have to convert the last element of the array to an object to be able to set his origin and his BoundingBox.
        listFigure.get(listFigure.size() - 1).setBoundingBox(Math.abs(currentY - oldY), Math.abs(currentX - oldX));
        // North-est compare to the origin.
        if((currentY-oldY) >= 0 && (currentX-oldX) >= 0 ) {
        // The left edges of the figure are at x origin and the top edges are at y origin.
            listFigure.get(listFigure.size()-1).setOrigin(oldX,oldY);
        }
        // South-est compare to the origin.
        else if ((currentY-oldY) < 0 && (currentX-oldX) >= 0){
            if (nameFigure.equals("Carré")||nameFigure.equals("Cercle")) {
                if (Math.abs(currentX - oldX) < Math.abs(currentY - oldY)) {
                    listFigure.get(listFigure.size() - 1).setOrigin(oldX, currentY);
                }
                else {
                    listFigure.get(listFigure.size() - 1).setOrigin(oldX, oldY - (currentX - oldX));
                }
            }
            else{
                listFigure.get(listFigure.size() - 1).setOrigin(oldX,currentY);
            }
        }
        // South-west compare to the origin.
        else if ((currentY-oldY) < 0 && (currentX-oldX) < 0){
            if (nameFigure.equals("Carré")||nameFigure.equals("Cercle")) {
                if (Math.abs(currentX - oldX) < Math.abs(currentY - oldY)) {
                    listFigure.get(listFigure.size() - 1).setOrigin(oldX - Math.abs((currentY-oldY)), currentY);
                }
                else {
                    listFigure.get(listFigure.size() - 1).setOrigin(currentX, oldY - Math.abs((currentX - oldX)));
                }
            }
            else{
                listFigure.get(listFigure.size() - 1).setOrigin(currentX,currentY);
            }
        }
        // North-west compare to the origin.
        else if ((currentY-oldY) >= 0 && (currentX-oldX) < 0){
            if (nameFigure.equals("Carré")||nameFigure.equals("Cercle")){
                if (Math.abs(currentX-oldX) < Math.abs(currentY-oldY)){
                    listFigure.get(listFigure.size()-1).setOrigin(oldX-(currentY-oldY),oldY);
                }
                else{
                    listFigure.get(listFigure.size()-1).setOrigin(currentX,oldY);
                }
            }
            else {
                listFigure.get(listFigure.size() - 1).setOrigin(currentX, oldY);
            }
        }
        // this method causes a call to this component's update method as soon as possible
        this.repaint();
    }
    public void mouseMoved(MouseEvent e) {}
    //mouseClicked is when the mouse button has been pressed and released

    // Abstract method from mouseListener

    public void mouseClicked(MouseEvent e) {
        //Figures in our ArrayList could have stored here
    }
    @Override
    //mousePressed is when the mouse button has been pressed
    public void mousePressed(MouseEvent e) {
        // Nous donne le point oldX et oldY lorsqu'on appuie quelque part sur la fenêtre
        oldX = e.getX();
        oldY = e.getY();
        System.out.println("("+oldX+";"+oldY+")");

        //When we pressed a figure button on the GUI, it will store the name figure in our ArrayList
        switch (nameFigure) {
            case "Ellipse":
                listFigure.add(new Ellipse(oldX, oldY, this.currentColor));
                break;
            case "Rectangle":
                listFigure.add(new Rectangle(oldX, oldY, this.currentColor));
                break;
            case "Cercle":
                listFigure.add(new Circle(oldX, oldY, this.currentColor));
                break;
            case "Carré":
                listFigure.add(new Square(oldX, oldY, this.currentColor));
                break;
        }
    }
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}
