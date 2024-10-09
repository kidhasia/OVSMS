package OVSPMS;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SellerRegController {
	
	//Connect DB
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	//Insert data function
	public static boolean insertdata(String user_name, String user_email, int user_conNum, String user_address, String user_password) {
		boolean isSuccess = false;
		try {
			
			con=DBConnection.getConnection();
			stmt=con.createStatement();
			
			//SQL Query
			String sqlQ = "INSERT INTO `userregistration` (user_name, user_email, user_conNum, user_address, user_password) VALUES ('" + user_name + "', '" + user_email + "', " + user_conNum + ", '" + user_address + "', '" + user_password + "')";

			int rs = stmt.executeUpdate(sqlQ);
			if(rs>0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
		
	}

	public static boolean isSuccess() {
		return isSuccess;
	}

	public static void setSuccess(boolean isSuccess) {
		SellerRegController.isSuccess = isSuccess;
	}

	public static ResultSet getRs() {
		return rs;
	}

	public static void setRs(ResultSet rs) {
		SellerRegController.rs = rs;
	}
}
