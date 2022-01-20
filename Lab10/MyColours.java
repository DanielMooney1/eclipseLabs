package Lab10;
import java.awt.event.*;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyColours {
    
    public static void main(String[] args) {
	
		ChangeColour changeColour = new ChangeColour("Button");
		changeColour.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		changeColour.setSize(200, 200);
		changeColour.setVisible(true);

    }
}
     class ChangeColour extends JFrame {

		public ChangeColour(String title) {
		    // Set title, layout, and background colour
		    super(title);
		    setLayout(new FlowLayout());
		    getContentPane().setBackground(Color.gray);
		
		    // Create button listener
		    ButtonListener listener = new ButtonListener();
		
		    // Add "Lighter" button to frame and attach listener
		    JButton b = new JButton("Lighter");
		    add(b);
		    b.addActionListener(listener);
		
		    // Add "Darker" button to frame and attach listener
		    b = new JButton("Darker");
		    add(b);
		    b.addActionListener(listener);

			JButton a = new JButton("Blue");
		    add(a);
		    a.addActionListener(listener);

			JButton C = new JButton("Red");
		    add(C);
		    C.addActionListener(listener);

			JButton D = new JButton("Green");
		    add(D);
		    D.addActionListener(listener);
		
		    // Attach window listener
		    addWindowListener(new WindowCloser());
		}//end constructor
		
		// Listener for both buttons
		class ButtonListener implements ActionListener {
			public void actionPerformed(ActionEvent evt) {
				Color currentBackground =  getContentPane().getBackground();
		 		String buttonLabel = evt.getActionCommand();
	
		 		// Test label on button and change background colour
					if (buttonLabel.equals("Lighter"))
						 getContentPane().setBackground(currentBackground.brighter());
				    else
				    	 getContentPane().setBackground(currentBackground.darker());
					if(buttonLabel.equals("Blue"))
					getContentPane().setBackground(Color.BLUE);	 
					if(buttonLabel.equals("Red"))
					getContentPane().setBackground(Color.red);	 
					if(buttonLabel.equals("Green"))
					getContentPane().setBackground(Color.green);	 
				}
		}

		// Listener for window
		class WindowCloser extends WindowAdapter {
			public void windowClosing(WindowEvent evt) {
		 		System.exit(0);
			}
		}
    }



