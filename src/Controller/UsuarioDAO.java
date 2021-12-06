
package Controller;

import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class UsuarioDAO {
    
    private final Connection con;
    private PreparedStatement cmd;

    
    
    public UsuarioDAO() {
        this.con = Conect.conectar();
    }
    
    
    public boolean login(String cpf, String senha){
        
    try {

        String SQL="select * from tb_user where "
                + "cpf=md5(?) and senha=md5(?)";

        cmd = con.prepareStatement(SQL);
        cmd.setString(1, cpf);
        cmd.setString(2, senha);
        
        
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
    
    public int inserir(Usuario us){
        try {
            String SQL = "insert into tb_user "
                       + "(nome,email,cpf,telefone,data_nasc,senha,saldo) values (?,?,md5(?),?,?,md5(?),?)";
            
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, us.getNome());
            cmd.setString(2, us.getEmail());
            cmd.setString(3, us.getCpf());
            cmd.setString(4, us.getTelefone());
            cmd.setString(5, us.getData());
            cmd.setString(6, us.getSenha());
            cmd.setDouble(7, 0);
            
            if (cmd.executeUpdate() > 0){
                ResultSet rs = cmd.getGeneratedKeys();
                return 1;   //OK
            }else{
                return -1;  // ERRO
            }
        } catch (SQLException e) {
            System.err.println("ERRO1: " + e.getMessage());
            return -1;
        }finally{
            Conect.desconectar(con);
        }
    }
    
    //
    // ATUALIZAR
    //
    public int atualizar(Usuario us){
        try {
            String SQL = "update tb_user set nome=?, email=?, telefone=?, data_nasc=?, saldo=? where cpf=md5(?)";

            cmd = con.prepareStatement(SQL);
            cmd.setString(1, us.getNome());
            cmd.setString(2, us.getEmail());
            cmd.setString(3, us.getTelefone());
            cmd.setString(4, us.getData());
            cmd.setDouble(5, us.getSaldo());
            cmd.setString(6, us.getCpf());
            
            //envia a instrução SQL para o banco
            if (cmd.executeUpdate() > 0){
                //operação realizada com sucesso
                return 1;   //OK
            }else{
                return -1;  // ERRO
            }
        } catch (SQLException e) {
            System.err.println("ERRO3: " + e.getMessage());
            return -1;
        }finally{
            Conect.desconectar(con);
        }
    }    
    
    public Usuario pesquisarCpfSenha(String cpf, String senha){
        try {
            String SQL="select * from tb_user where "
                + "cpf=md5(?) and senha=md5(?)";

            cmd = con.prepareStatement(SQL);
            cmd.setString(1, cpf);
            cmd.setString(2, senha);


            ResultSet rs = cmd.executeQuery();
            if (rs.next()){
                Usuario us = new Usuario();
                us.setNome(rs.getString("nome"));
                us.setEmail(rs.getString("email"));
                us.setCpf(cpf);
                us.setTelefone(rs.getString("telefone"));
                us.setData(rs.getString("data_nasc"));
                us.setSenha(senha);
                us.setSaldo(rs.getDouble("saldo"));
                return us;
            }else{
                return null;
            }
            
            

        } catch (Exception e) {
            System.err.println("ERRO2: " + e.getMessage());
            return null;
        }
 
    }
    
    public Usuario pesquisarCpf(String cpf){
        try {
            String SQL="select * from tb_user where "
                + "cpf=md5(?)";

            cmd = con.prepareStatement(SQL);
            cmd.setString(1, cpf);


            ResultSet rs = cmd.executeQuery();
            if (rs.next()){
                Usuario us = new Usuario();
                us.setNome(rs.getString("nome"));
                us.setEmail(rs.getString("email"));
                us.setCpf(cpf);
                us.setTelefone(rs.getString("telefone"));
                us.setData(rs.getString("data_nasc"));
                us.setSaldo(rs.getDouble("saldo"));
                return us;
            }else{
                return null;
            }
            
            

        } catch (Exception e) {
            System.err.println("ERRO2: " + e.getMessage());
            return null;
        }
 
    }
    
    public List<Usuario> confere(){
        try {
            String SQL = "select * from tb_user";
            cmd = con.prepareStatement(SQL);
            
            //executar a consulta
            List<Usuario> lista = new ArrayList<>();
            ResultSet rs = cmd.executeQuery();
            while (rs.next()){
                Usuario emp = new Usuario();
                emp.setNome(rs.getString("nome"));
                emp.setEmail(rs.getString("email"));
                emp.setCpf("");
                emp.setTelefone(rs.getString("telefone"));
                emp.setData(rs.getString("data_nasc"));
                emp.setSenha("");
                emp.setSaldo(0);
                lista.add(emp);
            }
            if(lista.size()>=1)
            {
                return lista;
            }
            else
            {
                return null;
            }
            
        } catch (SQLException e) {
            System.err.println("ERRO: " + e.getMessage());
            return null;
        }finally{
            Conect.desconectar(con);
        }
    }

    
       
    
    
}
