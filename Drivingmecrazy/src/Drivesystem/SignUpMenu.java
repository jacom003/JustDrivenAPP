package Drivesystem;

import java.awt.event.*;
import javax.swing.*;

public class SignUpMenu {
	
	JFrame accountForm = new JFrame("New Account Form");
	//Labels
	JLabel label_firstName = new JLabel("First name: ");
	JLabel label_lastName = new JLabel("Last name: ");
	JLabel label_emailAddress = new JLabel("Email: ");
	JLabel label_contactNumber = new JLabel("Mobile: ");
	JLabel label_DLUpload = new JLabel ("Click to upload Drive's License");
	JLabel label_password = new JLabel ("Enter a new password: ");
	JLabel label_confirmpass = new JLabel ("Confirm password: ");
	//Text fields
	JTextField field_firstName = new JTextField(20);
	JTextField field_lastName = new JTextField(20);
	JTextField field_email = new JTextField(20);
	JTextField field_contactNumber = new JTextField(20);
	JTextField field_password = new JTextField(20);
	JTextField field_confirmpass = new JTextField(20);
	
	public SignUpMenu(){
	//GUI components
	accountForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	accountForm.setSize(500,500);
	accountForm.setVisible(true);
	accountForm.setLayout(null);	
	

	//
	label_firstName.setBounds(50,50,100,25);
	label_lastName.setBounds(50,76,100,25);
	label_emailAddress.setBounds(50,101,100,25);
	label_password.setBounds(50,126,200,25);
	label_confirmpass.setBounds(50,151,200,25);
	label_contactNumber.setBounds(50,176,100,25);
	label_DLUpload.setBounds(50,201,200,25);
	
	field_firstName.setBounds(185,50,100,25);
	field_lastName.setBounds(185,76,100,25);
	field_email.setBounds(185,101,100,25);
	field_password.setBounds(185,126,100,25);
	field_confirmpass.setBounds(185,151,100,25);
	field_contactNumber.setBounds(185,176,100,25);
	
	//add labels to frames
		accountForm.add(label_firstName);
		accountForm.add(label_lastName);
		accountForm.add(label_emailAddress);
		accountForm.add(label_contactNumber);
		//accountForm.add(label_DLUpload);
		accountForm.add(label_password);
		accountForm.add(label_confirmpass);
		
		//adds text fields to frames
		accountForm.add(field_firstName);
		accountForm.add(field_lastName);
		accountForm.add(field_email);
		accountForm.add(field_contactNumber);
		accountForm.add(field_password);
		accountForm.add(field_confirmpass);
		
		
		
		//adds buttons to frames
//		accountForm.add(button_DLUpload);
//		accountForm.add(button_saveCustomer);
//		accountForm.add(button_saveDriver);
	
	}
	
}
