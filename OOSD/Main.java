package OOSD;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("TablesMenu");
		frame.setBounds(100, 100, 513, 331);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Customer table");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  Customer second = new Customer();
              second.show();
			}
		});
		btnNewButton.setBounds(88, 34, 292, 50);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Invoice table");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Invoice first = new Invoice();
              first.show();
			}
		});
		btnNewButton_1.setBounds(88, 106, 292, 56);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Product table");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Product third = new Product();
              third.show();
			}
		});
		btnNewButton_2.setBounds(88, 182, 292, 56);
		frame.getContentPane().add(btnNewButton_2);
	}

}