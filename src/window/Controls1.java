package window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;

public class Controls1 {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Controls1 window = new Controls1();
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
	public Controls1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 677, 598);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 629, 537);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("New tab", null, panel, null);
		panel.setLayout(null);
		
		JButton button = new JButton("New button");
		button.setBounds(184, 0, 89, 23);
		panel.add(button);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(103, 63, 365, 31);
		panel.add(textField);
		
		JRadioButton radioButton = new JRadioButton("Female");
		radioButton.setSelected(true);
		radioButton.setBounds(103, 205, 109, 23);
		panel.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Male");
		radioButton_1.setBounds(103, 244, 109, 23);
		panel.add(radioButton_1);
		
		JButton button_1 = new JButton("New button");
		button_1.setBounds(98, 305, 89, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton("New button");
		button_2.setBounds(281, 143, 89, 23);
		panel.add(button_2);
		
		JCheckBox checkBox = new JCheckBox("Thukpa");
		checkBox.setBounds(349, 205, 97, 23);
		panel.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("Chowmien");
		checkBox_1.setBounds(349, 244, 97, 23);
		panel.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("momo");
		checkBox_2.setBounds(349, 287, 97, 23);
		panel.add(checkBox_2);
		
		JButton button_3 = new JButton("New button");
		button_3.setBounds(349, 339, 89, 23);
		panel.add(button_3);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
	}
}
