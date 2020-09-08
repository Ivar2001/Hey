import javax.swing.*;

public class Opdracht3 extends JFrame
{
    JPanel windowpanel = new JPanel();
    JLabel textLabel = new JLabel("Entry One");
    JTextField textveld = new JTextField(30);

    public Opdracht3()
    {
        setTitle("Opdracht 3");
        setVisible(true);
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        windowpanel.add(textLabel);
        windowpanel.add(textveld);

        add(windowpanel);
    }

    public static void main(String[] args)
    {
        Opdracht3 t = new Opdracht3();
    }
}