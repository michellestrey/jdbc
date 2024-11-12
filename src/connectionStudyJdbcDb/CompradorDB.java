package connectionStudyJdbcDb;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import connectionStudyJdbc.ConnectionFactory;

public class CompradorDB {
		public void save() {
			String sql = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ('123.456.789-10', 'Michelle Olveira');";
			Connection conn = ConnectionFactory.getConnection();
			
			try {
				Statement stmt = conn.createStatement()	;
				System.out.println(stmt.executeUpdate(sql));
				ConnectionFactory.close(conn, stmt);
				stmt.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		}
}
