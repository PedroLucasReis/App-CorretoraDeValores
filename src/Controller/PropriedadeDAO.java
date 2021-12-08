
package Controller;


import Model.Propriedade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class PropriedadeDAO {
    private final Connection con;
    private PreparedStatement cmd;

    
    
    public PropriedadeDAO() {
        this.con = Conect.conectar();
    }
    
    public int inserir(Propriedade pro, int tipo){
        try {
            String SQL;
            if(tipo==0)
            {
                SQL = "insert into tb_propriedade "
                       + "(id_empresa, cpf_user, quantidade, valor_uni) values (?,md5(?),?,?)";
            }
            else
            {
                SQL = "insert into tb_propriedade "
                       + "(id_empresa, cpf_user, quantidade, valor_uni) values (?,?,?,?)";
            }
            
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
    
    public boolean encontrarValorUni(Propriedade pro, int tipo){
       try 
       {
           String SQL;
           if(tipo==0)
           {
               SQL="select * from tb_propriedade where valor_uni=? and id_empresa=? and cpf_user=md5(?)";
           }
           else
           {
               SQL="select * from tb_propriedade where valor_uni=? and id_empresa=? and cpf_user=?";
           }

            cmd = con.prepareStatement(SQL);
            cmd.setDouble(1, pro.getValor_uni());
            cmd.setInt(2, pro.getId_empresa());
            cmd.setString(3, pro.getCpf_user());
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
    
    public int atualizar(Propriedade pro, int tipo, int tipo2){
        try {
            String SQL;
            if(tipo2==0)
            {
                SQL = "update tb_propriedade set quantidade=? where valor_uni=? and id_empresa=? and  cpf_user=md5(?)";
            }
            else
            {
                SQL = "update tb_propriedade set quantidade=? where valor_uni=? and id_empresa=? and  cpf_user=?";
            }
            Propriedade ext = pesquisarCpfIdValor(pro, tipo2);
            int soma;
            if(tipo==0)
            {
                soma = ext.getQuantidade() + pro.getQuantidade();
            }
            else if(tipo==1)
            {
                soma = ext.getQuantidade() - pro.getQuantidade();
                if(soma < 0)
                {
                    return -1;
                }
            }
            else
            {
                soma=pro.getQuantidade();
            }
            cmd = con.prepareStatement(SQL);
            cmd.setInt(1, soma);
            cmd.setDouble(2, pro.getValor_uni());
            cmd.setInt(3, pro.getId_empresa());
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
    
    public int troca(Propriedade pro, int tipo){
        try {
             String SQL;
            if(tipo==0)
            {
                SQL = "update tb_propriedade set quantidade=? where valor_uni=? and id_empresa=? and  cpf_user=md5(?)";
            }
            else
            {
                SQL = "update tb_propriedade set quantidade=? where valor_uni=? and id_empresa=? and  cpf_user=?";
            }
            
            
            cmd = con.prepareStatement(SQL);
            cmd.setInt(1, pro.getQuantidade());
            cmd.setDouble(2, pro.getValor_uni());
            cmd.setInt(3, pro.getId_empresa());
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
    
    public Propriedade pesquisarCpfIdValor(Propriedade pro, int tipo){
        try {
            String SQL;
            if(tipo==0)
            {
                SQL="select * from tb_propriedade where "
                + "cpf_user=md5(?) and id_empresa=? and valor_uni=?";
            }
            else
            {
                SQL="select * from tb_propriedade where "
                + "cpf_user=? and id_empresa=? and valor_uni=?";
            }
            

            cmd = con.prepareStatement(SQL);
            cmd.setString(1, pro.getCpf_user());
            cmd.setInt(2, pro.getId_empresa());
            cmd.setDouble(3, pro.getValor_uni());

            ResultSet rs = cmd.executeQuery();
            if (rs.next()){
                Propriedade pros = new Propriedade();
                pros.setId_empresa(pro.getId_empresa());
                pros.setCpf_user(pro.getCpf_user());
                pros.setQuantidade(rs.getInt("quantidade"));
                pros.setValor_uni(pro.getValor_uni());
                return pros;
            }else{
                return null;
            }
            
            

        } catch (Exception e) {
            System.err.println("ERRO2: " + e.getMessage());
            return null;
        }
 
    }
    
     public List<Propriedade> pesquisarCpfId(String cpf, int id, int tipo){
        try {
            String SQL;
            if(tipo==0)
            {
                SQL="select * from tb_propriedade where "
                + "cpf_user=md5(?) and id_empresa=?";
            }
            else
            {
                SQL="select * from tb_propriedade where "
                + "cpf_user=? and id_empresa=?";
            }
            

            cmd = con.prepareStatement(SQL);
            cmd.setString(1, cpf);
            cmd.setInt(2, id);

            
            List<Propriedade> lista = new ArrayList<>();
            ResultSet rs = cmd.executeQuery();
            while (rs.next()){
                Propriedade pros = new Propriedade();
                pros.setId_empresa(id);
                pros.setCpf_user(cpf);
                pros.setQuantidade(rs.getInt("quantidade"));
                pros.setValor_uni(rs.getDouble("valor_uni"));
                lista.add(pros);
            }
            return lista;

        } catch (Exception e) {
            System.err.println("ERRO2: " + e.getMessage());
            return null;
        }
 
    }
    
    public int veri(Propriedade prop, int tip, int tipo)
    {
        
        if(encontrarValorUni(prop,0)==true)
        {
            
            return atualizar(prop, tip, tipo);
            
            
        }
        else
        {
            return inserir(prop, tipo);
        }
        
    }

}
