import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener {
        //Créer une instance de type Drawing dans la class Window
        Drawing drawing=new Drawing();

        public Window(String Title, int x, int y) {
                // Ajoute un titre à la fenêtre
                super(Title);
                // Dimensione la taille de la fenêtre
                this.setSize(x, y);
                // Rend la fenêtre visible
                // this.setVisible(true);
                // Le bouton close termine l'application
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                /**********  Création de la barre de menu  **********/
                JMenuBar m = new JMenuBar();

                JMenu menu1 = new JMenu("File");
                JMenuItem nouveau = new JMenuItem("New");
                menu1.add(nouveau);
                JMenuItem open = new JMenuItem("Open");
                menu1.add(open);
                JMenuItem save = new JMenuItem("Save");
                menu1.add(save);
                JMenuItem quit = new JMenuItem("Quit");
                menu1.add(quit);
                m.add(menu1);

                JMenu menu2 = new JMenu("A propos");
                JMenuItem authors = new JMenuItem("Auteur");
                menu2.add(authors);
                authors.addActionListener(this);
                m.add(menu2);

                setJMenuBar(m);


                /**********  provides a space where a component can be located **********/
                Container contentPanel = this.getContentPane();


                /**********  Créations des boutons (couleurs et figures) **********/
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
                JButton vert = new JButton("vert");
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

                /**********  Localisation des boutons  **********/
                /** 3 JPanel : 2 to stack Figure button & color button,
                 and 1 with our Drawing, the next classes that will extend JPanel. **/
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

                // Rend la fenêtre visible
                this.setVisible(true);
        }

        /**********  Treat every click on the Button or in the Menu  **********/
        @Override
        public void actionPerformed(ActionEvent e){
                String cmd = e.getActionCommand();
                switch (cmd) {
                        case "Auteur":
                                JOptionPane info = new JOptionPane();
                                info.showInternalMessageDialog( info, "Auteur : Benoît Tin-sang",
                                        "information",JOptionPane.INFORMATION_MESSAGE);
                        case "Noir":
                                //System.out.println("I've been clicked !");
                                drawing.setColor(Color.black);
                                break;
                        case "Rectangle" :
                                System.out.println("Rectangle");
                                drawing.setNameFigure("Rectangle");
                                break;
                }
        }

        public static void main(String args[]) {
                Window win = new Window("Paint", 800, 600);
        }
}