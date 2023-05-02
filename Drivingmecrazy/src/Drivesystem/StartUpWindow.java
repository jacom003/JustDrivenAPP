
import java.awt.event.*;
import javax.swing.*;

public class StartUpWindow implements ActionListener
{
	//Create objects(instances) from Java Swing JFrame and JButton classes
	JFrame mainwindow = new JFrame("Welcome to the Driver App!");
	JButton signupbutton = new JButton("SignUp");
	JButton customerlogin = new JButton("Customer Sign in");
	JButton driverlogin = new JButton("Driver Log in");
	JTextField textField_user = new JTextField(20);
	JTextField textField_pass = new JTextField(20);
	JLabel label_User = new JLabel("Username: ");
	JLabel label_Pass = new JLabel("Password: ");

	
	 public StartUpWindow()
	{
		//Window configuration 
		mainwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainwindow.setSize(500, 500);
		mainwindow.setLayout(null);
		mainwindow.setVisible(true);
	
		// window components
		mainwindow.add(textField_user);
		mainwindow.add(textField_pass);
		mainwindow.add(label_User);
		mainwindow.add(label_Pass);
		mainwindow.add(signupbutton);
		mainwindow.add(customerlogin);
		mainwindow.add(driverlogin);
		
		// component placement bounds
		textField_user.setBounds(100, 50, 100, 25);
		textField_pass.setBounds(100, 200, 100, 25);
		label_User.setBounds(20, 50, 70, 25);
		label_Pass.setBounds(20, 200, 70, 25);
		signupbutton.setBounds(100, 230, 100, 25);
		customerlogin.setBounds(100, 260, 100, 25);
		driverlogin.setBounds(100, 290, 100, 25);
		
		// Trigger action Configuration -- Open user registration form 
		signupbutton.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == signupbutton)
		{
			SignUpMenu signupwindow = new SignUpMenu();
			mainwindow.dispose();
		}
		
	}
	
}
