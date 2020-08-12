package gt.edu.umg.consultaEstudianteCurso.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DataController {

    @GetMapping("/cursos")
    public String tablaEstudiantes(Model model) {
        return "cursos";
    }
}
