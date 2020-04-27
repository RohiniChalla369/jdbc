package com.cg.mysqljdbc;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
public class StoringImageFileUsingBlob {

	public static void main(String[] args)throws SQLException, 
	FileNotFoundException {
				Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","india123");
		              
		       String query = "INSERT INTO Articles(img_col) VALUES (?)";
		       PreparedStatement pstmt = con.prepareStatement(query);
		       
		       File image = new File("E:\\Engagement  & Marriage\\wedding deta\\candid pics\\Prathanam & pelli\\flower.jpg");
		       FileInputStream inputStream = new FileInputStream(image);
		       
		       pstmt.setBinaryStream(1, inputStream);
		       pstmt.executeUpdate();
		       System.out.println("Image also inserted...");
			}
		
	}


