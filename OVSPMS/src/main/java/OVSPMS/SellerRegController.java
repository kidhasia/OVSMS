package OVSPMS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
	
	public static List<SellerReg> getById (int Id){
		
		int converedID = Id;
		
		ArrayList <SellerReg> seller = new ArrayList<>();
		
		try {
			con = DBConnection.getConnection();
			stmt = con.createStatement();
			
			String sqlQ = "SELECT * FROM userregistration WHERE user_id  " + converedID + ";";
			
			rs = stmt.executeQuery(sqlQ);
			
			while(rs.next()) {
				int user_id =rs.getInt(1);
				String user_name = rs.getString(2);
				String user_email = rs.getString(3);
				int user_conNum = rs.getInt(4);
				String user_address = rs.getString(5);
				String user_password = rs.getString(6);
				
				SellerReg seller2 =  new SellerReg(user_id, user_name,user_email,user_conNum,user_address,user_password);
				
				seller.add(seller2);
			}
			}
		catch(Exception e) {
			e.printStackTrace();
		}
		return seller;
		
		
	}
	
	//Get Data
	public static List<SellerReg> getAllSellerReg(){
		
		ArrayList <SellerReg> sellerR = new ArrayList<>();
		try {
			con = DBConnection.getConnection();
			stmt = con.createStatement();
			
			String sqlQ = "SELECT * FROM userregistration ";
			
			rs = stmt.executeQuery(sqlQ);
			
			while(rs.next()) {
				int user_id =rs.getInt(1);
				String user_name = rs.getString(2);
				String user_email = rs.getString(3);
				int user_conNum = rs.getInt(4);
				String user_address = rs.getString(5);
				String user_password = rs.getString(6);
				
				SellerReg seller2 =  new SellerReg(user_id, user_name,user_email,user_conNum,user_address,user_password);
				
				sellerR.add(seller2);
			}
			}
		catch(Exception e) {
			e.printStackTrace();
		}

		
		return sellerR;
	}
	
	//Update function
	
	public static boolean updateData(int user_id, String user_name, String user_email, int user_conNum, String user_address, String user_password) {
	    Connection con = null;
	    PreparedStatement pst = null;
	    boolean isSuccess = false;

	    try {
	        // Get database connection
	        con = DBConnection.getConnection();
	        
	        // Query with placeholders
	        String sqlQ = "UPDATE userregistration SET user_name = ?, user_email = ?, user_conNum = ?, user_address = ?, user_password = ? WHERE user_id = ?";
	        
	        // Use PreparedStatement to prevent SQL injection
	        pst = con.prepareStatement(sqlQ);
	        
	        // Set the parameters in the query
	        pst.setString(1, user_name);
	        pst.setString(2, user_email);
	        pst.setInt(3, user_conNum);
	        pst.setString(4, user_address);
	        pst.setString(5, user_password);
	        pst.setInt(6, user_id);
	        
	        // Execute update
	        int rs = pst.executeUpdate();
	        
	        // Check if the update was successful
	        isSuccess = rs > 0;
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        // Close resources
	        try {
	            if (pst != null) pst.close();
	            if (con != null) con.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
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
