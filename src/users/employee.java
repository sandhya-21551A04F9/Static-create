package users;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class employee {
	
	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" ,"root" , "root");
			
			String sql ="create database apple";
			
			PreparedStatement pmst = conn.prepareStatement(sql);
			
			int i = pmst.executeUpdate();
			
			if (i>0) {
				System.out.println("database created successfully");
				
			} else {
				System.out.println("database not created");
				
			}
			conn.close();
			pmst.close();
			
		} catch (Exception e) {
			
		 e.printStackTrace();	 
		}	
	}

}
