
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;




public class ReadALLEmployees implements Db {

	public static void main(String[] args) {
		try {
			
			
			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL,USER,PWD);
			String query ="select * from employee";
			Statement sts = conn.createStatement();
			ResultSet rs = sts.executeQuery(query);
			System.out.println("Eno\tName\tSalary\tDesignation");
			System.out.println("------------------------------");
			while(rs.next()){
				System.out.println(rs.getInt("eno")+"\t"+rs.getString("name")+"\t"+rs.getFloat("salary")+"\t"+rs.getString("designation"));
				
			}
			rs.close();
			sts.close();
			conn.close();
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
}
