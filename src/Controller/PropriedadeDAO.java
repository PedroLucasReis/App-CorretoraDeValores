
package Controller;

import Model.Propriedade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class PropriedadeDAO {
    private final Connection con;
    private PreparedStatement cmd;

    
    
    public PropriedadeDAO() {
        this.con = Conect.conectar();
    }
    
    public int inserir(Propriedade pro){
        try {
            String SQL = "insert into tb_propriedade "
                       + "(id_empresa, cpf_user, quantidade, valor_uni) values (?,md5(?),?,?)";
            
            cmd = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            cmd.setInt(1, pro.getId_empresa());
            cmd.setString(2, pro.getCpf_user());
            cmd.setInt(3, pro.getQuantidade());
            cmd.setDouble(4, pro.getValor_uni());
            
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
    
    public boolean encontrarValorUni(Propriedade pro){
       try 
       {

            String SQL="select * from tb_propriedade where valor_uni=? and id_empresa=?";

            cmd = con.prepareStatement(SQL);
            cmd.setDouble(1, pro.getValor_uni());
            cmd.setDouble(2, pro.getId_empresa());

            ResultSet rs = cmd.executeQuery();
            if (rs.next()){
                return true;
            }else{
                return false;
            }

        } catch (Exception e) {
            System.err.println("ERRO: " + e.getMessage());
            return false;
        }
    }
    
    public int atualizar(Propriedade pro){
        try {
            String SQL = "update tb_propriedade set quantidade=? where valor_uni=? and id_empresa=? and  cpf_user=md5(?)";

            cmd = con.prepareStatement(SQL);
            cmd.setInt(1, pro.getQuantidade());
            cmd.setDouble(2, pro.getValor_uni());
            cmd.setDouble(3, pro.getId_empresa());
            cmd.setString(4, pro.getCpf_user());
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
    
    public int veri(Propriedade prop)
    {
        
        if(encontrarValorUni(prop)==true)
        {
            return atualizar(prop);
        }
        else
        {
            return inserir(prop);
        }
        
    }

}
