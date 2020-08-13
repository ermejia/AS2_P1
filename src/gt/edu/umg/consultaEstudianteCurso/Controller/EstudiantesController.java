package gt.edu.umg.consultaEstudianteCurso.Controller;

import gt.edu.umg.consultaEstudianteCurso.Modelo.CursosEntity;
import gt.edu.umg.consultaEstudianteCurso.Controller.CursoDao;
import gt.edu.umg.consultaEstudianteCurso.Modelo.EstudianteEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EstudiantesController {
    @RequestMapping("/estudiantes")
    public String formularioEstudiantes(Model model) {
        EstudianteEntity student=new EstudianteEntity();
        EstudiantesDAO build=new EstudiantesDAO();
        student= build.getSqlSelect();
        model.addAttribute("dataes", student);
        return "estudiantes";
    }
}
