import java.sql.*;
import java.util.Scanner;
public class DeleteEmployee {

	public static void main(String[] args) {
		try {
			Connection conn =EmpDb.getEmpDb();
			System.out.println("enter employee num to delete ");
			int eno =new Scanner(System.in).nextInt();
			
			String sql ="delete from employee where eno="+eno;
			Statement st=conn.createStatement();
			
			if(st.executeUpdate(sql)>0)
			{
				System.out.println("success");
			}
			else{
				System.out.println("not available");
			}
			st.close();
			conn.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	
}
