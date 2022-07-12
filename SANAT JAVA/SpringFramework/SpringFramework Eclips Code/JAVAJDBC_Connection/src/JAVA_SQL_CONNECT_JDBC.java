import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JAVA_SQL_CONNECT_JDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:sqlserver://ACAC13CIS15\\SQLEXPRESS;databaseName=TDIC_ERPSYS";
		String user ="sa";
		String password = "Sambhu@8763";
		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println("DATABASE IS CONNECTED");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Database is not connected" + e.getMessage());
		}

	}

}
