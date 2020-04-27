package com.cg.mysqljdbc;
import java.sql.*;

public class ResultSetMetaData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        try 
		        {            
		            Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","india123");
		            
		            Statement stmt =mycon.createStatement();
		            
		            ResultSet rs = stmt.executeQuery("select * from employees");
		            
		            java.sql.ResultSetMetaData rsmd = rs.getMetaData();
		            int n = rsmd.getColumnCount();            
		            System.out.println("No of columns : "+n);
		            for(int i=1;i<=n;i++)
		            {
		                System.out.println("column number "+i);
		                System.out.println("column name "+rsmd.getColumnName(i));
		            }
		        } 
		        catch (SQLException e) 
		        {
		            e.printStackTrace();
		        }
		    }
		
		 
	}

