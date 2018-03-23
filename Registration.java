import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Color;
 

public class Registration extends JFrame implements ActionListener
{
	JLabel l = new JLabel("Please fillup the page carefully for registration ");
	JLabel l1 = new JLabel("First Name : ");
	JLabel l2 = new JLabel("Larst Name : ");
	JLabel l3 = new JLabel("Email : ");
	JLabel l4 = new JLabel("User Name : ");
	JLabel l5 = new JLabel("Mobile Number : ");
	JLabel l6 = new JLabel("Password : ");
	JLabel l7 = new JLabel("Re-Enter Password :");
	JLabel l8 = new JLabel("Gender : ");
	
	JButton backL = new JButton("Back");
	
	JLabel g = new JLabel("Gender");
	JRadioButton r1 = new JRadioButton("Male");
	JRadioButton r2 = new JRadioButton("Female");
	
	
	JTextField tf1 = new JTextField();
	JTextField tf2 = new JTextField();
	JTextField tf3 = new JTextField();
	JTextField tf4 = new JTextField();
	JTextField tf5 = new JTextField();
	JTextField tf6 = new JTextField();
	JTextField tf7 = new JTextField();
	
	JButton submit = new JButton("Submit");
	JButton reset = new JButton("Reset");
	
	//String Gender[] = {"Male","Female","None"};
	//JComboBox cb = new JComboBox(Gender);
	
	
	public Registration()
	{
		setSize(600,800);
		
		setTitle("Registation");
		
		l.setBounds(50,80,300,30);
		add(l);
		l1.setBounds(50,130,100,30);
		add(l1);
		tf1.setBounds(200,130,200,30);
		add(tf1);
		
		l2.setBounds(50,180,100,30);
		add(l2);
		tf2.setBounds(200,180,200,30);
		add(tf2);
		
		g.setBounds(50,230,100,30);
		add(g);
		
		r1.setBounds(200,230,80,30);
		r2.setBounds(330,230,80,30);
		
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		add(r1);
		add(r2);
		
	
		
		l3.setBounds(50,280,100,30);
		add(l3);
		tf3.setBounds(200,280,200,30);
		add(tf3);
		
		l4.setBounds(50,330,100,30);
		add(l4);
		tf4.setBounds(200,330,200,30);
		add(tf4);
		
		l5.setBounds(50,380,100,30);
		add(l5);
		tf5.setBounds(200,380,200,30);
		add(tf5);
		
		l6.setBounds(50,430,100,30);
		add(l6);
		tf6.setBounds(200,430,200,30);
		add(tf6);
		
		l7.setBounds(50,480,130,30);
		add(l7);
		tf7.setBounds(200,480,200,30);
		add(tf7);
		
		backL.setBounds(100,530,70,40);
		add(backL);
		backL.addActionListener(this);
		
		submit.setBounds(200,530,100,40);
		add(submit);
		
		reset.setBounds(400,530,100,40);
		add(reset);
		
		submit.addActionListener(this);
		reset.addActionListener(this);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(null);
		setVisible(true);
		
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String gender = null;
		if(e.getSource() == submit) // radio button
		{
			if(r1.isSelected())
			{
				gender = "Male";
			}
			else if(r2.isSelected())
			{
				gender = "Female";
			}
			
			
			//JOptionPane.showMessageDialog(this,gender);
			
			String n1 = tf1.getText();
			String n2 = tf2.getText();
			String n3 = tf3.getText();
			String n4 = tf4.getText();
			String n5 = tf5.getText();
			String n6 = tf6.getText();
			String n7 = tf7.getText();
			
			//for insert information
			
			try{
				System.out.println("actionPerformed successfully");
				
				Class.forName("com.mysql.jdbc.Driver");
				
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
				
				Statement stmt = con.createStatement();
				stmt.executeUpdate("INSERT INTO info VALUES ('"+n1+"','"+n2+"', '"+gender+"' , '"+n3+"','"+n4+"','"+n5+"','"+n6+"','"+n7+"')");
				
				JOptionPane.showMessageDialog(this,"Successfully inserted !");
				con.close();
			}
			catch(Exception exp){System.out.println(exp);}
			
			
		}
		
		else if(e.getSource() == reset )
		{	
			tf1.setText(null);
			tf2.setText(null);
			tf3.setText(null);
			tf4.setText(null);
			tf5.setText(null);
			tf6.setText(null);
			tf7.setText(null);
			
		}
		
		else if(e.getSource() == backL )
		{
			//Library lib = new Library();
			Library lb = new Library();
			setVisible(false);
		}
			
	}
	
	
	
	public static void main(String args[]){
			
		Registration reg = new Registration();	  
	}  
}