import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class javaConnectSql {

	public static void main(String[] args) {
		String url ="jdbc:sqlserver:sqlsrv\\sqlexpress;databaseNmae=TDIC_ERPSYS";
		String username ="sa";
		String password ="Sambhu@8763";
		try {
			Connection connection = DriverManager.getConnection(url,username,password);
			System.out.println("Conncected to Microsoft Sql Server ");
		} catch (SQLException e) {
			System.out.println("Opps error occuered, try to reconnect");
			e.printStackTrace();
		}
	}

}
