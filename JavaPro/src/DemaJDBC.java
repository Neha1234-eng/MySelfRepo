//import pack
//register
//connector.....create object
//create statement...create object
//query...write a query
//result
//close

import java.sql.*;
public class DemaJDBC {
	static String url="";
	static String uname="root";
	static String pass="";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("driver");
      Connection con=DriverManager.getConnection(url,uname,pass);//return instance
	}

}
