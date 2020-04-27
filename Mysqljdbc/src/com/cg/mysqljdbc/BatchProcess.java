package com.cg.mysqljdbc;
import java.sql.*;
import java.io.*;
public class BatchProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		try{  
		  
			Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","india123");
		  
		PreparedStatement ps=con.prepareStatement("insert into employee values(?,?)");  
		  
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		while(true){  
		  
		System.out.println("enter id");  
		String s1=br.readLine();  
		int id=Integer.parseInt(s1);  
		  
		System.out.println("enter name");  
		String name=br.readLine();  
		ps.setInt(1,id);  
		ps.setString(2,name);  
		ps.addBatch();  
		System.out.println("Want to add more records y/n");  
		String ans=br.readLine();  
		if(ans.equals("n")){  
		break;  
		}  
		  
		}  
		ps.executeBatch();  
		  
		System.out.println("record successfully saved");  
		  
		con.close();  
		}catch(Exception e){System.out.println(e);}  
		  
		}
		
	}


