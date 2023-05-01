package JustDrivin;

import javax.swing.JFrame;
import javax.swing.JTextField;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import javax.swing.*;
public class LoginPage extends JFrame {
	
	
	private String username;
	private String opassword;
	
	public LoginPage() {
		//window
		JFrame window = new JFrame("Welcome to JustDriving!");
		window.setLayout(null);
		
		//components
		JTextField textField_user = new JTextField(20);
		JTextField textField_pass = new JTextField(20);
		JLabel label_User = new JLabel("Username: ");
		JLabel label_Pass = new JLabel("Password: ");
		JButton createAccount = new JButton("Sign Up");
		JButton customerSignIn = new JButton("Confirm");
		JButton driverLogin = new JButton("I'm a Driver");
		
		//add components to the window
		window.add(textField_user);
		window.add(textField_pass);
		window.add(label_User);
		window.add(label_Pass);
		window.add(createAccount);
		window.add(customerSignIn);
		window.add(driverLogin);
		
		

		//size and place in location on window
		textField_user.setBounds(100,50,100,25);
		textField_pass.setBounds(100,200,100,25);
		label_User.setBounds(20,50,70,25);
		label_Pass.setBounds(20,200,70,25);
		createAccount.setBounds(100,230,100,25);
		customerSignIn.setBounds(100,260,100,25);
		driverLogin.setBounds(100,290,100,25);
		
		//"Sign Up" button creates a new account form
		createAccount.addActionListener(e -> {
			createAccountForm();
			
		});
		//"Confirm" button logins
		customerSignIn.addActionListener(e -> {
			//login();
		});
		
		window.setSize(1000,1000);
		window.setVisible(true);
		
	}
	//function that creates a new graphical user interface as a new customer form
	public void createAccountForm() {
			//GUI components
			JFrame accountForm = new JFrame("New Account Form");
			accountForm.setLayout(null);
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
			//Buttons
			JButton button_DLUpload = new JButton("Choose File...");
			JButton button_saveCustomer = new JButton("Customer Account");
			JButton button_saveDriver = new JButton("Driver Account");
			//add labels to frames
			accountForm.add(label_lastName);
			accountForm.add(label_emailAddress);
			accountForm.add(label_contactNumber);
			accountForm.add(label_DLUpload);
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
			accountForm.add(button_DLUpload);
			accountForm.add(button_saveCustomer);
			accountForm.add(button_saveDriver);
			//lines 108 - 122 set the location of each component in the frame
			label_firstName.setBounds(50,50,100,25);
			label_lastName.setBounds(50,76,100,25);
			label_emailAddress.setBounds(50,101,100,25);
			label_password.setBounds(50,126,100,25);
			label_confirmpass.setBounds(50,151,100,25);
			label_contactNumber.setBounds(50,176,100,25);
			label_DLUpload.setBounds(50,201,200,25);
			
			
			
			field_firstName.setBounds(120,50,100,25);
			field_lastName.setBounds(120,76,100,25);
			field_email.setBounds(120,101,100,25);
			field_password.setBounds(120,126,100,25);
			field_confirmpass.setBounds(120,151,100,25);
			field_contactNumber.setBounds(120,176,100,25);
			
			button_DLUpload.setBounds(270,201,200,25);
			button_saveCustomer.setBounds(100, 250, 200, 25);
			button_saveDriver.setBounds(360,250, 200, 25);
			//add action to the upload button, allows user to browse for image to upload
			button_DLUpload.addActionListener(e -> {
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				File file = chooser.getSelectedFile();
			});
			/*add action to save as customer button, 
			 * initializes and declares variables first name, last name, email and phone number,
			 * each are used to pass as parameters for the saveCustomer method to be called.*/
			button_saveCustomer.addActionListener(e ->{
				String firstname = field_firstName.getText();
				String lastname = field_lastName.getText();
				String email = field_email.getText();
				String contactnumber = field_contactNumber.getText();
				int phonenumber = Integer.parseInt(contactnumber);
				saveCustomer(firstname, lastname, phonenumber, email, password);
			});
			//add action to save as a driver button, follows same concepts as the "save as customer" button
			button_saveDriver.addActionListener(e ->{
				String firstname = field_firstName.getText();
				String lastname = field_lastName.getText();
				String email = field_email.getText();
				String contactnumber = field_contactNumber.getText();
				int phonenumber = Integer.parseInt(contactnumber);
				String password;
				if(field_password.getText().equals(field_confirmpass.getText())) {
					password = field_password.getText();
				}
				
				
				saveDriver(firstname,lastname,phonenumber,email,password);
				
			});
			
			
			accountForm.setSize(1000,1000);
			accountForm.setVisible(true);
			
			
	}
//login function
/*saveCustomer method is used to insert the content on the account form for the customer into the JustDriving database/table customerinfo */
	public void saveCustomer(String firstname, String lastname, int phonenumber, String email, String password) {
		String username = "root";
		String sqlpassword ="DUmmybear21!";
		//will pnly insert values into the columns identified by their names.
		String query = "INSERT INTO CustomerInfo (FirstName,LastName,PhoneNumber,Email) VALUES (?,?,?,?)";
		String url = "jdbc:mysql://localhost:3306/JustDriving";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}	catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection(url, username, sqlpassword);
			PreparedStatement result = con.prepareStatement(query);
			
			result.setString(1,firstname);
			result.setString(2,lastname);
			result.setInt(3, phonenumber);
			result.setString(4,email);
			//checks if insert was successful. If true, prints success message.
			int rowInserted = result.executeUpdate();
			if (rowInserted > 0) {
				System.out.println("Customer added!");
			}

		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	/*saveDriver method saves the account form of the driver into the JustDriving data base/ table driverinfo
	 * uses same concepts of the saveCustomer method. */
		
	public void saveDriver(String firstname, String lastname, int phonenumber, String email, String password) {
		String username = "root";
		String sqlpassword ="DUmmybear21!";
		String query = "INSERT INTO driverinfo (FirstName,LastName,Phone,Email) VALUES (?,?,?,?)";
		String url = "jdbc:mysql://localhost:3306/JustDriving";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}	catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection(url, username, sqlpassword);
			PreparedStatement result = con.prepareStatement(query);
			
			result.setString(1,firstname);
			result.setString(2,lastname);
			result.setInt(3, phonenumber);
			result.setString(4,email);
			int rowInserted = result.executeUpdate();
			if (rowInserted > 0) {
				System.out.println("Driver added!");
			}

		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	
		
	
public static void main(String[] args) {
	LoginPage hello = new LoginPage();
	
	
}
}
