package gt.edu.umg.consultaEstudianteCurso.Controller;

import gt.edu.umg.consultaEstudianteCurso.Modelo.EstudianteEntity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class EstudiantesDAO {
    public EstudianteEntity getSqlSelect(String consultas) {

        try{
            EstudianteEntity estudiantesql= new EstudianteEntity();
            Conexion newconnection=new Conexion();
            Connection conection =newconnection.conectar();
            Statement consulta = conection.createStatement();
            ResultSet resultado = consulta.executeQuery ("SELECT id_student,name,surname FROM t2_student LIMIT 40");

            while (resultado.next()){
                //guardarenentity
            }
            conection.close();
        }
        catch (Exception e){
            e.printStackTrace();
            ;
        }
        return null;//retornarentity;
    }

}
