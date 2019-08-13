package window;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StudentWindow {

	private JFrame frame;
	private JTable table;
	private JTextField stext;
	private JTextField atext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentWindow window = new StudentWindow();
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
	public StudentWindow() {
		initialize();
		
	}
int mid=0;
public void getselectedrow(int id) {
	
	try {
		String url="jdbc:mysql://localhost:3306/school?useSSL=false";
		String driver="com.mysql.cj.jdbc.Driver";
		Class.forName(driver); // import sql driver which is in jar file
		Connection con= DriverManager.getConnection(url,"root",""); // url for mysql database
		String sql="select * from student where studentid=?";
		
		PreparedStatement stmt= con.prepareStatement(sql);
		
		stmt.setInt(1, id);
		ResultSet result= stmt.executeQuery();
		result.next();
		String sname=result.getString("Studentname");
		int aid=result.getInt("addressid");
		int sid=result.getInt("studentid");
		
		stext.setText(sname);
		atext.setText(String.valueOf(aid));
		
		mid=sid;
		con.close();
		
		
		
		
	}catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 665, 567);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		
		scrollPane.setBounds(48, 43, 250, 370);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				int row=table.getSelectedRow();
			    int x=	(int) table.getModel().getValueAt(row, 0);
				getselectedrow(x);
			}
		});
		stext = new JTextField();
		stext.setBounds(418, 59, 198, 20);
		frame.getContentPane().add(stext);
		stext.setColumns(10);
		
		atext = new JTextField();
		atext.setBounds(418, 90, 198, 20);
		frame.getContentPane().add(atext);
		atext.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(308, 62, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblAddressId = new JLabel("Address ID");
		lblAddressId.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddressId.setBounds(308, 93, 67, 17);
		frame.getContentPane().add(lblAddressId);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try {
				String sname=stext.getText();
				int aid= Integer.parseInt(atext.getText());
				if(mid!=0)
				{
					updatedata();
				}
				else
				{
				insertdata(sname,aid);
				}
				}
				catch (Exception e) {
					System.out.println("eneter num,ber only");
				}
			}
		});
		btnSave.setBounds(418, 146, 89, 23);
		frame.getContentPane().add(btnSave);
		getdata();
	}
	
	public void getconnection()
	{
		String url="jdbc:mysql://localhost:3306/school?useSSL=false";
		String driver="com.mysql.cj.jdbc.Driver";
		
		try {
			
			Class.forName(driver); // import sql driver which is in jar file
			Connection con= DriverManager.getConnection(url,"root",""); // url for mysql database
		}catch(Exception ex)
		{
		System.out.println(ex.getMessage());	
		}
	}
	
	public void getdata()
	{
		try {
			String url="jdbc:mysql://localhost:3306/school?useSSL=false";
			String driver="com.mysql.cj.jdbc.Driver";
			Class.forName(driver); // import sql driver which is in jar file
			Connection con= DriverManager.getConnection(url,"root",""); // url for mysql database
			String sql="select * from student";
			Statement stmt= con.createStatement();
	     	ResultSet rs=	stmt.executeQuery(sql);
	     	table.setModel(DbUtils.resultSetToTableModel(rs));
	     	con.close();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public void insertdata(String sname,int aid)
	{
		try {
			String url="jdbc:mysql://localhost:3306/school?useSSL=false";
			String driver="com.mysql.cj.jdbc.Driver";
			Class.forName(driver); // import sql driver which is in jar file
			Connection con= DriverManager.getConnection(url,"root",""); // url for mysql database
			String sql="insert into student(studentname,addressid) values(?,?)";
			
			PreparedStatement stmt= con.prepareStatement(sql);
			stmt.setString(1, sname);
			stmt.setInt(2, aid);
			int result= stmt.executeUpdate();
			con.close();
			if(result==1)
			{
				JOptionPane.showMessageDialog(null, "success");
				getdata();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "problem");
			}
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public void updatedata()
	{
		try {
			if(mid==0)
			{
				throw new Exception("noithing to update");
				
			}
			String url="jdbc:mysql://localhost:3306/school?useSSL=false";
			String driver="com.mysql.cj.jdbc.Driver";
			Class.forName(driver); // import sql driver which is in jar file
			Connection con= DriverManager.getConnection(url,"root",""); // url for mysql database
			String sql="update student set studentname=?, addressid=? where studentid=?";
			
			PreparedStatement stmt= con.prepareStatement(sql);
			stmt.setString(1, stext.getText());
			stmt.setInt(2,Integer.parseInt(atext.getText()) );
			stmt.setInt(3, mid);
			int result= stmt.executeUpdate();
			con.close();
			mid=0;
			if(result==1)
			{
				JOptionPane.showMessageDialog(null, "success");
				getdata();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "problem");
			}
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
