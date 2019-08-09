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

public class Controls1 {

	private JFrame frame;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		
		textField = new JTextField();
		textField.setBounds(105, 107, 365, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String text=textField.getText();
				JOptionPane.showMessageDialog(null, text);
			}
		});
		btnNewButton.setBounds(238, 187, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JRadioButton FemalRb = new JRadioButton("Female");
		FemalRb.setSelected(true);
		buttonGroup.add(FemalRb);
		FemalRb.setBounds(60, 249, 109, 23);
		frame.getContentPane().add(FemalRb);
		
		JRadioButton MaleRb = new JRadioButton("Male");
		buttonGroup.add(MaleRb);
		MaleRb.setBounds(60, 288, 109, 23);
		frame.getContentPane().add(MaleRb);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(MaleRb.isSelected())
				{
					JOptionPane.showMessageDialog(null, "male");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "female");
				}
			}
		});
		btnNewButton_1.setBounds(55, 349, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JCheckBox th = new JCheckBox("Thukpa");
		th.setBounds(306, 249, 97, 23);
		frame.getContentPane().add(th);
		
		JCheckBox ch = new JCheckBox("Chowmien");
		ch.setBounds(306, 288, 97, 23);
		frame.getContentPane().add(ch);
		
		JCheckBox mo = new JCheckBox("momo");
		mo.setBounds(306, 331, 97, 23);
		frame.getContentPane().add(mo);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
								
				StringBuilder sb= new StringBuilder();
				
				
				ArrayList<String> items= new ArrayList<String>();
			
				String comma="";
				
				if(ch.isSelected())
				{
					sb.append("Chowmien");
					items.add("Chowmien");
				}
				if(mo.isSelected())
				{
					sb.append("MoMo");
					items.add("MoMo");
				}
				if(th.isSelected())
				{
					sb.append("Thukpa");
					items.add("Thukpa");
				}
				
				StringBuilder sb1= new StringBuilder();
				int count=items.size();
				int x=0;
				for (String item : items) {
					x++;
					sb1.append(item);
					
					comma=count>1  ?   ","  : ".";
					
					if(count>1)
					{
						comma=";";
					}
					else
					{
						comma="";
					}
					
					if(x==count)
					{
						comma=".";
					}
					sb1.append(comma);
				}
				String msg="You have ordered "+sb1.toString();
				JOptionPane.showMessageDialog(null, msg);
			}
		});
		btnNewButton_2.setBounds(306, 383, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}
