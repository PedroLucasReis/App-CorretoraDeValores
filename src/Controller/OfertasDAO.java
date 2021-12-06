
package Controller;


import Model.Ofertas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class OfertasDAO {
    
    private final Connection con;
    private PreparedStatement cmd;
    
    public OfertasDAO() {
        this.con = Conect.conectar();
    }
    
    public int inserir(Ofertas ofe){
        try {
            String SQL = "insert into tb_propriedade "
                       + "(id_empresa, cpf_user, quantidade, valor, tipo) values (?,md5(?),?,?,?)";
            
            cmd = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            cmd.setInt(1, ofe.getId_empresa());
            cmd.setString(2, ofe.getCpf_user());
            cmd.setInt(3, ofe.getQuantidade());
            cmd.setDouble(4, ofe.getValor());
            cmd.setInt(5, ofe.getTipo());
            
            if (cmd.executeUpdate() > 0){
               
               ResultSet rs = cmd.getGeneratedKeys();
                return rs.next()? rs.getInt(1) : 1;   
            }else{
                return -1;  
            }
            
        } catch (SQLException e) {
            System.err.println("ERRO: " + e.getMessage());
            return -1;
        }finally{
            Conect.desconectar(con);
        }
    }
    
    
    public List<Ofertas> pesquisarTipoId(int tipo, int id){
        try {
            String SQL;
            if(tipo==0)
            {
                SQL="select * from tb_ofertas where id_empresa=? and tipo=? order by valor desc";
            }
            else
            {
                SQL="select * from tb_ofertas where id_empresa=? and tipo=? order by valor asc";
            }
            

            cmd = con.prepareStatement(SQL);
            cmd.setInt(1, id);
            cmd.setInt(2, tipo);

            List<Ofertas> lista = new ArrayList<>();
            ResultSet rs = cmd.executeQuery();
            while (rs.next()){
                Ofertas ofe = new Ofertas();
                ofe.setId(rs.getInt("id"));
                ofe.setId_empresa(rs.getInt("id_empresa"));
                ofe.setTipo(rs.getInt("tipo"));
                ofe.setCpf_user(rs.getString("cpf_user"));
                ofe.setQuantidade(rs.getInt("quantidade"));
                ofe.setValor(rs.getDouble("valor"));
                lista.add(ofe);
            }
            return lista;

        } catch (Exception e) {
            System.err.println("ERRO2: " + e.getMessage());
            return null;
        }
 
    }
    
     public List<Ofertas> pesquisarCpfIdTipo(String cpf, int id, int tipo){
        try {
            String SQL="select * from tb_ofertas where id_empresa=? and cpf=md5(?) and tipo=?";
            cmd = con.prepareStatement(SQL);
            cmd.setInt(1, id);
            cmd.setString(2, cpf);
            cmd.setInt(3, tipo);
            
            List<Ofertas> lista = new ArrayList<>();
            ResultSet rs = cmd.executeQuery();
            while (rs.next()){
                Ofertas ofe = new Ofertas();
                ofe.setId(rs.getInt("id"));
                ofe.setId_empresa(rs.getInt("id_empresa"));
                ofe.setTipo(rs.getInt("tipo"));
                ofe.setCpf_user(rs.getString("cpf_user"));
                ofe.setQuantidade(rs.getInt("quantidade"));
                ofe.setValor(rs.getDouble("valor"));
                lista.add(ofe);
            }
            return lista;

        } catch (Exception e) {
            System.err.println("ERRO2: " + e.getMessage());
            return null;
        }
 
    }
    
    public int atualizar(Ofertas ofe){
        try {
            String SQL = "update tb_ofertas set cpf_user=md5(?), id_empresa=?, "
                    + "quantidade=?, tipo=?, valor=? where id=?";

            cmd = con.prepareStatement(SQL);
            cmd.setString(1,ofe.getCpf_user());
            cmd.setInt(2,ofe.getId_empresa());
            cmd.setInt(3,ofe.getQuantidade());
            cmd.setInt(4,ofe.getTipo());
            cmd.setDouble(5,ofe.getValor());
            cmd.setInt(6,ofe.getId());
            
            
            if (cmd.executeUpdate() > 0){
                
                return 1;   
            }else{
                return -1;  
            }
        } catch (SQLException e) {
            System.err.println("ERRO: " + e.getMessage());
            return -1;
        }finally{
            Conect.desconectar(con);
        }
    }  
    
}
