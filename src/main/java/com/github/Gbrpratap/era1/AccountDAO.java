package com.github.Gbrpratap.era1;

import java.sql.*;

public class AccountDAO {
	
	private String url = "jdbc:mysql://localhost:3306/SimpleBankDB";
	private String user = "root";
	private String password = "1234";
	
	public void saveAccount(Account acc) {
		String sql = "INSERT INTO Accounts (user_id, account_type, balance, interest_rate) VALUES (?, ?, ?, ?)";
		
		try (Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt = conn.prepareStatement(sql)){
			//here (1, 1) was hardcoded so changed it to acc.getUserID
			pstmt.setInt(1,  acc.getUserId());
			pstmt.setString(2, acc.getAccountType());
			pstmt.setDouble(3,  acc.getBalance());
			pstmt.setDouble(4,  5.0); //HardCoded for now will change it to get method later
			
			pstmt.executeUpdate();
			System.out.println("Account saved to database sucessfully!");
		}catch (SQLException e) {
			e.printStackTrace();
		}
				
	}
}
