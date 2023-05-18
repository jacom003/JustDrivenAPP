package justdriveapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;


public class JustDriveAppMySQL {
	public static void main(String[] args) {
		DBClass db = new DBClass();
		db.printAllData_test();
		//db.addAccount
		//db.matchData();
	}
}

//Class to access and obtain data from the schema 'justdriveapp_test' in MySQL
class DBClass {
	//final String conS = "jdbc:mysql://localhost:3306/knowprogram";
	final String conS = "jdbc:mysql://localhost:3306/justdriveapp_test";
	final String user = "root";
	final String password = "WordMyNewPass";

	//
	public void addRider(String fn, String ln, String pa, String em, String ph) throws SQLException 
	{
		String sql = "INSERT INTO 'tableName'(firstname, lastname, password, email, phone) " 
				+ "VALUES('"+fn+"', '"+ln+"', '"+pa+"', '"+em+"', '"+ph+"')";
	 
		//Connect to mySQL
		Connection con = DriverManager.getConnection(conS, user, password);

		//Prepare statement & execute table Insertion
		Statement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery(sql);

		//Close connection
		con.close();
	}
	
	public void addDriver(String fn, String ln, String pa, String em, String ph, String vt, String vb) throws SQLException
	{
		String sql = "INSERT INTO 'tableName'(firstname, lastname, password, email, phone, "
				+"vehicletype, vehiclebrand) " 
				+ "VALUES('"+fn+"', '"+ln+"', '"+pa+"', '"+em+"', '"+ph+"', '"+vt+"', '"+vb+"')";
		
		//Connect to mySQL
		Connection con = DriverManager.getConnection(conS, user, password);

		//Prepare statement & execute table Insertion
		Statement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery(sql);

		//Close connection
		con.close();
	}

	//Matches login information with customer table
	public boolean loginCustomer(String uname, String pass) throws SQLException{
		//**Needs to be user name column in SQL
		String sql = "SELECT * FROM customer_test WHERE username = " + uname; 
		
		//Connect to mySQL
		Connection con = DriverManager.getConnection(conS, user, password);
		//Prepare statement & execute table Insertion
		Statement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery(sql);
		
		return false;
	}
	//Matches login information with driver table
	public boolean loginDriver(String uname, String pass) throws SQLException{
		//**Needs to have user name in SQL
		String sql = "SELECT * FROM driver_test WHERE usertname = " + uname; 
		
		//Connect to mySQL
		Connection con = DriverManager.getConnection(conS, user, password);
		//Prepare statement & execute table Insertion
		Statement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery(sql);
		
		return false;
	}
	

	
	//Matches vehicle information to Driver (might need boolean)
	public void matchDriver(String type, String brand) {}

	
	
	
	
	public void printAllData_test() {
		//Statement to select from table 'person'
		String sql = "SELECT * FROM customer_test";		
		try {
			//Get Connection
			Connection con = DriverManager.getConnection(conS, user, password);
			
			//Get Prepared Statement
			Statement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery(sql);
						
			//Loop through getting all rows of data
			while(rs.next()) {
				String fN= rs.getString(1); //First Name
				String lN = rs.getString(2); //Last Name
				//String pW = rs.getString(3); //Password
				String eM = rs.getString(4); //Email
				String pNum = rs.getString(5); //Phone#
				
				System.out.println(fN + "\t" + lN + "\t" + eM + "\t" + pNum);
			}					
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}	
	}
	
}
