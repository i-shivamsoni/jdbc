package my_jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
public class Demo1Db {
final static String DRIVER ="com.mysql.jdbc.Driver";
final static String URl ="jdbc:mysql://localhost:3306/sistech";
final static String PWD ="";
final static String USER ="root";
	public static void main(String[] args) {
	
		try{
			//Register Driver
			Class.forName(DRIVER);
			//open Connection
		Connection conn=DriverManager.getConnection(URl,USER,PWD);
		System.out.println("connection established");
		// close Connection
		conn.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		
	}

}
