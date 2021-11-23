
package Controller;

import java.sql.Connection;


public class ConectTest {
    public static void main(String[] args) {
        //Conectar no SGBD
        Connection con = Conect.conectar();
        if ( con != null){
            System.out.println("Conexão realizada com sucesso!");
            Conect.desconectar(con);
        }
    }
}
