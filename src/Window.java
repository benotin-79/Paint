import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener {
        // Create a type Drawing instance in the class Window
        Drawing drawing=new Drawing();

        public Window(String Title, int x, int y) {
                // The first argument will add a title to the window
                super(Title);
                // The second and third argument will set the size of the window
                this.setSize(x, y);
                // When we close the window, it will end the process
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // Menu bar creation
                JMenuBar m = new JMenuBar();

                JMenu menu1 = new JMenu("File");
                JMenuItem nouveau = new JMenuItem("New");
                menu1.add(nouveau);
                nouveau.addActionListener(this);
                JMenuItem quit = new JMenuItem("Quit");
                menu1.add(quit);
                quit.addActionListener(this);
                m.add(menu1);

                JMenu menu2 = new JMenu("A propos");
                JMenuItem authors = new JMenuItem("Auteur");
                menu2.add(authors);
                authors.addActionListener(this);
                m.add(menu2);

                setJMenuBar(m);


                // provides a space where a component can be located
                Container contentPanel = this.getContentPane();


                // Creation of color button and figure button
                JButton noir = new JButton("Noir");
                contentPanel.add(noir);
                noir.setOpaque(true);
                noir.setBackground(Color.BLACK);
                noir.setForeground(Color.WHITE);
                noir.addActionListener(this);
                JButton rouge = new JButton("Rouge");
                contentPanel.add(rouge);
                rouge.setOpaque(true);
                rouge.setBackground(Color.RED);
                rouge.addActionListener(this);
                JButton vert = new JButton("Vert");
                contentPanel.add(vert);
                vert.setOpaque(true);
                vert.setBackground(Color.GREEN);
                vert.addActionListener(this);
                JButton bleu = new JButton("Bleu");
                contentPanel.add(bleu);
                bleu.setOpaque(true);
                bleu.setBackground(Color.BLUE);
                bleu.setForeground(Color.WHITE);
                bleu.addActionListener(this);
                JButton jaune = new JButton("Jaune");
                contentPanel.add(jaune);
                jaune.setOpaque(true);
                jaune.setBackground(Color.YELLOW);
                jaune.addActionListener(this);
                JButton rose = new JButton("Rose");
                contentPanel.add(rose);
                rose.setOpaque(true);
                rose.setBackground(Color.PINK);
                rose.addActionListener(this);
                JButton magenta = new JButton("Magenta");
                contentPanel.add(magenta);
                magenta.setOpaque(true);
                magenta.setBackground(Color.MAGENTA);
                magenta.addActionListener(this);
                JButton orange = new JButton("Orange");
                contentPanel.add(orange);
                orange.setOpaque(true);
                orange.setBackground(Color.ORANGE);
                orange.addActionListener(this);

                JButton ellipse = new JButton("Ellipse");
                contentPanel.add(ellipse);
                ellipse.addActionListener(this);
                JButton cercle = new JButton("Cercle");
                contentPanel.add(cercle);
                cercle.addActionListener(this);
                JButton rectangle = new JButton("Rectangle");
                contentPanel.add(rectangle);
                rectangle.addActionListener(this);
                JButton carre = new JButton("Carre");
                contentPanel.add(carre);
                carre.addActionListener(this);

                // Where is the button on the GUI
                /* 3 JPanel : 2 to stack Figure button & color button,
                 and 1 with our Drawing, the next classes that will extend JPanel. */
                JPanel southLeftPanel = new JPanel();
                southLeftPanel.setLayout(new GridLayout(2,4));
                southLeftPanel.add(noir);
                southLeftPanel.add(rouge);
                southLeftPanel.add(vert);
                southLeftPanel.add(bleu);
                southLeftPanel.add(jaune);
                southLeftPanel.add(rose);
                southLeftPanel.add(magenta);
                southLeftPanel.add(orange);
                contentPanel.add(southLeftPanel,"South");

                JPanel southRightPanel = new JPanel();
                southRightPanel.setLayout(new GridLayout(2,2));
                southRightPanel.add(ellipse);
                southRightPanel.add(cercle);
                southRightPanel.add(rectangle);
                southRightPanel.add(carre);
                contentPanel.add(southRightPanel,"South");

                JPanel southPanel = new JPanel();
                southPanel.setLayout(new GridLayout(1,2));
                southPanel.add(southLeftPanel);
                southPanel.add(southRightPanel);
                contentPanel.add(southPanel,"South");

                //allow the drawing instance to work on the GUI
                contentPanel.add(drawing, "Center");

                // Make the window visible
                this.setVisible(true);
        }

        /**********  Treat every click on the Button or in the Menu  **********/
        @Override
        // actionPerformed handles all the actions of a component
        public void actionPerformed(ActionEvent e){
            // if the case value has the same value of the text in the pressed button, the case will be executed.
            String cmd = e.getActionCommand();
                switch (cmd) {
                        case "Auteur" -> {
                                JOptionPane info = new JOptionPane();
                                info.showInternalMessageDialog(info, "Auteur : Benoît Tin-sang",
                                        "information", JOptionPane.INFORMATION_MESSAGE);
                        }
                        case "Quit" -> System.exit(0);
                        case "New" -> drawing.reset();
                        case "Noir" -> {
                                System.out.println("Black");
                                // set a new color to the drawing object
                                drawing.setColor(Color.black);
                        }
                        case "Rouge" -> drawing.setColor(Color.red);
                        case "Bleu" -> drawing.setColor(Color.blue);
                        case "Vert" -> drawing.setColor(Color.green);
                        case "Jaune" -> drawing.setColor(Color.yellow);
                        case "Rose" -> drawing.setColor(Color.pink);
                        case "Magenta" -> drawing.setColor(Color.magenta);
                        case "Orange" -> drawing.setColor(Color.orange);
                        case "Rectangle" -> {
                                // set a new figure to the drawing objet.
                                System.out.println("Rectangle");
                                drawing.setNameFigure("Rectangle");
                        }
                        case "Ellipse" -> drawing.setNameFigure("Ellipse");
                        case "Cercle" -> drawing.setNameFigure("Cercle");
                        case "Carre" -> drawing.setNameFigure("Carré");
                }
        }

        // Execution of the program
        public static void main(String[] args) {
                // Creation of a new window
                new Window("Paint", 800, 600);
        }
}