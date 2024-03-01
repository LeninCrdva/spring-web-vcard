package tecazuay.eduv.ec.models.POJO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tecazuay.eduv.ec.models.utils.Horario;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Empleado {
    private String nombre_empleado;
    private Ciudad ciudad_empleado;
    private Sucursal sucursal_empleado;
    private Horario horario_empleado;
    private String urlPhoto;
    private String email_empleado;
    private String cargo_empleado;
    private String telefono_empleado;
    private String pagina_web_empleado;
}
