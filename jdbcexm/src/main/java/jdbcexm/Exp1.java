package jdbcexm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Exp1 {
    
	public static void main(String[] args) throws Exception{
		String url="jdbc:mysql://localhost:3306/mladec";
		String user="root";
		String pass="root@39";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,pass);
		Statement st=con.createStatement();
		st.execute("create table book1(b_id int,b_name varchar(50),b_price int)");
		con.close();
		System.out.println("done");
	}
}
