import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyMain {

	public static void main(String[] args) throws ClassNotFoundException {
		Connection comn = null;
		Statement stmt = null;
		try {
		Class.forName("com.mysql.jdbc.Driver");
		comn = DriverManager.getConnection("jdbc:mysql://localhost:3306/accounts","root","gangster01");
		stmt = comn.createStatement();
		String sql;
		String insert;
		String create;
		
//		insert = "INSERT INTO steams VALUES ('BIGSTEAMER')";
		create = "CREATE TABLE accounts(ID int NOT NULL AUTO_INCREMENT, Name VARCHAR(100), Address VARCHAR(100), Balance int, PRIMARY KEY (ID))";
//		sql = "SELECT * FROM Steams";
		
//		stmt.execute(create);
//		stmt.executeUpdate(insert);
//		ResultSet rs = stmt.executeQuery(sql);
//		
//		
//		while(rs.next()) 
//		{
//		System.out.println(rs.getString("Engine"));
//		}
//		
//		rs.close();
//		System.out.println("THE STEAMS!! BAOYSTAAW");
//		comn.close();
//		stmt.close();
		}
		catch(SQLException se) {
			
			}
		}	
	}

