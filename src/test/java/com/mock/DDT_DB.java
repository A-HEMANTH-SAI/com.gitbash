package com.mock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DDT_DB {
	
	public static void main(String[] args) throws SQLException {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_database","root","root");
		Statement state=con.createStatement();
		String query="select * from emp;";
		ResultSet result=state.executeQuery(query);
		while(result.next())
			System.out.println(result.getString(1)+"\t"+result.getString(2)+"\t"+result.getString(3)+"\t"+result.getString(4)+"\t"+result.getString(5));
		String wQuery="insert into emp values(333,'HANUMA','SUPPORT',4000,102);";
		int wQueryR=state.executeUpdate(wQuery);
		System.out.println(wQueryR==1?"Record inserted":"Record not inserted");
		con.close();
		
	}

}
