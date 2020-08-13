package gt.edu.umg.consultaEstudianteCurso.Controller;
import java.util.*;
import gt.edu.umg.consultaEstudianteCurso.Modelo.EstudianteEntity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class EstudiantesDAO {

    public EstudianteEntity getSqlSelect() {
        EstudianteEntity student =new EstudianteEntity();
        List<String> listid = new ArrayList<>();
        List<String> listname = new ArrayList<>();
        List<String> listsurname = new ArrayList<>();
        List<String> listeemail = new ArrayList<>();
        List<String> listabirth = new ArrayList<>();
        List<String> listaesid= new ArrayList<>();
        List<String> listaephone1= new ArrayList<>();
        List<String> listaephone2= new ArrayList<>();
        List<String> listadres1= new ArrayList<>();
        List<String> listadres2= new ArrayList<>();
        try{
            EstudianteEntity estudiantesql= new EstudianteEntity();
            Conexion newconnection=new Conexion();
            Connection conection =newconnection.conectar();
            Statement consulta = conection.createStatement();
            ResultSet resultado = consulta.executeQuery ("SELECT id_student,name,surname,email,birthdate,student_id,phone1,phone2,address1,address2 FROM t2_student LIMIT 1000");

            while (resultado.next()){
                listid.add(String.valueOf(resultado.getInt("id_student")));
                listname.add(String.valueOf(resultado.getString("name")));
                listsurname.add(String.valueOf(resultado.getString("surname")));
                listeemail.add(String.valueOf(resultado.getString("email")));
                listabirth.add(String.valueOf(resultado.getString("birthdate")));
                listaesid.add(String.valueOf(resultado.getString("student_id")));
                listaephone1.add(String.valueOf(resultado.getString("phone1")));
                listaephone2.add(String.valueOf(resultado.getString("phone2")));
                listadres1.add(String.valueOf(resultado.getString("address1")));
                listadres2.add(String.valueOf(resultado.getString("address2")));

            }
            conection.close();
        }
        catch (Exception e){
            e.printStackTrace();
            ;
        }
        student.setId_student(listid);
        student.setName(listname);
        student.setSurname(listsurname);
        student.setEmail(listeemail);
        student.setBirthdate(listabirth);
        student.setStudent_id(listaesid);
        student.setPhone1(listaephone1);
        student.setPhone2(listaephone2);
        student.setAddress1(listadres1);
        student.setAddress2(listadres2);
        return student;
    }

}
