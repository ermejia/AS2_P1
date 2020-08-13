package gt.edu.umg.consultaEstudianteCurso.Controller;

import gt.edu.umg.consultaEstudianteCurso.Modelo.CursosEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CursosController {

    @RequestMapping("/cursos")
    public String formularioPeticiones(Model model) {
        CursosEntity order = new CursosEntity();
        CursoDao build = new CursoDao();
        order = build.getSqlSelect("hola");
        model.addAttribute("data", order);
        return "cursos";
    }
}
