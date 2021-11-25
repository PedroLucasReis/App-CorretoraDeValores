
package Controller;

import Model.Empresa;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class EmpresaDAO {
    private final Connection con;
    private PreparedStatement cmd;

    
    
    public EmpresaDAO() {
        this.con = Conect.conectar();
    }
    
    public int inserir(Empresa emp){
        try {
            String SQL = "insert into tb_empresa "
                       + "(nome,valor_atual) values (?,?)";
            
            cmd = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            cmd.setString(1, emp.getNome());
            cmd.setDouble(2, emp.getValor());
            
            //envia a instrução SQL para o banco
            if (cmd.executeUpdate() > 0){
                ResultSet rs = cmd.getGeneratedKeys();
                return rs.next()? rs.getInt(1) : 1;   
            }else{
                return -1;  // ERRO
            }
        } catch (SQLException e) {
            System.err.println("ERRO: " + e.getMessage());
            return -1;
        }finally{
            Conect.desconectar(con);
        }
    }
    
    public int atualizar(Empresa emp){
        try {
            String SQL = "update tb_empresa set nome=? ,valor_atual=? where id=?";

            cmd = con.prepareStatement(SQL);
            cmd.setString(1, emp.getNome());
            cmd.setDouble(2,emp.getValor());
            cmd.setInt(3,emp.getId());
            
            //envia a instrução SQL para o banco
            if (cmd.executeUpdate() > 0){
                //operação realizada com sucesso
                return 1;   //OK
            }else{
                return -1;  // ERRO
            }
        } catch (SQLException e) {
            System.err.println("ERRO: " + e.getMessage());
            return -1;
        }finally{
            Conect.desconectar(con);
        }
    }
    
    public Empresa encontrarId(int id){
        try {
            String SQL = "select * from tb_empresa where id = ? order by id";
            cmd = con.prepareStatement(SQL);
            cmd.setInt(1, id);
            
            //executar a consulta
            ResultSet rs = cmd.executeQuery();
            if (rs.next()){
                Empresa emp = new Empresa();
                emp.setId(rs.getInt("id"));
                emp.setNome(rs.getString("nome"));
                emp.setValor(rs.getDouble("valor_atual"));
                return emp;
            }
            return null;
        } catch (SQLException e) {
            System.err.println("ERRO: " + e.getMessage());
            return null;
        }finally{
            Conect.desconectar(con);
        }
    }
}
