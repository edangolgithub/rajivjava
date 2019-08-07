package window;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NewFrame {

	public static void main(String[] args) {
		
		
		JFrame frame= new JFrame();
		frame.setBounds(0, 0, 400, 400);
		JButton b= new JButton();
		frame.setLayout(null);
		b.setBounds(100, 50, 200, 30);
		b.setText("click");
		frame.add(b);
		frame.setVisible(true);

	}

}
