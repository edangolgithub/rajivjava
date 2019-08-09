package window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Window1 {

	private JFrame frame;
	private final JButton btnNewButton_2 = new JButton("New button");
	private JTextField numtxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window1 window = new Window1();
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
	public Window1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(107, 142, 35));
		frame.setBounds(100, 100, 689, 612);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(366, 212, 120, 146);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				int a= Integer.parseInt(numtxt.getText());
				
				
				if(a%2==0)
				{
					JOptionPane.showMessageDialog(null, "even");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "odd");
				}
			}catch(NumberFormatException ex)
				{
				JOptionPane.showMessageDialog(null, "check input only numbers alowed");
				}
			}
		});
		btnNewButton_1.setBounds(260, 144, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_2.addActionListener(new Sfds());
			
		btnNewButton_2.setBounds(88, 81, 120, 31);
		frame.getContentPane().add(btnNewButton_2);
		
		numtxt = new JTextField();
		numtxt.setBounds(260, 81, 272, 52);
		frame.getContentPane().add(numtxt);
		numtxt.setColumns(10);
	}
}
