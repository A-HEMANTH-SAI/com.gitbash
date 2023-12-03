package genericutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DBUtils {
	Connection con;
	Statement state;
	public void openConnectionDB() throws SQLException {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		con=DriverManager.getConnection(IPathConstants.DB_URL,IPathConstants.DB_UN,IPathConstants.DB_PW);
		state=con.createStatement();
	}
	
	public ResultSet readDataDB(String readDataQuery) throws SQLException {
		return state.executeQuery(readDataQuery);
	}
	
	public int writeDataDB(String writeDataQuery) throws SQLException {
		return state.executeUpdate(writeDataQuery);
	}
	
	public void closeDBConn() throws SQLException {
		con.close();
	}

}
