package Lab12;
import java.awt.*;
import javax.swing.*;

public class AlignGUI extends JPanel {
    private JButton jcomp1;
    private JButton jcomp2;
    private JButton jcomp3;
    private JCheckBox jcomp4;
    private JCheckBox jcomp5;
    private JLabel jcomp6;
    private JLabel jcomp7;
    private JTextField jcomp8;
    private JTextField jcomp9;

    public AlignGUI() {
        //construct components
        jcomp1 = new JButton ("Ok");
        jcomp2 = new JButton ("Cancel");
        jcomp3 = new JButton ("Help");
        jcomp4 = new JCheckBox ("Snap to grid");
        jcomp5 = new JCheckBox ("Show grid");
        jcomp6 = new JLabel ("X:");
        jcomp7 = new JLabel ("Y:");
        jcomp8 = new JTextField (5);
        jcomp9 = new JTextField (5);

        //adjust size and set layout
        setPreferredSize (new Dimension (752, 425));
        setLayout (null);

        //add components
        add (jcomp1);
        add (jcomp2);
        add (jcomp3);
        add (jcomp4);
        add (jcomp5);
        add (jcomp6);
        add (jcomp7);
        add (jcomp8);
        add (jcomp9);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (395, 130, 100, 30);
        jcomp2.setBounds (395, 160, 100, 30);
        jcomp3.setBounds (395, 190, 100, 30);
        jcomp4.setBounds (35, 140, 100, 25);
        jcomp5.setBounds (35, 200, 95, 25);
        jcomp6.setBounds (215, 140, 15, 25);
        jcomp7.setBounds (215, 195, 15, 25);
        jcomp8.setBounds (230, 195, 100, 25);
        jcomp9.setBounds (230, 140, 100, 25);
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new AlignGUI());
        frame.pack();
        frame.setVisible (true);
    }
}
