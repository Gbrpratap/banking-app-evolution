import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionTest {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/SimpleBankDB";
		String user = "root";
		String password = "password";
		
		System.out.println("Connecting to database...");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(url, user, password);
			
			if(connection != null) {
				System.out.println("Sucess! Connection established");
				connection.close();
			}
		}catch (ClassNotFoundException e) {
			System.out.println("Driver not found! Did you add the JAR to the Build Path?");
			e.printStackTrace();
		}catch (SQLException e) {
			System.out.println("Connection failed! Check yout URL, username, or password");
			e.printStackTrace();
		}

	}

}
