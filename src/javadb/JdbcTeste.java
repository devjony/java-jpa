package javadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTeste {
	
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mariadb://127.0.0.1/test", "root", "");
			System.out.println("Conectado ao Banco de Dados MariaDB Local");
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
