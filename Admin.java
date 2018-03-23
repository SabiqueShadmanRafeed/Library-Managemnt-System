import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

import java.sql.*;

public class Admin extends JFrame implements ActionListener
{
	private String name;
	private String pass;
	
	//search
	
	JFrame sf = new JFrame();   // search panel 
	JFrame df = new JFrame();   // book delete panel 
	JFrame UF = new JFrame();	//update panel 
	
	JButton back = new JButton("Back");
	JButton Logout = new JButton("Log out");
	JButton backInsert = new JButton("Back");
	JButton backDelete = new JButton("Back");
	JButton backUpdate = new JButton("Back");
	
	
	    JLabel searchId = new JLabel("ID");
		JLabel searchName = new JLabel("Name");
		JLabel searchAuthor = new JLabel("Author");
		JLabel searchEdition = new JLabel("Edition");
		JLabel searchSub = new JLabel("Subject");
		JLabel searchTotal = new JLabel("Total Copy");
		JLabel searchAvailable = new JLabel("Available Copy");
		JLabel searchShelf = new JLabel("Shelf");
	
	JLabel searchR = new JLabel("Searched result :");
	JLabel BookIdtf = new JLabel(" ");
	JLabel BookNametf = new JLabel(" ");
	JLabel BookAuthortf = new JLabel(" ");
	JLabel BookEditiontf = new JLabel(" ");
	JLabel BookSubtf = new JLabel(" ");
	JLabel BookTotaltf = new JLabel(" ");
	JLabel BookAvailabletf = new JLabel(" ");
	JLabel BookShelftf = new JLabel(" ");
	
	
	JFrame inf = new JFrame(); 				//insert panel to insert books 
	
	JLabel welcome = new JLabel("ADMIN PANEL ");
	JLabel search = new JLabel("Search Book :");
	JLabel insert = new JLabel("Insert :");
	JLabel update = new JLabel("Update :");
	JLabel delete = new JLabel("Delete :");
	JLabel issue = new JLabel("Book issue :");
	JLabel returnbook = new JLabel("Return book :");
	
	JTextField searchf = new JTextField();
	JTextField insertf = new JTextField();
	JTextField updatef = new JTextField();
	JTextField deletef = new JTextField();
	JTextField issuef = new JTextField();
	JTextField returnbookf = new JTextField(); 
	
	JButton inb = new JButton("Submit"); //insert 
	
	// Admin Panel Button 
	JButton searchb = new JButton("Search");
	JButton insertb = new JButton("Insert");
	JButton updateb = new JButton("Update");
	JButton deleteb = new JButton("Delete");
	JButton issueb = new JButton("Issue");
	JButton returnbookb = new JButton("Return");
	
	
	// insert panel label 
	    JLabel inLid = new JLabel("ID :");
		JLabel inLname = new JLabel("Name :");
		JLabel inLauthor = new JLabel("Author :");
		JLabel inLedition = new JLabel("Edition :");
		JLabel inLsub = new JLabel("Subject :");
		JLabel inLtotal = new JLabel("Total Copy :");
		JLabel inLavailable = new JLabel("Available Copy :");
		JLabel inshelf = new JLabel("Shelf");
		
	    JTextField inidf = new JTextField();
	    JTextField innamef = new JTextField();
	    JTextField inauthorf = new JTextField();
	    JTextField ineditionf = new JTextField();
	    JTextField insubf = new JTextField();
	    JTextField intotalf = new JTextField();
	    JTextField inavailablef = new JTextField();
		JTextField inshelff = new JTextField();//INSERT
		
		
		//delete 
		
		JLabel dl1 = new JLabel("Book id :");
		JLabel dl2 = new JLabel("Book name :");
		
		JTextField dtf1 = new JTextField();
		JTextField dtf2 = new JTextField();
		
		JButton db = new JButton("Delete");
		// delete
		
		
		// update
		
		JLabel updateId = new JLabel("ID :");
		JLabel updateName = new JLabel("Name :");
		JLabel updateAuthor = new JLabel("Author :");
		JLabel updateEdition = new JLabel("Edition :");
		JLabel updateSub = new JLabel("Subject :");
		JLabel updateTotal = new JLabel("Total Copy :");
		JLabel updateAvailable = new JLabel("Available Copy :");
		JLabel updateShelf = new JLabel("Shelf");
		JLabel updateFind = new JLabel("Insert 'Book Id and Book name' that you want to update  ");
		JLabel updateBookId = new JLabel("Book Id :");
		JLabel updateBookName = new JLabel("Book Name :");
		
		JTextField updateIdF = new JTextField();
	    JTextField updateNameF = new JTextField();
	    JTextField updateAuthorF = new JTextField();
	    JTextField updateEditionF = new JTextField();
	    JTextField updateSubF = new JTextField();
	    JTextField updateTotalF = new JTextField();
	    JTextField updateAvailableF = new JTextField();
		JTextField updateShelfF = new JTextField();
		JTextField updateBookIdF = new JTextField();
		JTextField updateBookNameF = new JTextField();
		
		JButton uAouthorFindB = new JButton("Find");
		JButton updateB = new JButton("Confirm");
		
		JButton sb = new JButton("Search");
		
	
	
	
	public Admin()		//admin panel 
	{
		
		setSize(1400,800);
		
		welcome.setBounds(300,30,300,30);
		add(welcome);
		
		searchb.setBounds(80,80,80,30);
		add(searchb);
		searchb.addActionListener(this);
		
		insertb.setBounds(170,80,80,30);
		add(insertb);
		insertb.addActionListener(this);
		
		updateb.setBounds(260,80,80,30);
		add(updateb);
		updateb.addActionListener(this);
		
		deleteb.setBounds(350,80,80,30);
		add(deleteb);
		deleteb.addActionListener(this);
		
		/*
		issueb.setBounds(440,80,80,30);
		add(issueb);
		issueb.addActionListener(this);
		
		returnbookb.setBounds(530,80,80,30);
		add(returnbookb);
		returnbookb.addActionListener(this);
		*/
		
		getContentPane().setBackground(Color.green);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == searchb)
		{
			searchBook();   // open search panel
		}
		else if(ae.getSource() == sb )
		{
			serchResults();   //method to search book from database
		}
		else if(ae.getSource() == insertb)
		{
			insertBook(); //
		}
		else if(ae.getSource() == updateb)
		{
			updateBook();//
		}
		else if(ae.getSource() == deleteb)
		{
			deleteBook();//
		}
		//else if(ae.getSource() == issueb)
		//{
		//	issueBook();
		//}
		//else if(ae.getSource() == returnbookb)
		//{
		//	returnBook();
		//}
		else if(ae.getSource() == inb )
		{
			insertValues();
		}
		else if(ae.getSource() == db )
		{
			deleteValues();
		}
		else if(ae.getSource() == updateB )
		{
			updateValues();
		}
		else if(ae.getSource() == uAouthorFindB )
		{
			//searchBook();
		}
		else if(ae.getSource() == back )
		{
			back();
			sf.setVisible(false);
		}
		else if(ae.getSource() == backInsert)
		{
			back();
			inf.setVisible(false);
		}
		else if(ae.getSource() == backDelete)
		{
			back();
			df.setVisible(false);
		}
		else if(ae.getSource() == backUpdate)
		{
			back();
			UF.setVisible(false);
		}
		else if(ae.getSource() == Logout)
		{
		
			sf.setVisible(false);
			Login l=new Login();
		}
		
		
		
	}
	
	
	public void back()   // go back to admin panel 
	{
		setSize(700,800);
		
		welcome.setBounds(300,30,300,30);
		add(welcome);
		
		searchb.setBounds(80,80,80,30);
		add(searchb);
		searchb.addActionListener(this);
		
		insertb.setBounds(170,80,80,30);
		add(insertb);
		insertb.addActionListener(this);
		
		updateb.setBounds(260,80,80,30);
		add(updateb);
		updateb.addActionListener(this);
		
		deleteb.setBounds(350,80,80,30);
		add(deleteb);
		deleteb.addActionListener(this);
		
		/*
		issueb.setBounds(440,80,80,30);
		add(issueb);
		issueb.addActionListener(this);
		
		returnbookb.setBounds(530,80,80,30);
		add(returnbookb);
		returnbookb.addActionListener(this);
		*/
		
		getContentPane().setBackground(Color.green);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
		
	}
	
	
	public void searchBook() // search panel method
	{
		
		
		sf.setSize(1400,700);
		sf.setTitle("Search book window");
		
		search.setBounds(40,60,140,30);
		sf.add(search);
		searchf.setBounds(200,60,300,30);
		sf.add(searchf);
		
		sb.setBounds(530,60,80,30);
		sf.add(sb);
		sb.addActionListener(this);
		
		back.setBounds(650,60,80,30);
		sf.add(back);
		back.addActionListener(this);
		
		
		searchR.setBounds(40,110,200,30);
		sf.add(searchR);
		
		
		searchId.setBounds(30,160,100,30);
		sf.add(searchId);
		
		searchName.setBounds(145,160,200,30);
		sf.add(searchName);
		
		sf.getContentPane().setBackground(Color.green);
		
		searchAuthor.setBounds(360,160,150,30);
		sf.add(searchAuthor);
		
		searchEdition.setBounds(575,160,100,30);
		sf.add(searchEdition);
		
		searchSub.setBounds(690,160,150,30);
		sf.add(searchSub);
		
		searchTotal.setBounds(855,160,80,30);
		sf.add(searchTotal);
		
		searchAvailable.setBounds(950,160,100,30);
		sf.add(searchAvailable);
		
		searchShelf.setBounds(1045,160,80,30);
		sf.add(searchShelf);
		
		
		
		
		BookIdtf.setBounds(30,200,100,30);
		sf.add(BookIdtf);
		
		BookNametf.setBounds(145,200,200,30);
		sf.add(BookNametf);
		
		BookAuthortf.setBounds(360,200,150,30);
		sf.add(BookAuthortf);
		
		BookEditiontf.setBounds(575,200,100,30);
		sf.add(BookEditiontf);
		
		BookSubtf.setBounds(690,200,200,30);
		sf.add(BookSubtf);
		
		BookTotaltf.setBounds(855,200,80,30);
		sf.add(BookTotaltf);
		
		BookAvailabletf.setBounds(950,200,100,30);
		sf.add(BookAvailabletf);
		
		BookShelftf.setBounds(1045,200,80,30);
		sf.add(BookShelftf);
		
		
		
		
		sf.setLayout(null);
		sf.setVisible(true);
		
	
	}
	
	
	public void serchResults()   // method to search book information from database 
	{
		String bookName = searchf.getText();
		try{
				
				
				Class.forName("com.mysql.jdbc.Driver");
				
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
				
				Statement stmt = con.createStatement();
				
				ResultSet rs = stmt.executeQuery("SELECT * FROM book WHERE book_name = '"+bookName+"'");
				
				
				while(rs.next())
				{
				
					System.out.println(rs.getString("book_id") + "," + rs.getString("book_name")  );
					String bId = rs.getString("book_id");
					String bName = rs.getString("book_name");
					String bauthorName = rs.getString("author_name");
					String bEdition = rs.getString("edition");
					String bSub = rs.getString("subject");
					String bTotalCopy = rs.getString("total_copy");
					String bAvailableCopy = rs.getString("available_copy");
					String bShelf = rs.getString("shelf");
					
					BookIdtf.setText(bId);
					BookNametf.setText(bName);
					BookAuthortf.setText(bauthorName);
					BookEditiontf.setText(bEdition);
					BookSubtf.setText(bSub);
					BookTotaltf.setText(bTotalCopy);
					BookAvailabletf.setText(bAvailableCopy);
					BookShelftf.setText(bShelf);
					
					
				}
				
			
				con.close();
			}
			catch(Exception ine){System.out.println(ine);}
			
			
	}
	
	
	
	public void userBook()  // panel for users book search
	{
		
		
		sf.setSize(1400,700);
		sf.setTitle("Search book window");
		
		search.setBounds(40,60,140,30);
		sf.add(search);
		searchf.setBounds(200,60,300,30);
		sf.add(searchf);
		
		sb.setBounds(530,60,80,30);
		sf.add(sb);
		sb.addActionListener(this);
		
		Logout.setBounds(650,60,80,30);
		sf.add(Logout);
		Logout.addActionListener(this);
		
		
		searchR.setBounds(40,110,200,30);
		sf.add(searchR);
		
		
		searchId.setBounds(30,160,100,30);
		sf.add(searchId);
		
		searchName.setBounds(145,160,200,30);
		sf.add(searchName);
		
		sf.getContentPane().setBackground(Color.green);
		
		searchAuthor.setBounds(360,160,150,30);
		sf.add(searchAuthor);
		
		searchEdition.setBounds(575,160,100,30);
		sf.add(searchEdition);
		
		searchSub.setBounds(690,160,150,30);
		sf.add(searchSub);
		
		searchTotal.setBounds(855,160,80,30);
		sf.add(searchTotal);
		
		searchAvailable.setBounds(950,160,100,30);
		sf.add(searchAvailable);
		
		searchShelf.setBounds(1045,160,80,30);
		sf.add(searchShelf);
		
		
		
		
		BookIdtf.setBounds(30,200,100,30);
		sf.add(BookIdtf);
		
		BookNametf.setBounds(145,200,200,30);
		sf.add(BookNametf);
		
		BookAuthortf.setBounds(360,200,150,30);
		sf.add(BookAuthortf);
		
		BookEditiontf.setBounds(575,200,100,30);
		sf.add(BookEditiontf);
		
		BookSubtf.setBounds(690,200,200,30);
		sf.add(BookSubtf);
		
		BookTotaltf.setBounds(855,200,80,30);
		sf.add(BookTotaltf);
		
		BookAvailabletf.setBounds(950,200,100,30);
		sf.add(BookAvailabletf);
		
		BookShelftf.setBounds(1045,200,80,30);
		sf.add(BookShelftf);
		
		
		
		
		sf.setLayout(null);
		sf.setVisible(true);
		
	
	}
	
	
	public void insertBook()  //insert book information panel 
	{
		
		inf.setSize(700,800);
		//getContent().setBackground(Color.gray);
		inf.setTitle("Insert value into book database table");
		
		JLabel inl = new JLabel("Please insert value in  each of the below textfield");
		
		
		
		
		
		inl.setBounds(200,20,400,30);
		inf.add(inl);
		
		inLid.setBounds(30,50,70,30);
		inf.add(inLid);
		inidf.setBounds(110,50,300,30);
		inf.add(inidf);
		
		inLname.setBounds(30,100,70,30);
		inf.add(inLname);
		innamef.setBounds(110,100,300,30);
		inf.add(innamef);
		
		inLauthor.setBounds(30,150,70,30);
		inf.add(inLauthor);
		inauthorf.setBounds(110,150,300,30);
		inf.add(inauthorf);
		
		inLedition.setBounds(30,200,70,30);
		inf.add(inLedition);
		ineditionf.setBounds(110,200,300,30);
		inf.add(ineditionf);
		
		inLsub.setBounds(30,250,70,30);
		inf.add(inLsub);
		insubf.setBounds(110,250,300,30);
		inf.add(insubf);
		
		inLtotal.setBounds(30,300,70,30);
		inf.add(inLtotal);
		intotalf.setBounds(110,300,300,30);
		inf.add(intotalf);
		
		inLavailable.setBounds(25,350,85,30);
		inf.add(inLavailable);
		inavailablef.setBounds(110,350,300,30);
		inf.add(inavailablef);
		
		inshelf.setBounds(30,400,70,30);
		inf.add(inshelf);
		inshelff.setBounds(110,400,300,30);
		inf.add(inshelff);
		
		inb.setBounds(320,440,90,30);
		inf.add(inb);
		inb.addActionListener(this);
		
		backInsert.setBounds(210,440,90,30);
		inf.add(backInsert);
		backInsert.addActionListener(this);
		
		
		
		inf.setLayout(null);
		inf.setVisible(true);
		
		
	}
	
	public void insertValues()  // method to insert book information in database 
		{
			
			
		    String id = inidf.getText();
			String name = innamef.getText();
			String author = inauthorf.getText();
			String edition = ineditionf.getText();
			String sub = insubf.getText();
			String total = intotalf.getText();
			String available = inavailablef.getText();
			String shelf = inshelff.getText();
			
			
			
			try{
				System.out.println("actionPerformed successfully");
				
				Class.forName("com.mysql.jdbc.Driver");
				
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
				
				Statement stmt = con.createStatement();
				stmt.executeUpdate("INSERT INTO book VALUES ('"+ id+"' , '"+name +"' , '"+ author+"' , '"+ edition+"' , '"+ sub+"' , '"+ total+"' , '"+ available+"', '"+shelf+"' )");
				
				JOptionPane.showMessageDialog(this,"Successfully inserted !");
				con.close();
			}
			catch(Exception ine){System.out.println(ine);}
		
		}
		
		public void deleteBook()    //  delete panel 
		{
			
			JLabel delb = new JLabel("For delating a book , please insert book id and book name ");
			
			df.setSize(600,700);
			
			delb.setBounds(50,30,400,40);
			df.add(delb);
			
			dl1.setBounds(50,80,80,30);
			df.add(dl1);
			dtf1.setBounds(150,80,300,30);
			df.add(dtf1);
			
			dl2.setBounds(50,130,80,30);
			df.add(dl2);
			dtf2.setBounds(150,130,300,30);
			df.add(dtf2);
			
			db.setBounds(370,170,80,30);
			df.add(db);
			db.addActionListener(this);
			
			backDelete.setBounds(270,170,80,30);
			df.add(backDelete);
			backDelete.addActionListener(this);
			
			df.setLayout(null);
			df.setVisible(true);
			
		}
	
	
	public void deleteValues()  // // method for deleting book from database
	{
		String dbBookId = dtf1.getText();
		String dbBookName = dtf2.getText();
		
		try{
				Class.forName("com.mysql.jdbc.Driver");
				
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
				
				Statement stmt = con.createStatement();
				stmt.executeUpdate("DELETE FROM book WHERE book_id = '"+dbBookId+"'  AND book_name = '"+dbBookName+"' ");
				
				con.close();
			}
			catch(Exception ine){System.out.println(ine);}
		
		JOptionPane.showMessageDialog(this,"This book information is successfully deleted");
	}
	
	public void updateBook()    //  update panel 
	{
		JFrame UF = new JFrame();
		UF.setSize(1400,700);
		//getContent().setBackground(Color.gray);
		UF.setTitle("Update value(s) into book database table");
		
		JLabel updateL = new JLabel("Please inser value for which you want to update of the bellow textfield and that you do not want to update write 'non'");
		
		
		
		
		
		updateFind.setBounds(30,20,700,30);
		UF.add(updateFind);
		
		updateBookId.setBounds(30,60,100,30);
		UF.add(updateBookId);
		updateBookIdF.setBounds(150,60,300,30);
		UF.add(updateBookIdF);
		
		updateBookName.setBounds(30,110,100,30);
		UF.add(updateBookName);
		updateBookNameF.setBounds(150,110,300,30);
		UF.add(updateBookNameF);
		
		uAouthorFindB.setBounds(360,140,80,30);
		UF.add(uAouthorFindB);
		uAouthorFindB.addActionListener(this);
		
		updateId.setBounds(30,250,70,30);
		UF.add(updateId);
		updateIdF.setBounds(130,250,300,30);
		UF.add(updateIdF);
		
		updateName.setBounds(30,300,70,30);
		UF.add(updateName);
		updateNameF.setBounds(130,300,300,30);
		UF.add(updateNameF);
		
		updateAuthor.setBounds(30,350,70,30);
		UF.add(updateAuthor);
		updateAuthorF.setBounds(130,350,300,30);
		UF.add(updateAuthorF);
		
		updateEdition.setBounds(30,400,70,30);
		UF.add(updateEdition);
		updateEditionF.setBounds(130,400,300,30);
		UF.add(updateEditionF);
		
		updateSub.setBounds(30,450,70,30);
		UF.add(updateSub);
		updateSubF.setBounds(130,450,300,30);
		UF.add(updateSubF);
		
		updateTotal.setBounds(30,500,70,30);
		UF.add(updateTotal);
		updateTotalF.setBounds(130,500,300,30);
		UF.add(updateTotalF);
		
		updateAvailable.setBounds(30,550,100,30);
		UF.add(updateAvailable);
		updateAvailableF.setBounds(130,550,300,30);
		UF.add(updateAvailableF);
		
		updateShelf.setBounds(30,600,70,30);
		UF.add(updateShelf);
		updateShelfF.setBounds(130,600,300,30);
		UF.add(updateShelfF);
		
		updateB.setBounds(320,630,90,30);
		UF.add(updateB);
		updateB.addActionListener(this);
		
		backUpdate.setBounds(220,630,90,30);
		UF.add(backUpdate);
		backUpdate.addActionListener(this);
		
		
		UF.setLayout(null);
		UF.setVisible(true);
		
		
	}
	
	public void updateValues() // method to update book information in database
	{
		String uId = updateIdF.getText();
		String uName = updateNameF.getText();
		String uAouthor = updateAuthorF.getText();
		String uEdition = updateEditionF.getText();
		String uSub = updateSubF.getText();
		String uTotal = updateTotalF.getText();
		String uAvailable = updateAvailableF.getText();
		String uShelf = updateShelfF.getText();
		
		String uid = updateBookIdF.getText();
		String uname = updateBookNameF.getText();
		
		
		
		
		try{
				Class.forName("com.mysql.jdbc.Driver");
				
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
				
				Statement stmt = con.createStatement();
				stmt.executeUpdate("UPDATE book SET book_id = '"+uId+"', book_name = '"+uName+"', author_name = '"+uAouthor+"', edition = '"+uEdition+"', subject = '"+uSub+"', total_copy = '"+uTotal+"', available_copy = '"+uAvailable+"',  shelf = '"+uShelf+"' WHERE book_id = '"+uid+"' AND book_name = '"+uname+"' ");;
				
				con.close();
			}
			catch(Exception ine){System.out.println(ine);}
	
		JOptionPane.showMessageDialog(this,"Book information is successfully updated !");
	}
	
	/*
	public void issueBook()
	{
		
		JOptionPane.showMessageDialog(this,"Book issue is done. Thanks ");
	}
	public void returnBook()
	{
		
		JOptionPane.showMessageDialog(this,"Book return is done. Thanks ");
	}
	*/
	
	public static void main(String[]args)
	{
		new Admin();
		
	}
}