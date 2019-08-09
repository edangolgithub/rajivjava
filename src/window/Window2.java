package window;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;import javax.swing.event.ListDataListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Window2 extends JFrame {

	private JPanel contentPane;
	JComboBox<String> cb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window2 frame = new Window2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Window2() {
		cb= new JComboBox<String>();
		cb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
			System.out.println(cb.getSelectedItem());
			if(cb.getSelectedItem()=="default")
			{
				contentPane.setBackground(null);
			}
			else if(cb.getSelectedItem()=="red")
		{
				contentPane.setBackground(Color.red);
		}
			else if(cb.getSelectedItem()=="blue")
			{
				contentPane.setBackground(Color.blue);
			}
			else if(cb.getSelectedItem()=="green")
			{
				contentPane.setBackground(Color.green);
			}
			}
		});
		String[] list= {"Default","red","blue","green"};
		cb.setModel(new DefaultComboBoxModel<String>(list));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		cb.setBounds(0, 0, 200, 30);
		contentPane.add(cb);
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				NewFrame f= new NewFrame();
				f.call();
			}
		});
		btnNewButton.setBounds(273, 187, 89, 23);
		contentPane.add(btnNewButton);
	}

}
