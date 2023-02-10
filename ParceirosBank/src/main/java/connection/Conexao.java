package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexao {
    
    private static String DRIVER = "com.postgresql.jdbc.Driver";
    private static String URL  = "jdbc:postgresql://localhost:5432/parceiros";
    private static String USER = "postgres";
    private static String PASS = "123456";
    private static Connection con;
    
    public static Connection getConnection(){
    
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(URL,USER,PASS);
            System.out.println("CONEXÃO REALIZADA COM SUCESSO");
            return DriverManager.getConnection(URL, USER, PASS);
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Error na conexão", ex);
        }
        
    }
    
    public static void closeConnection(Connection con){
         try {
              if(con!=null){
                con.close();
               } 
         } catch (SQLException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            } 
    }
    
    
     public static void closeConnection(Connection con, PreparedStatement stmt){
         
         closeConnection(con);
         
         try {
             if(stmt!=null){
                stmt.close();
             } 
         } catch (SQLException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            } 
    }
    
     
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
         
         closeConnection(con, stmt);
         
         try {
             if(rs!=null){
                rs.close();
             } 
         } catch (SQLException ex) {
                System.out.println("Error ao Fechar Conexão");
            } 
    } 
     
    
    
}
