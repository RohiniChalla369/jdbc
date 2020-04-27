package com.cg.mysqljdbc;
import java.sql.*;
public class JdbcDriver {

	public static void main(String[] args) {
        try {
        	//get connection to the database
			Connection myCon= DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","india123");
			//create a statement
			Statement stmt= myCon.createStatement();
			//execute sql query
			String sql="insert into books(tno,name,author)values(9,'vjwd','tej')";
			String sql1="insert into books(tno,name,author)values(10,'hyd','ruhh')";
			String sql2="insert into books(tno,name,author)values(11,'kkd','raj')";
			String sql3="insert into books(tno,name,author)values(12,'bmvrm','challa')";
			stmt.executeUpdate(sql);
			stmt.executeUpdate(sql1);
			stmt.executeUpdate(sql2);
			stmt.executeUpdate(sql3);
			//process the resultset
			ResultSet rs= stmt.executeQuery("select * from book1");
			while(rs.next())
			{
				System.out.println(rs.getString("name")+" "+rs.getString("author"));
			}
			String sql4="delete from book1 where tno=10";
			stmt.executeUpdate(sql2);
			ResultSet rs1=stmt.executeQuery("select * from book1");
			while(rs1.next())	
			{	
				System.out.println(rs1.getString("tname")+" "+rs1.getString("author"));
			}
			String sql5="update book1 set author='srividhya' where tno=9";
			stmt.executeUpdate(sql5);
			ResultSet rs2=stmt.executeQuery("select * from book1");
			while(rs2.next())
			{
				System.out.println(rs2.getString("name")+" "+rs2.getString("author"));
		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
