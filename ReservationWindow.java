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
	
	public ReservationWindow()
	{
		//window(menu) configuration 
		reservationwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		reservationwindow.setSize(500, 500);
		reservationwindow.setLayout(null);
		reservationwindow.setVisible(true);
		
		reservationwindow.add(label_vehicle_type);
		reservationwindow.add(label_vehicle_brand);
		reservationwindow.add(label_driver);
		reservationwindow.add(label_location);
		
		label_vehicle_type.setBounds(80,50, 140, 25);
		label_vehicle_brand.setBounds(80, 70, 140, 25);
		label_driver.setBounds(80, 90, 160, 25);
		label_location.setBounds(80, 110, 140, 25);
		
		reservationwindow.add(search_vehicle);
		reservationwindow.add(search_driver);
		reservationwindow.add(search_location);
		
		search_vehicle.setBounds(80, 150, 170, 25);
		search_driver.setBounds(80, 180, 170, 25);
		search_location.setBounds(80, 210, 170, 25);
	}

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
