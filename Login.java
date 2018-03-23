import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.applet.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener
{
	JLabel L1 = new JLabel("Username : ");
	JLabel L2 = new JLabel("Password : ");
	
	JTextField Ltf1 = new JTextField();
	//JTextField Ltf2 = new JTextField();
    JPasswordField Ltf2=new JPasswordField();
	int i=0;
	
	
	JButton Lb = new JButton("Login");
	
	public Login()
	{
		
		setSize(700,700);
		setTitle("Login");
		
		L1.setBounds(50,80,100,30);
		add(L1);
		Ltf1.setBounds(130,80,160,30);
		add(Ltf1);
		
		L2.setBounds(50,130,100,30);
		add(L2);
		Ltf2.setBounds(130,130,160,30);
		add(Ltf2);
		Ltf2.setEchoChar('*');         /// show * in password
		Lb.setBounds(200,170,80,20);
		add(Lb);
		Lb.addActionListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(null);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent le)
	{
		String user_Name = Ltf1.getText();
		String user_Pass = new String(Ltf2.getPassword());
		String username = null;
		String userpass = null;
		
		try{
				
				i=0;
				Class.forName("com.mysql.jdbc.Driver");
				
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
				
				Statement stmt = con.createStatement();
				String sql="select* from info where user_name='"+user_Name+"'  and password='"+user_Pass +"'";
				ResultSet rs = stmt.executeQuery(sql);
				
				
				while(rs.next())
				{
				
				    String name=rs.getString("user_name");
					if(name.equals("shohrab"))				//checking admin 
						i=3;
					
					i++;
					
				}
				System.out.println(i);
				if(i==1 )
				{
					JOptionPane.showMessageDialog(this,"Login Succesfull");
					Admin a=new Admin(); // enter student  search panel
					a.userBook();	
				
				}
				else if(i==0)
				{
					JOptionPane.showMessageDialog(this,"Invalid username or password");
					
				}
				else if(i==4)
				{
					Admin b=new Admin();   // enter admin panel 
					
				}
						
			
				con.close();
			}
			catch(Exception ine){System.out.println(ine);}
			
		
		
		
		//System.out.println("actionPerformed done");
	}
	
	
	public static void main(String[]args)
	{
		new Login();
	}
	
}