package registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.eclipse.jdt.internal.compiler.ast.ReturnStatement;

import registration.models.Registration;

public class RegisterDao {
	public int register(Registration register) throws ClassNotFoundException{
		String Register_User = "INSERT INTO users"+"(id, username,password)VALUES"+"(?,?,?);";
		int result= 0;
		Class.forName("com.mysql.jdbc.Driver");
		try (
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce?useSSL=false", "root", "User@1");
			PreparedStatement preparedStatement = connection.prepareStatement(Register_User)){
				preparedStatement.setInt(1, 1);
				//preparedStatement.setString(2, register.getName());
				preparedStatement.setString(3, register.getEmail());
				preparedStatement.setString(4, register.getPassword());
				System.out.println(preparedStatement);
				result=preparedStatement.executeUpdate();
			}
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
