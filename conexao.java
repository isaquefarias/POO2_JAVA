package conexaoBd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class conexao {
	
public static void main(String[] args) {
		
		// String de Conexão
		
		String URL = "jdbc:postgresql://localhost:5433/postgres";
	    String usuario = "postgres";
	    String senha = "mysecretpassword";
	    
	    try {
	    	Class.forName("org.postgresql.Driver");
	        try (Connection con = DriverManager.getConnection(URL, usuario, senha)) {
			}
	        	System.out.println("Conexão obtida com sucesso.");
	      }
	      catch (SQLException ex) {
	        System.out.println("SQLException: " + ex.getMessage());
	        System.out.println("SQLState: " + ex.getSQLState());
	        System.out.println("VendorError: " + ex.getErrorCode());
	      }
	      catch (Exception e) {
	        System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
	      }      
	     
	}

public static Statement createStatement() {
	// TODO Auto-generated method stub
	return null;
}

}
