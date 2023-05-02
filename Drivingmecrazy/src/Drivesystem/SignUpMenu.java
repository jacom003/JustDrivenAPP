import java.awt.event.*;
import javax.swing.*;

public class SignUpMenu implements ActionListener
{
	
	//window(menu)
	JFrame accountForm = new JFrame("New Account Form");
	
	//Labels
	JLabel label_firstName = new JLabel("First name: ");
	JLabel label_lastName = new JLabel("Last name: ");
	JLabel label_emailAddress = new JLabel("Email: ");
	JLabel label_contactNumber = new JLabel("Mobile: ");
	//JLabel label_DLUpload = new JLabel ("Click to upload Drive's License");
	JLabel label_password = new JLabel ("Enter a new password: ");
	JLabel label_confirmpass = new JLabel ("Confirm password: ");
	
	//Text fields
	JTextField field_firstName = new JTextField(20);
	JTextField field_lastName = new JTextField(20);
	JTextField field_email = new JTextField(20);
	JTextField field_contactNumber = new JTextField(20);
	JTextField field_password = new JTextField(20);
	JTextField field_confirmpass = new JTextField(20);
	
	//Buttons - User Registration Selection Buttons  
	JButton signup_rider = new JButton("I'm a rider!");
	JButton signup_driver = new JButton("I'm a driver!");
	
	public SignUpMenu()
	{
	
		//window(menu) configuration
		accountForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		accountForm.setSize(500,500);
		accountForm.setVisible(true);
		accountForm.setLayout(null);	

		//Label window bounds configuration
		label_firstName.setBounds(50,50,100,25);
		label_lastName.setBounds(50,76,100,25);
		label_emailAddress.setBounds(50,101,100,25);
		label_password.setBounds(50,126,200,25);
		label_confirmpass.setBounds(50,151,200,25);
		label_contactNumber.setBounds(50,176,100,25);
		//label_DLUpload.setBounds(50,201,200,25);
		
		//field window bounds configuration
		field_firstName.setBounds(185,50,100,25);
		field_lastName.setBounds(185,76,100,25);
		field_email.setBounds(185,101,100,25);
		field_password.setBounds(185,126,100,25);
		field_confirmpass.setBounds(185,151,100,25);
		field_contactNumber.setBounds(185,176,100,25);
	
		//button window bounds configuration
		signup_rider.setBounds(50,225,100,25);
		signup_driver.setBounds(175,225,100,25);
		
		//add labels to Account Form frame
		accountForm.add(label_firstName);
		accountForm.add(label_lastName);
		accountForm.add(label_emailAddress);
		accountForm.add(label_contactNumber);
		accountForm.add(label_password);
		accountForm.add(label_confirmpass);
		
		//adds text fields to Account Form frame 
		accountForm.add(field_firstName);
		accountForm.add(field_lastName);
		accountForm.add(field_email);
		accountForm.add(field_contactNumber);
		accountForm.add(field_password);
		accountForm.add(field_confirmpass);
	
		//add buttons to Acccount Form frame
		accountForm.add(signup_rider);
		accountForm.add(signup_driver);
		
		
		// trigger action configuration -- submit new account info
		signup_rider.addActionListener(this);
		signup_driver.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == signup_rider)
		{
			/*Click-action needs to trigger
			 * 1. Enter Rider information into database
			 * 2. Return to main menu
			 * 3. Close Sign up menu window
			 */
			System.out.println("New rider account created!");
			StartUpWindow startupwindow = new StartUpWindow();
			accountForm.dispose();
		
		}
		
		if(e.getSource() == signup_driver)
		{
			/*Click-action needs to trigger
			 * 1. Enter driver information into database
			 * 2. Return to main menu
			 * 3. Close Sign up menu window
			 */
			System.out.println("New driver account created!");
			StartUpWindow startupwindow = new StartUpWindow();
			accountForm.dispose();
		
		}
	}
}
