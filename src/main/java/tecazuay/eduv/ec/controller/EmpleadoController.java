package tecazuay.eduv.ec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tecazuay.eduv.ec.models.POJO.Empleado;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/ver-cartas")
public class EmpleadoController {

    private final List<Empleado> listaEmpleados;

    @Autowired
    public EmpleadoController(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    @GetMapping("/carta-empleado")
    public String verCarta(Map<String, Object> model){

        model.put("empleados",listaEmpleados);
        model.put("titulo", "Ver cartas empleados");

        return "index";
    }
}
