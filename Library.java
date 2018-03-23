import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Library extends JFrame implements ActionListener
{
	//JFrame flogin = new JFrame();
	JLabel ln= new JLabel("LIBRARY MANAGEMENT SYSTEM");
	JLabel lr = new JLabel("If not a member yet then register");
	JButton register = new JButton("Registration");
	JButton log = new JButton("Login");
	
	public Library()
	{
		setSize(600,600);
		
		add(ln);
		ln.setBounds(160,20,300,60);
		
		lr.setBounds(50,80,500,50);
		add(lr);
		
		register.setBounds(100,130,110,30);
		add(register);
		register.addActionListener(this);
		
		log.setBounds(230,130,80,30);
		add(log);
		log.addActionListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.orange);
		setLayout(null);
		setVisible(true);
		
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == register)
		{
			
			 new Registration();
		}
		
		if(e.getSource() == log)
		{
	
			new Login();
			System.out.println("login performed successfully");
		}
		
	}
	
	public static void main(String[]args)
	{
		Library library = new Library();
	}
}