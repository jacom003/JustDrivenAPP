package justdriveapp;

import java.awt.event.*;
import javax.swing.*;

public class ReservationWindow implements ActionListener
{
	//Create Database Class Object to access SQL
	DBClass db = new DBClass();
	
	JFrame reservationwindow = new JFrame("Setting Reservation");
	
	JLabel label_vehicle_type = new JLabel("Enter Vehicle Type: ");
	JLabel label_vehicle_brand = new JLabel("Enter Vehicle Brand: ");
	JLabel label_driver = new JLabel("Enter Driver First Name: ");
	JLabel label_location = new JLabel("Enter Destination: ");
	
	JButton search_vehicle = new JButton("Search for Vehicle");
	JButton search_driver = new JButton("Search for Driver");
	JButton search_location = new JButton("Search for Destination");
	
	ReservationWindow()
	{
		//window(menu) configuration 
		reservationwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		reservationwindow.setSize(500, 500);
		reservationwindow.setLayout(null);
		reservationwindow.setVisible(true);
		
		
	}

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
