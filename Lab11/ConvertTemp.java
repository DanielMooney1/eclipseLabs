package Lab11;

//Converts a Fahrenheit temperature entered by the user to Celsius, or vice versa
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConvertTemp extends JFrame {
	
    private JTextField fahrenField = new JTextField();
	private JTextField celsiusField = new JTextField();
	
	// Constructor
	public <ActionEvent> ConvertTemp(String title)	{
		// Set title for frame and choose layout
		super(title);
		getContentPane().setLayout(new GridLayout(2, 2));

		// Add Fahrenheit label and text field to frame
		add(new JLabel("Fahrenheit"));
		add(fahrenField);
		// Attach listener to text field
		celsiusField.addActionListener(new CelsiusListener());
 
		fahrenField.addActionListener(new FahrenheitListener());
    
    
        add(new JLabel("Celsius"));
		add(celsiusField);

		// Attach window listener
		addWindowListener(new WindowCloser());
	}

	class FahrenheitListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String s = fahrenField.getText();
			Double f = Double.parseDouble(s);
			double C = (f - 32)*5 / 9;
			C = Math.rint(C*100.0)/100.0;
			celsiusField.setText("" + C);
		}	
	}//end costructor
	class CelsiusListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String s = celsiusField.getText();
			Double f = Double.parseDouble(s);
			double C = (f - 9.)/5.0+32;
			celsiusField.setText("" + C);
		}

	// Listener for window
	class WindowCloser extends WindowAdapter {
		public void windowClosing(WindowEvent evt) {
			System.exit(0);
		}
	}
	}
}//end class
