package tecazuay.eduv.ec.service.interfaces;

import org.springframework.beans.factory.annotation.Value;
import tecazuay.eduv.ec.models.POJO.Ciudad;
import tecazuay.eduv.ec.models.POJO.Sucursal;

public interface ISucursalService {

    public Sucursal cargarSucursalA();
    public Sucursal cargarSucursalB();
    public Sucursal cargarSucursalC();
}
