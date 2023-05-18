package justdriveapp;

import java.awt.event.*;
import java.sql.SQLException;
import javax.swing.*;

public class loginIn implements ActionListener {
	
	JFrame logIn = new JFrame("Log In");
	
	JTextField textField_user = new JTextField(20);
	JTextField textField_pass = new JTextField(20);
	
	JLabel label_User = new JLabel("Username: ");
	JLabel label_Pass = new JLabel("Password: ");
	
	JButton passengerlogin = new JButton("Log-in as passenger");
	
	public loginIn() {
		
		//window( login menu) configuration
				logIn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
				logIn.setSize(500,500);
				logIn.setVisible(true);
				logIn.setLayout(null);
				
				logIn.add(textField_user);
				logIn.add(textField_pass);
				logIn.add(label_User);
				logIn.add(label_Pass);
				
				textField_user.setBounds(100, 50, 140, 25);
				textField_pass.setBounds(100, 200, 140, 25);
				label_User.setBounds(20, 50, 70, 25);
				label_Pass.setBounds(20, 200, 70, 25);
				
				logIn.add(passengerlogin);
				
				passengerlogin.setBounds(100, 250, 170, 25);
				
				passengerlogin.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		//Opens a SignUpMenu window while closing the StartUp Window
		if(e.getSource() == passengerlogin)
		{
			ReservationWindow reservationwindow = new ReservationWindow();
			logIn.dispose();
		}
	}

}
