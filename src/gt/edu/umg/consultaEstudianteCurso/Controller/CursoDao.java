package gt.edu.umg.consultaEstudianteCurso.Controller;

import gt.edu.umg.consultaEstudianteCurso.Modelo.CursosEntity;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;


/**
 * 
 */
public class CursoDao {
    public CursosEntity getSqlSelect(String consultas) {

        try{
            CursosEntity cursos= new CursosEntity();
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