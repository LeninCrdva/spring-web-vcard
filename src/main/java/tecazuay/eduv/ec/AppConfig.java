package tecazuay.eduv.ec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tecazuay.eduv.ec.models.POJO.Ciudad;
import tecazuay.eduv.ec.models.POJO.Empleado;
import tecazuay.eduv.ec.models.POJO.Sucursal;
import tecazuay.eduv.ec.service.impl.EmpleadoServiceImpl;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    @Autowired
    private EmpleadoServiceImpl empleadoService;

    @Bean
    public List<Empleado> registrarEmpleados(){
        return Arrays.asList(empleadoService.cargarEmpleadoA(),
                empleadoService.cargarEmpleadoB(),
                empleadoService.cargarEmpleadoC());
    }
}
