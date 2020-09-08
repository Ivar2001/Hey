import javax.swing.*;
import java.awt.*;

public class Opdracht4 extends JFrame {

    private JLabel label;

    public static void main(String[] args){
        Opdracht4 frame = new Opdracht4();
        frame.setSize(560, 500);
        frame.createGUIs();
        frame.setVisible(true);
        ImageIcon img = new ImageIcon("https://www.ecosia.org/images?q=icon#id=950A622D53ADBB79AC80D437F70C3FA98E710312");
        frame.setIconImage(img.getImage());

    }
    private void createGUIs() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container Opdracht4 = getContentPane();
        Opdracht4.setLayout(new FlowLayout());
        label = new JLabel("Hello World");
        Opdracht4.add(label);
        Opdracht4.setBackground(Color.BLUE);
    }
}