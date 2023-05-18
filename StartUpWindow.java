package justdriveapp;

import java.awt.event.*;
import javax.swing.*;

public class StartUpWindow implements ActionListener
{
	//Create Database Class Object to access SQL
	DBClass db = new DBClass();
	
	//Create objects(instances) from Java Swing JFrame and JButton classes
	JFrame mainwindow = new JFrame("Welcome to the Driver App!");
	JButton signupbutton = new JButton("Create Account"); //or "Sign Up"
	JButton customerlogin = new JButton("Customer Sign in");
	JButton driverlogin = new JButton("Driver Log in");
	
	
	//JLabel false_customer = new JLabel ("No Account Exists in Customer Database");
	//JLabel false_driver = new JLabel ("No Account Exists in Driver Database");
	
	 public StartUpWindow()
	{
		//Window configuration 
		mainwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainwindow.setSize(250, 250);
		mainwindow.setLayout(null);
		mainwindow.setVisible(true);
	
		// window components
		
		mainwindow.add(signupbutton);
		mainwindow.add(customerlogin);
		mainwindow.add(driverlogin);
		//mainwindow.add(false_customer);
		//mainwindow.add(false_driver);
		
		// component placement bounds
		signupbutton.setBounds(45, 50, 140, 25);
		customerlogin.setBounds(45, 80, 140, 25);
		driverlogin.setBounds(45, 110, 140, 25);
		
		// Trigger action Configuration -- Open user registration form 
		signupbutton.addActionListener(this);
		customerlogin.addActionListener(this);
		driverlogin.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		//Opens a SignUpMenu window while closing the StartUp Window
		if(e.getSource() == signupbutton)
		{
			SignUpMenu signupwindow = new SignUpMenu();
			mainwindow.dispose();
		}
		
		//Should check if login information is correct (Read from SQL)
		//If found, goes to MainMenu window
		//If not found, reload 
		if(e.getSource() == customerlogin )
		{
//			if(**login info found in mySQL) {
			loginIn login = new loginIn();
			mainwindow.dispose();
//			}
//			else if(**login info not found) 
//			{
//				StartUpWindow mw2 = new StartUpWindow();
//				mainwindow.dispose();
//			}	
		}
		if(e.getSource() == driverlogin) {
//			if(**login info found in mySQL) {
			DriverLogIn driverLogIn = new DriverLogIn();
			mainwindow.dispose();
//			}
//			else if(**login info not found) 
//			{
//				StartUpWindow mw2 = new StartUpWindow();
//				mainwindow.dispose();
//			}
		}
		
	}
	
}

