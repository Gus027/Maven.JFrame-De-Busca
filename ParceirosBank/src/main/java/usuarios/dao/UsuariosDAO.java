package usuarios.dao;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import usuarios.Cnpj;


public class UsuariosDAO {
    
    public void createSave(Cnpj c){
        
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt=con.prepareStatement("INSERT INTO acessos(cnpj,usuario) VALUES (?,?)");
            stmt.setString(1, c.getCnpj());
            stmt.setString(2, c.getUsuario());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "SALVO COM SUCESSO.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AO INSERIR OS DADOS");
        }
        finally{
            Conexao.closeConnection(con,stmt);
        }
    }
    
    public List<Cnpj> read(){
    
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Cnpj> dados = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM acessos");
            stmt.executeQuery();
            
            while(rs.next()){
                Cnpj colun = new Cnpj();
                colun.setCnpj(rs.getString("cnpj"));
                colun.setUsuario(rs.getString("usuario"));
                dados.add(colun);
            }
            
        } catch (SQLException ex) {
            System.out.println("dados nao inseridos");;
        }finally{Conexao.closeConnection(con,stmt,rs);}
         return dados;
    }
    
    
    public List<Cnpj> readDesc(String cnpj){
    
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Cnpj> dados = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM acessos WHERE cnpj LIKE ?");
            stmt.setString(1, "%"+cnpj+"%");
            
            stmt.executeQuery();
            
            while(rs.next()){
                Cnpj colun = new Cnpj();
                colun.setCnpj(rs.getString("cnpj"));
                colun.setUsuario(rs.getString("usuario"));
                dados.add(colun);
            }
            
        } catch (SQLException ex) {
            System.out.println("dados nao inseridos");;
        }finally{Conexao.closeConnection(con,stmt,rs);}
         return dados;
    }
    
    
    
}
