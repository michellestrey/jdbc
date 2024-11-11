package connectionStudyJdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactory {
		 
//Created by Michelle on 11/2024
	public static Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/agencia";
		String user ="root";
		String password = "";
		
		try {
                // Conectar ao banco de dados
	          //   Connection connection = DriverManager.getConnection(url, user, password);
	            
	             return DriverManager.getConnection(url, user, password);
	        
	        } catch (SQLException e) {
	            System.out.println("Erro ao conectar ao banco de dados.");
	            e.printStackTrace();
	        }
		        return null;
	}
	
		public static void close(Connection conexao) {
			try {
				if(conexao != null)
				conexao.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
        public static void close(Connection connection, Statement stmt) {
			 close(connection);
			 try {
					if(stmt != null)
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
	
}
