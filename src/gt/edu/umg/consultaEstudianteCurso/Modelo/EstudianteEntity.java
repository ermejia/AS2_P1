package gt.edu.umg.consultaEstudianteCurso.Modelo;
import java.util.*;
public class EstudianteEntity {
    private List<String> id_student;
    private List<String>  name;
    private List<String>  surname;
    private List<String>  email;
    private List<String>  birthdate;
    private List<String>  student_id;
    private List<String>  phone1;
    private List<String>  phone2;
    private List<String>  address1;
    private List<String>  address2;

    public List<String> getId_student() { return id_student; }

    public void setId_student(List<String> id_student) { this.id_student = id_student; }

    public List<String> getName() { return name; }

    public void setName(List<String> name) { this.name = name; }

    public List<String> getSurname() { return surname; }

    public void setSurname(List<String> surname) { this.surname = surname; }

    public List<String> getEmail() { return email; }

    public void setEmail(List<String> email) { this.email = email; }

    public List<String> getBirthdate() { return birthdate; }

    public void setBirthdate(List<String> birthdate) { this.birthdate = birthdate; }

    public List<String> getStudent_id() { return student_id; }

    public void setStudent_id(List<String> student_id) { this.student_id = student_id; }

    public List<String> getPhone1() { return phone1; }

    public void setPhone1(List<String> phone1) { this.phone1 = phone1; }

    public List<String> getPhone2() { return phone2; }

    public void setPhone2(List<String> phone2) { this.phone2 = phone2; }

    public List<String> getAddress1() { return address1; }

    public void setAddress1(List<String> address1) { this.address1 = address1; }

    public List<String> getAddress2() { return address2; }

    public void setAddress2(List<String> address2) { this.address2 = address2; }
}
