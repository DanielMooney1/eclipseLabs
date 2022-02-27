package Lab14;
import java.awt.*;
import javax.swing.*;

public class Swingoperation extends JPanel {
    private JButton jcomp1;
    private JButton jcomp2;
    private JButton jcomp3;
    private JButton jcomp4;
    private JLabel jcomp5;
    private JCheckBox jcomp7;
    private JTextArea jcomp8;
    private JTextArea jcomp9;
    private JTextArea jcomp10;
    private JLabel jcomp11;
    private JCheckBox jcomp12;
    private JCheckBox jcomp13;
    private JCheckBox jcomp14;
    private JCheckBox jcomp15;
    private JCheckBox jcomp16;
    private JCheckBox jcomp17;

    public Swingoperation() {


        jcomp1 = new JButton ("Cancel");
        jcomp2 = new JButton ("Setup");
        jcomp3 = new JButton ("Help");
        jcomp4 = new JButton ("Ok");
        jcomp5 = new JLabel ("PrintQuality");
        jcomp7 = new JCheckBox ("PrintToFile");
        jcomp8 = new JTextArea (5, 5);
        jcomp9 = new JTextArea (5, 5);
        jcomp10 = new JTextArea (5, 5);
        jcomp11 = new JLabel ("Printer:MyPrinter");
        jcomp12 = new JCheckBox ("Image");
        jcomp13 = new JCheckBox ("Text");
        jcomp14 = new JCheckBox ("Code");
        jcomp15 = new JCheckBox ("Selection");
        jcomp16 = new JCheckBox ("all");
        jcomp17 = new JCheckBox ("Applient");


        setPreferredSize (new Dimension (562, 224));
        setLayout (null);

        
        add (jcomp1);
        add (jcomp2);
        add (jcomp3);
        add (jcomp4);
        add (jcomp5);
        add (jcomp7);
        add (jcomp8);
        add (jcomp9);
        add (jcomp10);
        add (jcomp11);
        add (jcomp12);
        add (jcomp13);
        add (jcomp14);
        add (jcomp15);
        add (jcomp16);
        add (jcomp17);
        jcomp1.setBounds (435, 50, 100, 50);
        jcomp2.setBounds (435, 100, 100, 50);
        jcomp3.setBounds (435, 150, 100, 50);
        jcomp4.setBounds (435, 0, 100, 50);
        jcomp5.setBounds (40, 180, 100, 25);
        jcomp7.setBounds (290, 180, 100, 25);
        jcomp8.setBounds (20, 45, 100, 100);
        jcomp9.setBounds (350, 40, 73, 100);
        jcomp10.setBounds (185, 50, 65, 95);
        jcomp11.setBounds (40, 10, 100, 25);
        jcomp12.setBounds (120, 65, 100, 25);
        jcomp13.setBounds (120, 90, 100, 25);
        jcomp14.setBounds (120, 115, 100, 25);
        jcomp15.setBounds (260, 55, 100, 25);
        jcomp16.setBounds (260, 85, 100, 25);
        jcomp17.setBounds (260, 115, 100, 25);
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Swingoperation());
        frame.pack();
        frame.setVisible (true);
    }
}

