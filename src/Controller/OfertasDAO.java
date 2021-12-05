
package Controller;


import Model.Ofertas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class OfertasDAO {
    
    private final Connection con;
    private PreparedStatement cmd;
    
    public OfertasDAO() {
        this.con = Conect.conectar();
    }
    
    public int inserir(Ofertas ofe){
        try {
            String SQL = "insert into tb_propriedade "
                       + "(id_empresa, cpf_user, quantidade, valor) values (?,md5(?),?,?)";
            
            cmd = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            cmd.setInt(1, ofe.getId_empresa());
            cmd.setString(2, ofe.getCpf_user());
            cmd.setInt(3, ofe.getQuantidade());
            cmd.setDouble(4, ofe.getValor());
            
            //envia a instrução SQL para o banco
            if (cmd.executeUpdate() > 0){
                ResultSet rs = cmd.getGeneratedKeys();
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
