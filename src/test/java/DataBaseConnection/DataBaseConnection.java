package DataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnection {
	public static void main(String[] args) throws SQLException {

		String DBURL = "jdbc:postgresql://172.16.0.135/hcmqa";
		String USERNAME = "hcmqa";
		String PASSWORD = "log";
		String QUERY = "select * from emp_mst_basicinfo limit 5";

		Connection con = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
		Statement smt = con.createStatement();
		ResultSet res = smt.executeQuery(QUERY);
		while (res.next())
		{
			String Column1 = res.getString(16);
			String Column2 = res.getString(34);
			String Column4 = res.getString(21);
			System.out.println(res.getRow()+" "+Column1+" | "+Column2+" | "+Column4);
		}


	}
}
