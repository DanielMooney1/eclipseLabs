package Lab13;
import java.awt.*;
import javax.swing.*;

public class ComboboxGUI extends JPanel {
    private JButton jcomp1;
    private JButton jcomp2;
    private JCheckBox jcomp3;
    private JCheckBox jcomp4;
    private JComboBox jcomp5;

    public ComboboxGUI() {
        //construct preComponents
        String[] jcomp5Items = {"RED", "BLUE", "GREEN"};

        //construct components
        jcomp1 = new JButton ("OK");
        jcomp2 = new JButton ("Cancel");
        jcomp3 = new JCheckBox ("Background");
        jcomp4 = new JCheckBox ("foreground");
        jcomp5 = new JComboBox (jcomp5Items);

        //adjust size and set layout
        setPreferredSize (new Dimension (396, 213));
        setLayout (null);

        //add components
        add (jcomp1);
        add (jcomp2);
        add (jcomp3);
        add (jcomp4);
        add (jcomp5);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (105, 130, 55, 45);
        jcomp2.setBounds (180, 130, 100, 45);
        jcomp3.setBounds (85, 65, 100, 25);
        jcomp4.setBounds (210, 65, 100, 25);
        jcomp5.setBounds (0, 0, 395, 20);
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("ColorSelect");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new ComboboxGUI());
        frame.pack();
        frame.setVisible (true);
    }
}