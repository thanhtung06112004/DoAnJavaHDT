package project.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static DBConnection instance;
	//Doi tuong ket noi toi MySQL
	private Connection conn;
	private String ipadd = "172.16.1.60";
	private String port = "3306";
	private String database = "kncsdl";
	private String username = "root";
	private String password = "@Dmin1234";
	
	private DBConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.conn = DriverManager.getConnection("jdbc:mysql://" + ipadd + ":" +
					port + "/" + database, username, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Loi phan mem");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Loi ket noi den may chu CSDL");
		}
	}
	
	public Connection getConnection() {
		return this.conn;
	}
	
	public static DBConnection getInstance() throws SQLException {
		if(instance == null) {
			instance = new DBConnection();
		}else if(instance.getConnection().isClosed()) {
			instance = new DBConnection();
		}
		return instance;
	}
}
