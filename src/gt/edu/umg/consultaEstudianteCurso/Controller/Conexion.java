package gt.edu.umg.consultaEstudianteCurso.Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion{

    private Connection conexion = null;
    private Statement stm = null;

    public Conexion() {
    }

    public Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://192.185.4.65:3306/jbarilla_ingsoftware?serverTimezone=UTC", "jbarilla_estudia", "2Ui!OssHDQGv");
        } catch (Exception e) {
        }
        return conexion;
    }

    public void desconectar() {

        try {
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
