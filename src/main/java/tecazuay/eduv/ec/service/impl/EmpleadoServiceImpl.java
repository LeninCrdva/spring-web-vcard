package tecazuay.eduv.ec.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import tecazuay.eduv.ec.models.POJO.Ciudad;
import tecazuay.eduv.ec.models.POJO.Empleado;
import tecazuay.eduv.ec.models.POJO.Sucursal;
import tecazuay.eduv.ec.models.utils.Horario;
import tecazuay.eduv.ec.service.interfaces.IEmpleadoService;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

    @Autowired
    private CiudadServiceImpl ciudadService;

    @Autowired
    private SucursalServiceImpl sucursalService;

    @Value("${spring.person.nombre-completo-a}")
    private String nombre_persona_a;

    @Value("${spring.person.nombre-completo-b}")
    private String nombre_persona_b;

    @Value("${spring.person.nombre-completo-c}")
    private String nombre_persona_c;

    @Value("${spring.person.email-a}")
    private String email_persona_a;

    @Value("${spring.person.email-b}")
    private String email_persona_b;

    @Value("${spring.person.email-c}")
    private String email_persona_c;

    @Value("${spring.person.picture-a}")
    private String foto_persona_a;

    @Value("${spring.person.picture-b}")
    private String foto_persona_b;

    @Value("${spring.person.picture-c}")
    private String foto_persona_c;

    @Value("${spring.person.telefono-a}")
    private String telefono_persona_a;

    @Value("${spring.person.telefono-b}")
    private String telefono_persona_b;

    @Value("${spring.person.telefono-c}")
    private String telefono_persona_c;

    @Value("${spring.person.web-a}")
    private String web_a;

    @Value("${spring.person.web-b}")
    private String web_b;

    @Value("${spring.person.web-c}")
    private String web_c;

    @Value("${spring.person.cargo-a}")
    private String cargo_a;

    @Value("${spring.person.cargo-b}")
    private String cargo_b;

    @Value("${spring.person.cargo-c}")
    private String cargo_c;

    @Override
    public Empleado cargarEmpleadoA() {
        return new Empleado(nombre_persona_a,ciudadService.cargarCiudadA(), sucursalService.cargarSucursalA(),
                Horario.LUNES_A_VIERNES, foto_persona_a, email_persona_a, cargo_a,
                telefono_persona_a, web_a);
    }

    @Override
    public Empleado cargarEmpleadoB() {
        return new Empleado(nombre_persona_b, ciudadService.cargarCiudadB(), sucursalService.cargarSucursalB(),
                Horario.LUNES_A_DOMINGO, foto_persona_b, email_persona_b, cargo_b,
                telefono_persona_b, web_b);
    }

    @Override
    public Empleado cargarEmpleadoC() {
        return new Empleado(nombre_persona_c,ciudadService.cargarCiudadC(), sucursalService.cargarSucursalC(),
                Horario.LUNES_A_SABADO, foto_persona_c, email_persona_c, cargo_c,
                telefono_persona_c, web_c);
    }
}
