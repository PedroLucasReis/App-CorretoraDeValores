
package Controller;

import Model.Empresa;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class EmpresaDAO {
    private final Connection con;
    private PreparedStatement cmd;

    
    
    public EmpresaDAO() {
        this.con = Conect.conectar();
    }
    
    public int inserir(Empresa obj){
        try {
            String SQL = "insert into tb_categoria "
                       + "(nome,valor_atual) values (?,?)";
            
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, obj.getNome());
            cmd.setFloat(2,obj.getValor());
            
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
}
