package tecazuay.eduv.ec.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import tecazuay.eduv.ec.models.POJO.Ciudad;
import tecazuay.eduv.ec.service.interfaces.ICiudadSerice;

@Service
public class CiudadServiceImpl implements ICiudadSerice {

    @Value("${spring.ciudad.nombre-ciudad-a}")
    private String ciudad_a;

    @Value("${spring.ciudad.nombre-ciudad-b}")
    private String ciudad_b;

    @Value("${spring.ciudad.nombre-ciudad-c}")
    private String ciudad_c;

    @Override
    public Ciudad cargarCiudadA() { return new Ciudad("010101",ciudad_a); }

    @Override
    public Ciudad cargarCiudadB() {
        return new Ciudad("010108", ciudad_b);
    }

    @Override
    public Ciudad cargarCiudadC() {
        return new Ciudad("010303", ciudad_c);
    }
}
