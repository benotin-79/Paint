import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener {

        public Window(String Title, int x, int y) {
                super(Title);
                this.setSize(x, y);
                this.setVisible(true);
                // Le bouton close termine l'application
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                Container contentPanel = this.getContentPane();

                /**********  Créations de la barre de menus  **********/
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

                /**********  Créations des boutons  **********/
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
                JButton bleu = new JButton("Bleu");
                contentPanel.add(bleu);
                bleu.setOpaque(true);
                bleu.setBackground(Color.BLUE);
                bleu.setForeground(Color.WHITE);
                JButton ellipse = new JButton("Ellipse");
                contentPanel.add(ellipse);
                JButton cercle = new JButton("Cercle");
                contentPanel.add(cercle);
                JButton jaune = new JButton("Jaune");
                contentPanel.add(jaune);
                jaune.setOpaque(true);
                jaune.setBackground(Color.YELLOW);
                JButton rose = new JButton("Rose");
                contentPanel.add(rose);
                rose.setOpaque(true);
                rose.setBackground(Color.PINK);
                JButton magenta = new JButton("Magenta");
                contentPanel.add(magenta);
                magenta.setOpaque(true);
                magenta.setBackground(Color.MAGENTA);
                JButton orange = new JButton("Orange");
                contentPanel.add(orange);
                orange.setOpaque(true);
                orange.setBackground(Color.ORANGE);
                JButton rectangle = new JButton("Rectangle");
                contentPanel.add(rectangle);
                JButton carre = new JButton("Carre");
                contentPanel.add(carre);

                /**********  Localisation des boutons  **********/
                /** we'll be using three
JPanel : two to stack the Figure button and the color button, and one with our
Drawing, the next classes that will extend JPanel. **/
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
                                System.out.println("I've been clicked !");
                                break;
                }
        }

        public static void main(String args[]) {
                Window win = new Window("Paint", 800, 600);
        }
}