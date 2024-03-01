package tecazuay.eduv.ec.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import tecazuay.eduv.ec.models.POJO.Ciudad;
import tecazuay.eduv.ec.models.POJO.Sucursal;
import tecazuay.eduv.ec.service.interfaces.ISucursalService;

@Service
public class SucursalServiceImpl implements ISucursalService {

    @Value("${spring.sucursal.nombre-sucursal-centro}")
    private String nombreA;

    @Value("${spring.sucursal.nombre-sucursal-norte}")
    private String nombreB;

    @Value("${spring.sucursal.nombre-sucursal-dorado}")
    private String nombreC;

    @Autowired
    private CiudadServiceImpl ciudadService;

    @Override
    public Sucursal cargarSucursalA() {
        return new Sucursal("CTR01",nombreA, ciudadService.cargarCiudadC());
    }

    @Override
    public Sucursal cargarSucursalB() {
        return new Sucursal("NTE01",nombreB,ciudadService.cargarCiudadA());
    }

    @Override
    public Sucursal cargarSucursalC() {
        return new Sucursal("DOR01",nombreC,ciudadService.cargarCiudadB());
    }
}
