package gt.edu.umg.consultaEstudianteCurso.Controller;

import gt.edu.umg.consultaEstudianteCurso.Modelo.CursosEntity;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 */
public class CursoDao {
    public CursosEntity getSqlSelect(String consultas) {
        CursosEntity curso = new CursosEntity();
        List<String> id = new ArrayList<>();
        List<String> name = new ArrayList<>();
        List<String> descripcion = new ArrayList<>();
        try{
            CursosEntity cursos= new CursosEntity();
            Conexion newconnection=new Conexion();
            Connection conection =newconnection.conectar();
            Statement consulta = conection.createStatement();
            ResultSet resultado = consulta.executeQuery ("SELECT id_course,name,description FROM t2_course LIMIT 40");

            while (resultado.next()){
                id.add(resultado.getString("id_course"));
                name.add(resultado.getString("name"));
                descripcion.add(String.valueOf(resultado.getString("description")));
            }
            conection.close();
        }
        catch (Exception e){
            e.printStackTrace();

        }
        curso.setIdCurso(id);
        curso.setName(name);
        curso.setDescripcion(descripcion);
        return curso;
    }
}