package my_jdbc;
import java.sql.Connection;
import java.util.Scanner;
import java.sql.Statement;
import java.sql.DriverManager;

public class InsertData implements Db {

	public static void main(String[] args) {

		try{
			Class.forName(DRIVER);
			Connection conn=DriverManager.getConnection(URl,USER,PWD);
			Statement st = conn.createStatement();
			Scanner sc  =new Scanner(System.in);
			System.out.println("enter name");
			String name = sc.next();
			System.out.println("enter salary");
			float salary =sc.nextFloat();
			System.out.println("enter desg");
			String desg = sc.next();
			sc.close();
			//create query
			String query ="insert into employee(name,salary,designation)values('"+name+"',"+salary+",'"+desg+"')";
					
		int x =	st.executeUpdate(query);// insert/update/delete

		if(x>0){System.out.println("registration success");}
	
		//close connection and statement
		st.close();
		conn.close();
		}
		catch(Exception e){
			System.out.println("Registration failed:"+e);
							}
		}
		
	}


