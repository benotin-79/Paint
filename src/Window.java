import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

        public Window(String Title, int x, int y) {
                super(Title);
                this.setSize(x, y);
                this.setVisible(true);
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
                m.add(menu2);

                setJMenuBar(m);

                /**********  Créations des boutons  **********/
                JButton noir = new JButton("Noir");
                contentPanel.add(noir);
                noir.setOpaque(true);
                noir.setBackground(Color.BLACK);
                noir.setForeground(Color.WHITE);
                JButton rouge = new JButton("Rouge");
                contentPanel.add(rouge);
                rouge.setOpaque(true);
                rouge.setBackground(Color.RED);
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
                JPanel southPanel = new JPanel();
                southPanel.setLayout(new GridLayout(2,6));
                southPanel.add(noir);
                southPanel.add(rouge);
                southPanel.add(vert);
                southPanel.add(bleu);
                southPanel.add(ellipse);
                southPanel.add(cercle);
                southPanel.add(jaune);
                southPanel.add(rose);
                southPanel.add(magenta);
                southPanel.add(orange);
                southPanel.add(rectangle);
                southPanel.add(carre);
                contentPanel.add(southPanel,"South");

                this.setVisible(true);
        }

        public static void main(String args[]) {
                Window win = new Window("Paint", 800, 600);
        }

}