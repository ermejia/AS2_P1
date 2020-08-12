package gt.edu.umg.consultaEstudianteCurso.Modelo;

import java.util.List;

public class CursosEntity {
    private List<String> idCurso;
    private List<String> name;
    private List<String> descripcion;

    public List<String> getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(List<String> idCurso) {
        this.idCurso = idCurso;
    }

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public List<String> getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(List<String> descripcion) {
        this.descripcion = descripcion;
    }
}
