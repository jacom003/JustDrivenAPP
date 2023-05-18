package justdriveapp;

import java.awt.event.*;
import java.sql.SQLException;
import javax.swing.*;

public class DriverLogIn implements ActionListener{
	
	JFrame driverlogIn = new JFrame("Log In");
		
		JTextField textField_user = new JTextField(20);
		JTextField textField_pass = new JTextField(20);
		
		JLabel label_User = new JLabel("Username: ");
		JLabel label_Pass = new JLabel("Password: ");
		
		JButton driver = new JButton("Log-in as Driver");
		
	public DriverLogIn() {
		
		//window( login menu) configuration
		driverlogIn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		driverlogIn.setSize(500,500);
		driverlogIn.setVisible(true);
		driverlogIn.setLayout(null);
		
		driverlogIn.add(textField_user);
		driverlogIn.add(textField_pass);
		driverlogIn.add(label_User);
		driverlogIn.add(label_Pass);
		
		textField_user.setBounds(100, 50, 140, 25);
		textField_pass.setBounds(100, 200, 140, 25);
		label_User.setBounds(20, 50, 70, 25);
		label_Pass.setBounds(20, 200, 70, 25);
		
		driverlogIn.add(driver);
		
		driver.setBounds(100, 250, 140, 25);
		
		driver.addActionListener(this);
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		//Opens a SignUpMenu window while closing the StartUp Window
		if(e.getSource() == driver)
		{
			ReservationWindow reservationwindow = new ReservationWindow();
			driverlogIn.dispose();
		}
	}

}
