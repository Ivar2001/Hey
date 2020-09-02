import javax.swing.*;
import java.awt.*;

public class Window {

    private static void createwindow(){
        JFrame frame = new JFrame("Window");
        frame.setSize(1280, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel textLabel = new JLabel("Entry One", SwingConstants.WEST);
        JTextField textveld = new JTextField(SwingConstants.EAST);
        frame.add(textLabel);
        frame.add(textveld);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public static void main(String[] args){
        createwindow();
    }
}

