package tecazuay.eduv.ec.models.POJO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sucursal {
    private String codigo_sucursal;
    private String nombre_sucursal;
    private Ciudad codigo_ciudad;
}
