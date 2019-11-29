package javadb;

import java.sql.Connection;
import java.sql.SQLException;

public class TesteDeConexao {
	public static void main(String[] args) throws SQLException {
		Connection con = ConnectionFactory.getConnection();
		System.out.println("Ok, conectado ao banco");
		con.close();
	}
}