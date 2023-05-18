package justdriveapp;


import java.awt.event.*;
import javax.swing.*;

public class MainMenu implements ActionListener
{
	//Create objects(instances) from Java Swing J____ classes
	JFrame menuwindow = new JFrame("Driver App Main Menu");
	//JLabel label_menutitle = new JLabel("Select A Button");
	JButton menu_newreserve = new JButton("Reserve a Pick up");
	JButton menu_reserved = new JButton("Prior Reservation(s)");
	JButton menu_accountinfo = new JButton("Account Information");
	JButton menu_logout = new JButton("Logout");
	
	
	public MainMenu() 
	{
		//window(menu) configuration 
		menuwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menuwindow.setSize(500, 500);
		menuwindow.setLayout(null);
		menuwindow.setVisible(true);
		
		//label window bound configuration
		//label_menutitle.setBounds(170,120,150,25);
		
		//button window bounds configuration
		menu_newreserve.setBounds(155,150,160,25);
		menu_reserved.setBounds(155,180,160,25);
		menu_accountinfo.setBounds(155,210,160,25);
		menu_logout.setBounds(155,240,160,25);
		
		//add buttons to Menu Window
		//menuwindow.add(label_menutitle);
		menuwindow.add(menu_newreserve);
		menuwindow.add(menu_reserved);
		menuwindow.add(menu_accountinfo);
		menuwindow.add(menu_logout);
		
		//add buttons to Main Menu frame
		menu_newreserve.addActionListener(this);
		menu_reserved.addActionListener(this);
		menu_accountinfo.addActionListener(this);
		menu_logout.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == menu_newreserve)
		{
			System.out.println("Moving to Create Reservation.");
			ReservationWindow reswindow = new ReservationWindow();
			menuwindow.dispose();
		}
		//if(e.getSource() == menu_reserved) {}
		//if(e.getSource() == menu_accountinfo) {}
		if(e.getSource() == menu_logout)
		{
			System.out.println("Exiting Account.");
			StartUpWindow startupwindow = new StartUpWindow();
			menuwindow.dispose();
		}
	}
}