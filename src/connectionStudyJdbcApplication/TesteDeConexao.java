package connectionStudyJdbcApplication;

import connectionStudyJdbcDb.CompradorDB;

public class TesteDeConexao {

	public static void main(String[] args) {
	
		CompradorDB compradorDB = new CompradorDB();
		compradorDB.save();
		
		
	}

}
